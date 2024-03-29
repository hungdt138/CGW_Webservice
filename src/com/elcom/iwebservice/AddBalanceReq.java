package com.elcom.iwebservice;

public class AddBalanceReq extends RequestBase
{

	String	balance	= "";

	int		addValue;

	String	msisdn	= "";

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public String getMsisdn()
	{
		return this.msisdn;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public String getBalance()
	{
		return this.balance;
	}

	public void setAddValue(int addValue)
	{
		this.addValue = addValue;
	}

	public int getAddValue()
	{
		return this.addValue;
	}

	public boolean IsValidSyntax()
	{
		if (this.getMsisdn().trim().equals(""))
			return false;
		if (this.addValue < 0)
			return false;
		return true;
	}

}
