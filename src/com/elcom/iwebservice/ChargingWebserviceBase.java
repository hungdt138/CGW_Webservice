/**
 * 
 */
package com.elcom.iwebservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueSession;

import org.apache.log4j.Logger;

import com.crm.kernel.message.Constants;
import com.crm.kernel.queue.QueueFactory;
import com.crm.kernel.sql.Database;
import com.crm.provisioning.impl.charging.ChargingConstants;
import com.crm.provisioning.message.CommandMessage;
import com.crm.provisioning.util.ResponseConstants;
import com.crm.util.GeneratorSeq;
import com.crm.util.StringPool;
import com.crm.util.StringUtil;
import com.crm.util.User;
import com.crm.util.WSConfiguration;
import com.crm.util.WSSecurity;

import com.fss.util.AppException;

/**
 * @author hungdt
 * 
 */
public abstract class ChargingWebserviceBase implements ChargingService
{
	protected static Logger	log	= Logger.getLogger(ChargingWebserviceBase.class);

	public ChargingWebserviceBase()
	{
		try
		{
			WSConfiguration.getConfiguration();
		}
		catch (Exception e)
		{
			log.error(e, e);
		}
	}

	protected void debugMonitor(Object e)
	{
		if (e instanceof Exception)
		{
			log.error(e, (Exception) e);
		}
		else
		{
			log.debug(e);
		}
	}

	protected void infoMonitor(Object e)
	{
		if (e instanceof Exception)
		{
			log.error(e, (Exception) e);
		}
		else
		{
			log.info(e);
		}
	}

	protected String getRequest(String sessionId, RequestBase request)
	{
		StringBuilder sbLog = new StringBuilder();

		sbLog.append(sessionId);
		sbLog.append(",ACCOUNT=");
		sbLog.append(WSConfiguration.getConfiguration().getChargingAccount());

		if (request instanceof SetBalanceReq)
		{
			SetBalanceReq setBalanceReq = (SetBalanceReq) request;

			sbLog.append(",MDN=");
			sbLog.append(setBalanceReq.getMsisdn());

			if (setBalanceReq.getBalanceName().equals(""))
			{
				// Note: De co loi: Khi client nhap -1000 ==> --1000 ==> Loi
				sbLog.append(",BALANCE=");
				sbLog.append(setBalanceReq.getValue());
			}
			else
			{
				sbLog.append(",BALANCE.");
				sbLog.append(setBalanceReq.getBalanceName());
				sbLog.append("=");
				sbLog.append(setBalanceReq.getValue());
			}
		}
		else if (request instanceof AddBalanceReq)
		{
			AddBalanceReq addBalanceReq = (AddBalanceReq) request;

			sbLog.append(",MDN=");
			sbLog.append(addBalanceReq.getMsisdn());

			if (addBalanceReq.getBalance().equals(""))
			{
				// Note: De co loi: Khi client nhap -1000 ==> --1000 ==> Loi
				sbLog.append(",BALANCE=+");
				sbLog.append(addBalanceReq.getAddValue());
			}
			else
			{
				sbLog.append(",BALANCE.");
				sbLog.append(addBalanceReq.getBalance());
				sbLog.append("=+");
				sbLog.append(addBalanceReq.getAddValue());
			}
		}
		else if (request instanceof DeductBalanceReq)
		{
			DeductBalanceReq deductBalanceReq = (DeductBalanceReq) request;

			sbLog.append(",MDN=");
			sbLog.append(deductBalanceReq.getMsisdn());

			if (deductBalanceReq.getBalance().equals(""))
			{
				// Note: De co loi: Khi client nhap -1000 ==> --1000 ==> Loi
				sbLog.append(",BALANCE=-");
				sbLog.append(deductBalanceReq.getDeductValue());
			}
			else
			{
				sbLog.append(",BALANCE.");
				sbLog.append(deductBalanceReq.getBalance());
				sbLog.append("=-");
				sbLog.append(deductBalanceReq.getDeductValue());
			}
		}
		else if (request instanceof ChangeStateReq)
		{
			ChangeStateReq changeStateReq = (ChangeStateReq) request;

			sbLog.append(",MDN=");
			sbLog.append(changeStateReq.getMsisdn());
			sbLog.append(",STATE=");
			sbLog.append(changeStateReq.getState());
		}
		else if (request instanceof ChangeExpiredDateReq)
		{
			ChangeExpiredDateReq changeExpiredDateReq = (ChangeExpiredDateReq) request;

			sbLog.append(",MDN=");
			sbLog.append(changeExpiredDateReq.getMsisdn());

			if (changeExpiredDateReq.getBalance().equals(""))
			{
				sbLog.append(",EXPIREDATE=");
				sbLog.append(changeExpiredDateReq.getExpiredDate());
			}
			else
			{
				sbLog.append(",EXPIREDATE.");
				sbLog.append(changeExpiredDateReq.getBalance());
				sbLog.append("=");
				sbLog.append(changeExpiredDateReq.getExpiredDate());
			}
		}
		else if (request instanceof ExtDebitReq)
		{
			ExtDebitReq extDebitReq = (ExtDebitReq) request;

			sbLog.append(ChargingConstants.FIELD_TRANSACTION_ID);
			sbLog.append(sessionId);
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_TRANSACTION_DATETIME);
			sbLog.append(extDebitReq.getTransDateTime());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_CP_ID);
			sbLog.append(extDebitReq.getCPId());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_CP_NAME);
			sbLog.append(extDebitReq.getCPName());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_NUMBER_A);
			sbLog.append(extDebitReq.getANumber());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_NUMBER_B);
			sbLog.append(extDebitReq.getBNumber());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_SUBMIT_TIME);
			sbLog.append(extDebitReq.getSubmitTime());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_SERVICE_STATE);
			sbLog.append(extDebitReq.getServiceState());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_SENT_TIME);
			sbLog.append(extDebitReq.getSentTime());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_CONTENT_CODE);
			sbLog.append(extDebitReq.getContCode());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_CONTENT_TYPE);
			sbLog.append(extDebitReq.getContType());
			sbLog.append(ChargingConstants.SEPARATOR_FIELD);
			sbLog.append(ChargingConstants.FIELD_DESCRIPTION);
			sbLog.append(extDebitReq.getDesc());
		}

		return sbLog.toString();
	}

	protected String getSessionId(boolean hexa)
	{
		int sequence = GeneratorSeq.getNextSeq();

		if (hexa)
		{
			String hex = Integer.toHexString(sequence).toUpperCase();

			while (hex.length() < 8)
			{
				hex = "0" + hex;
			}

			hex = "0x" + hex;

			return hex;
		}
		else
		{
			return String.valueOf(sequence);
		}
	}

	public CommandMessage sendOrder(Object request, String correlationId, long timeout)
	{
		if (timeout <= 0)
		{
			timeout = 30000;
		}

		long startTime = System.currentTimeMillis();

		QueueSession session = null;
		MessageProducer producer = null;
		MessageConsumer consumer = null;
		Message message = null;

		CommandMessage response = null;

		if (request instanceof CommandMessage)
		{
			response = (CommandMessage) request;
		}
		else
		{
			response = new CommandMessage();
		}

		try
		{
			Queue sendQueue = QueueFactory.getQueue(QueueFactory.ORDER_REQUEST_QUEUE);
			Queue waitQueue = QueueFactory.getQueue(QueueFactory.ORDER_RESPONSE_QUEUE);

			session = QueueFactory.getSession();
			message = QueueFactory.createObjectMessage(session, request);
			producer = session.createProducer(sendQueue);

			if (!correlationId.equals(""))
			{
				consumer = session.createConsumer(waitQueue, "JMSCorrelationID = '" + correlationId + "'");
			}
			try
			{
			long beforeSend = System.currentTimeMillis();
			producer.send(message);
			long afterSend = System.currentTimeMillis();
			log.info("Costime send:" + (afterSend - beforeSend) + ((afterSend - beforeSend) > 20? " high ":" low ") + 
					 "for sessionId = '" + correlationId);
			}
			catch (Exception ex)
			{
				log.info("Send message error");
			}
			finally
			{
				QueueFactory.closeQueue(producer);
			}
			if (!correlationId.equals(""))
			{
				startTime = System.currentTimeMillis();
				long beforeReceive = System.currentTimeMillis();
				message = consumer.receive(timeout);
				long afterReceive = System.currentTimeMillis();
				
				log.info("Costime Receive:" + (afterReceive - beforeReceive) + ((afterReceive - beforeReceive) > 1150? " high ":" low ") + 
						 "for sessionId = '" + correlationId);				
			}

			Object content = QueueFactory.getContentMessage(message);

			if (content != null)
			{
				if (content instanceof CommandMessage)
				{
					response = (CommandMessage) content;
				}
				else
				{
					response.setStatus(Constants.ORDER_STATUS_DENIED);
					response.setCause(Constants.ERROR);
				}
			}
			else
			{
				response.setStatus(Constants.ORDER_STATUS_DENIED);
				response.setCause(Constants.ERROR_TIMEOUT);
			}

			// debugMonitor("cost time: " + (System.currentTimeMillis() -
			// startTime) + " for sessionId = " + correlationId);
			log.info("cost time: " + (System.currentTimeMillis() - startTime) + " for sessionId = " + correlationId);
		}
		catch (JMSException e)
		{
			debugMonitor(e);

			response.setStatus(Constants.ORDER_STATUS_DENIED);
			response.setCause(Constants.ERROR_CONNECTION);
		}
		catch (AppException e)
		{
			debugMonitor(e);

			response.setStatus(Constants.ORDER_STATUS_DENIED);
			response.setCause(e.getMessage());
		}
		catch (Exception e)
		{
			debugMonitor(e);

			response.setStatus(Constants.ORDER_STATUS_DENIED);
			response.setCause(Constants.ERROR_RESOURCE_BUSY);
		}
		finally
		{
			QueueFactory.closeQueue(consumer);
			//QueueFactory.closeQueue(producer);
			QueueFactory.closeQueue(session);
		}

		if ((response != null) && (response.getStatus() == Constants.ORDER_STATUS_DENIED))
		{
			log.error("sessionId = " + correlationId + ", timeout = " + timeout + " : " + response);
		}

		return response;
	}

	protected CommandMessage sendOrder(CommandMessage message, RequestBase request)
	{
		CommandMessage result = null;

		String sessionId = message.getCorrelationID();

		try
		{
			message.setUserId(0);
			message.setUserName(request.getUserName());
			message.setChannel(Constants.CHANNEL_WEB);

			String requestContent = getRequest(sessionId, request);

			message.setRequestValue(ResponseConstants.SESSION_ID, sessionId);
			message.setRequestValue(ResponseConstants.VALUE, requestContent);

			result = sendOrder(message, sessionId, request.getTimeout());
//			result = new CommandMessage();
//			result.setStatus(Constants.ORDER_STATUS_APPROVED);
//			result.setCause(Constants.SUCCESS);
//			Thread.sleep(1200);
			
		}
		catch (Exception e)
		{
			log.error(e);
		}

		if (result != null)
		{
			if (log.isDebugEnabled())
			{
				// log.debug("response: " + result.toString());
			}
		}
		else
		{
			log.error("request with sessionId = " + sessionId + " has response is null");
		}

		return result;
	}

	protected boolean authenticate(String username, String password, String action)
	{
		WSSecurity security = WSSecurity.getSecuriry();

		User user = security.authenticate(username, password);

		if (user == null)
		{
			return false;
		}
		if (!user.hasPermission(action))
		{
			return false;
		}

		return true;
	}

	protected String getCommand(String service)
	{
		return WSConfiguration.getConfiguration().getCommand(service);
	}

	protected String getShortCode(String service)
	{
		return WSConfiguration.getConfiguration().getShortCode(service);
	}

	protected Properties getProperties(String service)
	{
		return WSConfiguration.getConfiguration().getProperties(service);
	}

	protected String getErrorDetail(int code, String cause)
	{
		if (code != ErrorCode.E_FAILSE)
		{
			return (new ErrorCode()).getErrorDetail(code);
		}
		else
		{
			return cause;
		}
	}

	/**
	 * Get error code
	 * 
	 * @param status
	 * @param cause
	 * @return
	 */
	protected int getErrorCode(int status, String cause)
	{
		int code = ErrorCode.E_OK;

		if (status != Constants.ORDER_STATUS_APPROVED)
		{
			if (cause.equals(Constants.ERROR_TIMEOUT))
			{
				code = ErrorCode.E_SYSTEM_BUSY;
			}
			else if(cause.equals(Constants.ERROR_DENIED_STATUS))
			{
				code = ErrorCode.E_FAIL_TO_DEDUCT;
			}
			else if (cause.equals(Constants.ERROR_RESOURCE_BUSY))
			{
				code = ErrorCode.E_SYSTEM_BUSY;
			}
			else if (cause.equals(Constants.ERROR_CONNECTION))
			{
				code = ErrorCode.E_NOTCONNECT;
			}
			else if (cause.equals(Constants.ERROR_DENIED_SUBSCRIBER_TYPE))
			{
				code = ErrorCode.E_SUBCRIBER_NOT_FOUND;
			}
			else if (cause.equals(Constants.ERROR_INVALID_SYNTAX))
			{
				code = ErrorCode.E_INVALID_SYNTAX;
			}
			else if (cause.equals(Constants.ERROR_NOT_ENOUGH_MONEY))
			{
				code = ErrorCode.E_NOT_ENOUGH_MONEY;
			}
			else if (cause.equals(Constants.BALANCE_STATE_SUSPEND_S1))
			{
				code = ErrorCode.E_FAIL_DEBIT_S1;
			}
			else if (cause.equals(Constants.BALANCE_STATE_SUSPEND_S2))
			{
				code = ErrorCode.E_FAIL_DEBIT_S2;
			}
			else if (cause.equals(Constants.BALANCE_STATE_RETIRED_S3))
			{
				code = ErrorCode.E_FAIL_DEBIT_S3;
			}
			else if (cause.equals(Constants.BALANCE_STATE_IDLE))
			{
				code = ErrorCode.E_FAIL_TO_DEDUCT;
			}
			else if (cause.toLowerCase().equals("fraud lockout"))
			{
				code = ErrorCode.E_FRAUD_LOCKOUT;
			}
			else if (!cause.equals(Constants.SUCCESS))
			{
				code = ErrorCode.E_FAILSE;
			}
			else if(cause.equals(Constants.ERROR_COMMAND_NOT_FOUND))
			{
				code = ErrorCode.E_UNKNOW_COMMAND;
			}
			
			else if(cause.toLowerCase().equals("invalid-amount"))
			{
				code = ErrorCode.E_INVALID_AMOUNT;
			}
		}

		return code;
	}

	protected ResponseBase checkParam(RequestBase request)
	{
		String[] state = { "Active", "Suspended(S1)", "Disabled(S2)", "Retired(S3)", "Idle", "Deleted" };
		ResponseBase resp = new ResponseBase();
		if (request instanceof AddBalanceReq)
		{
			if (((AddBalanceReq) request).getAddValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}

			if (!((AddBalanceReq) request).getBalance().equals("Core") || ((AddBalanceReq) request).getBalance().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}
		}
		else if (request instanceof ChangeExpiredDateReq)
		{
			if (!((ChangeExpiredDateReq) request).getExpiredDate().startsWith("+")
					&& ((ChangeExpiredDateReq) request).getExpiredDate().startsWith("-"))
			{
				if (!isValidDate(((ChangeExpiredDateReq) request).getExpiredDate()))
				{
					resp.setResult(ErrorCode.E_INVALID_EXPIRATEDDATE);
					resp.setDetail(getErrorDetail(resp.getResult(), ""));
					resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
					return resp;
				}

			}
		}
		else if (request instanceof ChangeStateReq)
		{
			for (String ste : state)
			{
				if (!((ChangeStateReq) request).getState().equals(ste))
				{
					resp.setResult(ErrorCode.E_INVALID_STATE);
					resp.setDetail(getErrorDetail(resp.getResult(), ""));
					resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
					return resp;
				}
			}
		}
		else if (request instanceof DeductBalanceReq)
		{
			if (((AddBalanceReq) request).getAddValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}

			if (!((AddBalanceReq) request).getBalance().equals("Core") || ((AddBalanceReq) request).getBalance().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}
		}
		else if (request instanceof SetBalanceReq)
		{
			if (((AddBalanceReq) request).getAddValue() <= 0)
			{
				resp.setResult(ErrorCode.E_INVALID_AMOUNT);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}

			if (!((AddBalanceReq) request).getBalance().equals("Core") || ((AddBalanceReq) request).getBalance().equals(""))
			{
				resp.setResult(ErrorCode.E_INVALID_BALANCE);
				resp.setDetail(getErrorDetail(resp.getResult(), ""));
				resp.setMsisdn(((AddBalanceReq) request).getMsisdn());
				return resp;
			}
		}
		else if (request instanceof ExtDebitReq)
		{

		}

		resp.setResult(ErrorCode.E_OK);
		return resp;
	}

	public boolean isValidDate(String date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		Date testDate = null;

		try
		{
			testDate = sdf.parse(date);
		}
		catch (ParseException e)
		{
			return false;
		}

		if (!sdf.format(testDate).equals(date))
		{
			return false;
		}

		return true;

	} // end isValidDate

	public boolean checkCP(int id)
	{
		boolean check = false;
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try
		{
			connection = Database.getConnection();
			String sql = "select * from productEntry where productid = ? and producttype = 'charggw-cp'";
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next())
			{
				check = true;
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			Database.closeObject(stmt);
			Database.closeObject(connection);
			Database.closeObject(rs);
		}

		return check;
	}

	protected PrepaidSubsInfo getPrepaidSubInfo(CommandMessage message)
	{
		PrepaidSubsInfo info = new PrepaidSubsInfo();

		String balanceList = message.getResponseValue(ResponseConstants.BALANCES, "");
		if (!balanceList.equals(""))
		{
			ArrayList<String> balances = StringUtil.toList(balanceList, StringPool.COMMA);
			ArrayList<BalanceInfo> balList = new ArrayList<BalanceInfo>();
			for (String balance : balances)
			{
				if (!balance.equals(""))
				{
					BalanceInfo balanceInfo = new BalanceInfo();
					balanceInfo.setName(balance);
					balanceInfo.setValue(getBalanceValue(message, balance));
					balanceInfo.setExpireTime(getBalanceExpiration(message, balance));

					balList.add(balanceInfo);

					if (balance.toUpperCase().equals("CORE"))
					{
						info.setBalCore(balanceInfo.getValue());
						info.setExpiredCore(balanceInfo.getExpireTime());
					}
				}
			}
			info.setBalList(balList.toArray(new BalanceInfo[] {}));
		}
		info.setCos(getCOSName(message));
		info.setState(getAccountState(message));

		PhoneBook phoneBook = new PhoneBook();
		phoneBook.setSPB(getPhoneBookList(message));

		info.setPhoneBook(phoneBook);
		return info;
	}

	protected PostpaidSubsInfo getPospaidSubInfo(CommandMessage message)
	{
		PostpaidSubsInfo info = new PostpaidSubsInfo();
		double outstandingAmount = 0;
		double unbillAmount = 0;
		double lastPaymentAmount = 0;

		try
		{
			outstandingAmount = Double.valueOf(message.getResponseValue(ResponseConstants.AMOUNT_OUTSTANDING, "0"));
			unbillAmount = Double.valueOf(message.getResponseValue(ResponseConstants.AMOUNT_UNBILL, "0"));
			lastPaymentAmount = Double.valueOf(message.getResponseValue(ResponseConstants.AMOUNT_LAST_PAYMENT, "0"));

			info.setDlastPaymentDebt(lastPaymentAmount);
			info.setDcurrDebt(outstandingAmount);
			info.setDmonthDebt(unbillAmount);
			info.setDtotalDebt(outstandingAmount + unbillAmount);
			// lastPaymentAmount: da tra
			// outstandingAmount: phat sinh, no thang nay
			// unbillAmount: con no tu thang trc
		}
		catch (Exception e)
		{
			debugMonitor(e);
		}
		return info;
	}

	protected double getBalanceValue(CommandMessage message, String balance)
	{
		double value = 0;
		String balanceValue = message.getResponseValue(ResponseConstants.BALANCES + "." + balance + ".amount", "");
		try
		{
			value = Double.valueOf(balanceValue);
		}
		catch (Exception e)
		{
		}

		return value;
	}

	protected String getBalanceExpiration(CommandMessage message, String balance)
	{
		return message.getResponseValue(ResponseConstants.BALANCES + "." + balance + ".expireDate", "");
	}

	protected String[] getPhoneBookList(CommandMessage message)
	{
		String phoneBookList = message.getResponseValue(ResponseConstants.PHONEBOOK, "");
		ArrayList<String> phoneBookNumbers = new ArrayList<String>();

		if (!phoneBookList.equals(""))
		{
			phoneBookNumbers = StringUtil.toList(phoneBookList, StringPool.COMMA);
		}

		return phoneBookNumbers.toArray(new String[] {});
	}

	protected String getCOSName(CommandMessage message)
	{
		return message.getResponseValue(ResponseConstants.COS_CURRENT, "");
	}

	protected String getAccountState(CommandMessage message)
	{
		return message.getResponseValue(ResponseConstants.ACCOUNT_STATE, "");
	}
}
