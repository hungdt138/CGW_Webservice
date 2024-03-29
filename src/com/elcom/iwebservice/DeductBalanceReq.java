package com.elcom.iwebservice;

//import javax.xml.bind.annotation.XmlElement;

public class DeductBalanceReq extends RequestBase
{
	String	balance	= "";
	// @XmlElement(name="deductValue",nillable=false, required = true)
	int		deductValue;
	// @XmlElement(name="msisdn",nillable=false, required = true)
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

	public void setdeductValue(int deductValue)
	{
		this.deductValue = deductValue;
	}

	public int getDeductValue()
	{
		return this.deductValue;
	}

	public Boolean IsValidSyntax()
	{
		if (this.getBalance().trim().equals(""))
			return false;
		if (this.getMsisdn().trim().equals(""))
			return false;
		if (this.getDeductValue() < 0)
			return false;
		return true;
	}
}
