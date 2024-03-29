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
public class CGWReq
{
	public CGWReq()
	{
		this("", -1, "", "");
	}

	private String	msisdn;
	private int		timeout;
	private String	username;
	private String	password;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getMsisdn()
	{
		return msisdn;
	}

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public int getTimeout()
	{
		return timeout;
	}

	public void setTimeout(int timeout)
	{
		this.timeout = timeout;
	}

	public CGWReq(String msisdn, int timeout, String username, String password)
	{
		// super();
		this.msisdn = msisdn;
		this.timeout = timeout;
		this.username = username;
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public String toString()
	{
		Class<? extends CGWReq> type = this.getClass();
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
