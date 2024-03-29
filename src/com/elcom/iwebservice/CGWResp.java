/**
 * 
 */
package com.elcom.iwebservice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author hungdt
 * 
 */
public class CGWResp
{
	private String	msisdn;
	private int		result;
	private String	detail;

	public void initCGWResp(String msisdn, int result, String detail)
	{
		// super();
		this.msisdn = msisdn;
		this.result = result;
		this.detail = detail;
	}

	public int getResult()
	{
		return result;
	}

	public void setResult(int result)
	{
		this.result = result;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	public String getMsisdn()
	{
		return msisdn;
	}

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	@Override
	public String toString()
	{
		Class<? extends CGWResp> type = this.getClass();
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
