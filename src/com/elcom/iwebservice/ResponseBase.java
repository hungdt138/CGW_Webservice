package com.elcom.iwebservice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.elcom.utils.ResponseMessage;

public class ResponseBase
{

	public static final int	SUCCESS						= 0;

	public static final int	UNKNOWN						= 1;

	public static final int	SYSTEM_OVERLOAD				= 4;

	public static final int	TIMEOUT						= 5;	// : Timeout

	public static final int	CAN_NOT_AUTHENTICATE		= 6;

	// Define Error code
	public static final int	NOT_HAS_PERMISSION			= 7;

	public static final int	WEBSERVICE_ERROR			= 8;

	public static final int	SUBCRIBER_NOT_FOUND			= 9;

	public static final int	INVALID_SYNTAX				= 10;

	public static final int	MDN_IS_PROCESSING			= 11;

	public static final int	NOT_ENOUGH_MONEY			= 12;

	public static final int	INVALID_STATE				= 13;

	public static final int	INVALID_AMOUNT				= 14;

	public static final int	INVALID_CURRENCY			= 15;

	public static final int	FAIL_TO_DEDUCT				= 16;

	public static final int	INVALID_CONDITION			= 17;

	public static final int	WEBSERVICE_NOT_INITIALIZED	= 18;

	public static final int	RULE_NOT_FOUND				= 19;

	public static final int	NOT_CONNECT_DATABASE		= 20;

	public static final int	SYSTEM_BUSY					= 21;

	String					msisdn						= "";

	String					detail						= "";	// detail
																// description
																// of the error

	int						result						= -1;	// Successfully
																// or not
																// successfully

	public void setResult(int result)
	{
		this.result = result;
	}

	public int getResult()
	{
		return this.result;
	}

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public String getMsisdn()
	{
		return this.msisdn;
	}

	public void setDetail(String detail)
	{

		this.detail = detail;
	}

	public String getDetail()
	{
		return this.detail;
	}

	@Override
	public String toString()
	{
		Class<? extends ResponseBase> type = this.getClass();
		Method[] methods = type.getMethods();
		String returnString = "";
		for (int i = 0; i < methods.length; i++)
		{
			if (!methods[i].getName().startsWith("get"))
			{
				continue;
			}
			String member = "";
			try
			{
				member = methods[i].getName().substring(3) + "=";
				Object value = methods[i].invoke(this, new Object[] {});
				if (value instanceof Date || value instanceof Calendar)
				{
					member += (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(value);
				}
				else
				{
					member += value.toString();
				}
				member += " | ";
			}
			catch (Exception e)
			{
				member = "";
			}
			returnString += member;
		}
		return returnString.trim();
	}
}
