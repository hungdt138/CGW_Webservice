package com.elcom.iwebservice;

//import javax.xml.bind.annotation.XmlElement;

public class ChangeExpiredDateReq extends RequestBase
{
	String	balance		= "";
	// @XmlElement(name="expiredDate",nillable=false, required = true)
	String	expiredDate	= "";
	// @XmlElement(name="msisdn",nillable=false, required = true)
	String	msisdn		= "";

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

	public void setExpiredDate(String expiredDate)
	{
		this.expiredDate = expiredDate;
	}

	public String getExpiredDate()
	{
		return this.expiredDate;
	}

	public Boolean IsValidSyntax()
	{
		if (this.getMsisdn().trim().equals(""))
			return false;
		if (this.getExpiredDate().trim().equals(""))
			return false;
		return true;
	}
}
