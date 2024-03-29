package com.elcom.utils;

import java.util.ArrayList;

import com.crm.provisioning.impl.charging.ChargingConstants;
import com.elcom.iwebservice.ResponseBase;

public class ResponseMessage
{

	private int		result				= -1;
	private String	errorCode			= "";
	private String	errorDetail			= "";
	private boolean	isExtDebitResponse	= false;

	public ResponseMessage(ResponseMessage msg)
	{
		this.result = msg.result;
		this.errorCode = msg.errorCode;
		this.errorDetail = msg.errorDetail;
		this.isExtDebitResponse = msg.isExtDebitResponse;
	}

	public ResponseMessage(String message, boolean isExtDebitResponse)
	{
		if (isExtDebitResponse)
		{
			this.isExtDebitResponse = isExtDebitResponse;

			parseExtDebitResponse(message);
		}
		else
		{
			parseChargingResponse(message);
		}
	}

	public void setResult(int result)
	{
		this.result = result;
	}

	public int getResult()
	{
		return result;
	}

	public boolean isExtDebitResponse()
	{
		return isExtDebitResponse;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorCode()
	{
		return this.errorCode;
	}

	public String getErrorDetail()
	{
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail)
	{
		this.errorDetail = errorDetail;
	}

	public void setErrorDetail(String errorDetail, String defaultError)
	{
		if (errorDetail.equals(""))
		{
			this.errorDetail = defaultError;
		}
		else
		{
			this.errorDetail = errorDetail;
		}
	}

	public void setResult(int result, String errorDetail)
	{
		this.result = result;
		this.errorDetail = errorDetail;
	}

	// -----------------------------------------------------------------------------
	/**
	 * Input: src: xau can tach; sep: xau ngan cach Thuat toan: Chat dan. Note:
	 * Lay ca 2 dau cua xau Ex: "</tr>pha</tr>" se duoc 3 xau(2 xau rong va 1
	 * xau "pha") chu ko phai 1
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected String[] split(String src, String sep)
	{
		int idx = -1;
		int bg = 0;
		
		ArrayList list = new ArrayList();
		
		do
		{
			idx = src.indexOf(sep);
			if (idx >= 0)
			{
				String part = src.substring(bg, idx);
				list.add(part);

				/* Chat phan dau, lay phan duoi: */
				src = src.substring(idx + sep.length());
			}
		}
		while (idx >= 0);

		/* lay not phan cuoi cung: */
		if (src.length() > 0)
		{
			list.add(src);
		}
		else
		{
			list.add("");
		}

		String result[] = new String[list.size()];
		
		result = (String[]) list.toArray(result);
		
		return result;
	}

	private void parseChargingResponse(String message)
	{
		String[] strArr = split(message, ",");

		String returnErrorCode = strArr[3];

		if (returnErrorCode.equals("1") | returnErrorCode.equals("100"))
		{
			setResult(ResponseBase.SUCCESS);
			setErrorDetail("Success");
		}
		else
		{
			processChargingErrorCode(Integer.parseInt(returnErrorCode));
		}
	}

	private void parseExtDebitResponse(String message)
	{
		this.errorCode = ChargingConstants.getFieldValue(ChargingConstants.FIELD_ERROR_CODE, message);
		this.errorDetail = ChargingConstants.getFieldValue(ChargingConstants.FIELD_ERROR_DETAIL, message);

		processExtDebitError(this.errorCode, this.errorDetail);

	}

	private void processChargingErrorCode(int errorcode)
	{
		if (errorcode == -1)
		{
			setResult(ResponseBase.UNKNOWN, "Unknown");
		}
		else if (errorcode == -3)
		{
			setResult(ResponseBase.INVALID_SYNTAX, "Invalid syntax");
		}
		else if (errorcode == -4) // The MDN is processing
		{
			setResult(ResponseBase.MDN_IS_PROCESSING, "This MDN is processing");
		}
		else if (errorcode == -5)
		{
			setResult(ResponseBase.SUBCRIBER_NOT_FOUND, "Can not retrieval MDN�s information .");
		}
		else if (errorcode == -6) // Account is incorrect or permission denied
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Account is incorrect or permission denied");
		}
		// In this modify balance or state or expired date
		else if (errorcode == 2) // Invalid syntax
		{
			setResult(ResponseBase.UNKNOWN, "Unknown");
		}
		else if (errorcode == 3) // The MDN is processing
		{
			setResult(ResponseBase.INVALID_CONDITION, "Invalid condition modify");
		}
		else if (errorcode == 4)
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Can not connect to RTBS"); // From
																					// SubModifyTCP
		}
		else if (errorcode == 5) // Account is incorrect or permission denied
		{
			setResult(ResponseBase.SYSTEM_OVERLOAD, "Charging System is overload");
		}
		else if (errorcode == 6) // ChargingGW return Unknown error
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Can not receive response from RTBS");
		}
		// In this charge case
		else if (errorcode == 200)
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Unknown");
		}
		else if (errorcode == 300)
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Can not connect to RTBs");
		}
		else if (errorcode == 400)
		{
			setResult(ResponseBase.SYSTEM_OVERLOAD, "Charging System is overload");
		}
		else if (errorcode == 500)
		{
			setResult(ResponseBase.WEBSERVICE_ERROR, "Can not recieve response from RTBs");
		}
		else if (errorcode == 600)
		{
			setResult(ResponseBase.NOT_ENOUGH_MONEY, "Not enough money");
		}
		else if (errorcode == 700)
		{
			setResult(ResponseBase.INVALID_CURRENCY, "Invalid currency");
		}
		else if (errorcode == 800)
		{
			setResult(ResponseBase.INVALID_AMOUNT, "Invalid amount");
		}
		else if (errorcode == 900)
		{
			setResult(ResponseBase.INVALID_STATE, "Invalid state");
		}
		else
		{
			setResult(ResponseBase.UNKNOWN, "UNKNOWN");
		}

	}

	public void processExtDebitError(String errorCode, String errorDetail)
	{
		if (errorCode.equals("0x0000")) // Succesfully
		{
			setResult(ResponseBase.SUCCESS, "Success.");
		}
		else if (errorCode.equals("0xFFFF")) // Wrong parameter
		{
			setResult(ResponseBase.INVALID_SYNTAX, "Invalid Syntax");
		}
		else if (errorCode.equals("0x00A0")) // Unsuccessfully
		{
			setResult(ResponseBase.FAIL_TO_DEDUCT, "Can not debit");
		}
		else if (errorCode.equals("0x00A1")) // Unsuccessfully
		{
			setResult(ResponseBase.RULE_NOT_FOUND, "Not found rule for debit.");
		}
		else if (errorCode.equals("0x00A2")) // Unsuccessfully
		{
			setResult(ResponseBase.NOT_ENOUGH_MONEY, "Not enough money.");
		}
		else if (errorCode.equals("0x00A3")) // Unsuccessfully
		{
			setResult(ResponseBase.TIMEOUT, "Debit Timeout.");
		}
		else if (errorCode.equals("0x00A4")) // Unsuccessfully
		{
			setResult(ResponseBase.NOT_CONNECT_DATABASE, "Not connect to Database.");
		}
		else if (errorCode.equals("0x00B0")) // Not have permission
		{
			setResult(ResponseBase.NOT_HAS_PERMISSION, "Access denied.");
		}
		else if (errorCode.equals("0x00C0")) // The System is
		// overload
		{
			setResult(ResponseBase.SYSTEM_OVERLOAD, "System is overload");
		}
		else if (errorCode.equals("0x00D0"))
		{
			setResult(ResponseBase.SYSTEM_BUSY, "System busy.");
		}
		else if (errorCode.equals("0x00D1"))
		{
			setResult(ResponseBase.SUBCRIBER_NOT_FOUND, "Subscriber not found.");
		}
		else if (errorCode.equals("0x00D2"))
		{
			setResult(ResponseBase.INVALID_STATE, "Subscriber invalid state.");
		}
		else
		{
			setResult(ResponseBase.TIMEOUT, "Timeout");
		}
	}
}
