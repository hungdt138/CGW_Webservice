package com.elcom.iwebservice;

public class SetBalanceReq extends RequestBase
{

	String	balanceName	= "";

	int		Value;

	String	msisdn		= "";

	public void setMsisdn(String msisdn)
	{
		this.msisdn = msisdn;
	}

	public String getMsisdn()
	{
		return this.msisdn;
	}

	public Boolean IsValidSyntax()
	{
		if (this.getMsisdn().trim().equals(""))
			return false;
		if (this.Value < 0)
			return false;
		return true;
	}

	public String getBalanceName()
	{
		return balanceName;
	}

	public void setBalanceName(String balanceName)
	{
		this.balanceName = balanceName;
	}

	public int getValue()
	{
		return Value;
	}

	public void setValue(int value)
	{
		Value = value;
	}

}