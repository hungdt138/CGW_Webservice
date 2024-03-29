/**
 * 
 */
package com.elcom.iwebservice;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.crm.kernel.message.Constants;
import com.crm.provisioning.message.CommandMessage;
import com.crm.util.AppProperties;

/**
 * @author hungdt
 * 
 */
public class ChargingWebserviceImpl extends ChargingWebserviceBase
{
	protected static Logger	log	= Logger.getLogger(ChargingWebserviceImpl.class);

	protected ResponseBase updateResponse(ResponseBase response,
			CommandMessage result)
	{
		if (result != null)
		{
			int cause = getErrorCode(result.getStatus(), result.getCause());

			response.setResult(cause);
			response.setDetail(getErrorDetail(cause, result.getCause()));
		}

		return response;
	}

	@Override
	public ExtDebitResp ExtDebit(ExtDebitReq req)
	{
		String service = "ExtDebit";

		String sessionId = getSessionId(true);
		log.info("REQ: sessionId = " + sessionId + " | " + req.toString());

		ExtDebitResp resp = new ExtDebitResp();

		resp.setMsisdn(req.getBNumber());

		try
		{
			if (!req.getServiceState().equals("U")
					&& !req.getServiceState().equals("D"))
			{
				resp.setResult(ErrorCode.E_INVALID_CONDITION);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			// validate parameter CPNAME, DESC, CPID

			if (req.getCPName() == null || req.getCPName().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_CONDITION);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (req.getDesc() == null || req.getDesc().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_CONDITION);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (req.getCPId() == null || req.getCPId().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_CONDITION);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = "CHARGGW_" + req.getANumber();
			String shortCode = req.getANumber();

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getBNumber());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);
			message.setCont_type(Integer.parseInt(req.getContType()));
			message.setCgwStatus(req.getServiceState());
			message.setCont_code(Integer.parseInt(req.getContCode()));
			message.setCont_prov_id(Integer.parseInt(req.getCPId()));
			message.setCont_prov_name(req.getCPName());
			if (req.getServiceState().equals("U"))
			{
				// Case U: refund.
				message.setDescription(req.getCPName() + ",B_Number=" + req.getANumber());
			}
			else if (req.getServiceState().equals("D"))
			{
				// Case D: charging
				message.setDescription(req.getCPName() + ",A_Number=" + req.getANumber());
			}

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);
		} finally
		{
			log.info("RESP: sessionId = " + sessionId + " | " + resp.toString());
		}

		return resp;

	}

	@Override
	public AddBalanceResp AddBalance(AddBalanceReq req)
	{
		String service = "AddBalance";
		String prefix = "balance.charging" + "."
				+ req.getBalance().toLowerCase();

		String sessionId = getSessionId(false);
		// infoMonitor("REQ: sessionId = " + sessionId + " | " +
		// req.toString());

		AddBalanceResp resp = new AddBalanceResp();

		resp.setMsisdn(req.getMsisdn());

		try
		{
			if (req.getAddValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if ((req.getBalance().equals("")))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getMsisdn());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);

			AppProperties app = new AppProperties();

			app.setString("balances", req.getBalance());
			app.setDouble(prefix + "." + "amount", req.getAddValue());
			app.setString(prefix + "." + "type", "add");

			message.setParameters(app);

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);

			resp.setAddValue(req.getAddValue());
			resp.setBalance(req.getBalance());
		} finally
		{
			// infoMonitor("RESP: sessionId = " + sessionId + " | " +
			// resp.toString());
		}

		return resp;
	}

	@Override
	public ChangeStateResp ChangeState(ChangeStateReq req)
	{
		String service = "ChangeState";
		String[] state = { "Active", "Suspended(S1)", "Disabled(S2)",
				"Retired(S3)", "Idle", "Deleted" };

		String sessionId = getSessionId(false);

		log.info("REQ: sessionId = " + sessionId + " | " + req.toString());

		ChangeStateResp resp = new ChangeStateResp();

		resp.setMsisdn(req.getMsisdn());

		List<String> lst = Arrays.asList(state);

		try
		{
			if (!lst.contains(req.getState()))
			{
				resp.setResult(ErrorCode.E_INVALID_STATE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getMsisdn());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);

			AppProperties app = new AppProperties();

			app.setString("state", req.getState());

			message.setParameters(app);

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);

			resp.setState(req.getState());
		} finally
		{
			log.info("REQ: sessionId = " + sessionId + " | " + resp.toString());
		}

		return resp;
	}

	@Override
	public ChangeExpiredDateResp ChangeExpiredDate(ChangeExpiredDateReq req)
	{
		String service = "ChangeExpiredDate";
		String prefix = "balance.charging" + "."
				+ req.getBalance().toLowerCase();

		String sessionId = getSessionId(false);

		log.info("REQ: sessionId = " + sessionId + " | " + req.toString());

		ChangeExpiredDateResp resp = new ChangeExpiredDateResp();

		resp.setMsisdn(req.getMsisdn());

		try
		{
			if (!req.getExpiredDate().startsWith("+")
					&& !req.getExpiredDate().startsWith("-"))
			{
				if (!isValidDate(req.getExpiredDate()))
				{
					resp.setResult(ErrorCode.E_INVALID_EXPIRATEDDATE);
					resp.setDetail(getErrorDetail(resp.getResult(), ""));

					return resp;
				}
			}
			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getMsisdn());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);

			AppProperties app = new AppProperties();

			app.setString("balances", req.getBalance());
			app.setString(prefix + ".expirate", req.getExpiredDate());
			app.setString(prefix + "." + "type", "expirate");

			message.setParameters(app);

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);

			resp.setExpiredDate(req.getExpiredDate());
			resp.setBalance(req.getBalance());
		} finally
		{
			log.info("RESP: sessionId = " + sessionId + " | " + resp.toString());
		}

		return resp;
	}

	@Override
	public DeductBalanceResp DeductBalance(DeductBalanceReq req)
	{
		String service = "DeductBalance";
		String prefix = "balance.charging" + "."
				+ req.getBalance().toLowerCase();

		String sessionId = getSessionId(false);

		log.info("REQ: sessionId = " + sessionId + " | " + req.toString());

		DeductBalanceResp resp = new DeductBalanceResp();

		resp.setMsisdn(req.getMsisdn());

		try
		{
			if (req.getDeductValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if ((req.getBalance().equals("")))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getMsisdn());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);

			AppProperties app = new AppProperties();

			app.setString("balances", req.getBalance());
			app.setDouble(prefix + "." + "amount", req.getDeductValue());
			app.setString(prefix + "." + "type", "deduct");

			message.setParameters(app);

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);

			resp.setDeductValue(req.getDeductValue());
			resp.setBalance(req.getBalance());
		} finally
		{
			log.info("RESP: sessionId = " + sessionId + " | " + resp.toString());
		}

		return resp;
	}

	@Override
	public SetBalanceResp SetBalance(SetBalanceReq req)
	{
		String service = "SetBalance";
		String prefix = "balance.charging" + "."
				+ req.getBalanceName().toLowerCase();

		String sessionId = getSessionId(false);

		log.info("REQ: sessionId = " + sessionId + " | " + req.toString());

		SetBalanceResp resp = new SetBalanceResp();

		resp.setMsisdn(req.getMsisdn());

		try
		{
			if (req.getValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if ((req.getBalanceName().equals("")))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			if (!authenticate(req.getUserName(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setIsdn(req.getMsisdn());
			message.setKeyword(command);
			message.setServiceAddress(shortCode);

			AppProperties app = new AppProperties();

			app.setString("balances", req.getBalanceName());
			app.setDouble(prefix + "." + "amount", req.getValue());
			app.setString(prefix + "." + "type", "set");

			message.setParameters(app);

			CommandMessage result = sendOrder(message, req);

			updateResponse(resp, result);

			resp.setValue(req.getValue());
			resp.setBalance(req.getBalanceName());
		} finally
		{
			log.info("RESP: sessionId = " + sessionId + " | " + resp.toString());
		}

		return resp;
	}

	@Override
	public SubscriberRetrieveResp RetrieveSubscriber(SubscriberRetrieveReq req)
	{
		log.info(req);
		String service = "RetrieveSubscriber";
		String sessionId = getSessionId(false);

		SubscriberRetrieveResp resp = new SubscriberRetrieveResp();

		resp.setMsisdn(req.getMsisdn());

		try
		{
			if (!authenticate(req.getUsername(), req.getPassword(), service))
			{
				resp.setResult(ErrorCode.E_INVALID_USERPASS);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));

				return resp;
			}

			String command = getCommand(service);
			String shortCode = getShortCode(service);

			CommandMessage message = new CommandMessage();

			message.setCorrelationID(sessionId);
			message.setUserId(0);
			message.setUserName(req.getUsername());
			message.setIsdn(req.getMsisdn());
			message.setChannel(Constants.CHANNEL_WEB);

			message.setServiceAddress(shortCode);
			message.setKeyword(command);

			CommandMessage result = sendOrder(message, sessionId, 0);

			resp.setSubType(result.getSubscriberType());

			if (result.getStatus() == Constants.ORDER_STATUS_APPROVED)
			{
				if (result.getSubscriberType() == Constants.PREPAID_SUB_TYPE)
				{
					PrepaidSubsInfo info = getPrepaidSubInfo(result);
					resp.setPreInfo(info);
				}
				else if (result.getSubscriberType() == Constants.POSTPAID_SUB_TYPE)
				{
					// PostpaidSubsInfo info = getPospaidSubInfo(result);
					// resp.setPostInfo(info);

				}
			}

			if (result != null)
			{
				if (result.getSubscriberType() == Constants.POSTPAID_SUB_TYPE)
				{
					// response error
					int cause = 2;
					resp.setResult(cause);
					resp.setDetail((new ErrorCode()).getErrorDetail(cause));
				}
				else
				{
					int cause = getErrorCode(result.getStatus(),
							result.getCause());
					resp.setResult(cause);
					resp.setDetail(getErrorDetail(cause, result.getCause()));
				}

			}
		} finally
		{
			log.info(resp);
		}

		return resp;
	}
}
