package com.elcom.iwebservice;

//import javax.xml.bind.annotation.XmlElement;

public class ChangeStateReq extends RequestBase
{

	// @XmlElement(name="state",nillable=false, required = true)
	String	state	= "";
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

	public void setState(String state)
	{
		this.state = state;
	}

	public String getState()
	{
		return this.state;
	}

	public Boolean IsValidSyntax()
	{
		if (this.getMsisdn().trim().equals(""))
			return false;
		if (this.getState().trim().equals(""))
			return false;
		return true;
	}
}
