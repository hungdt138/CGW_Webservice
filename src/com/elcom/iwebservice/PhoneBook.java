package com.elcom.iwebservice;

public class PhoneBook
{
	private String[]	sPB;

	public String[] getSPB()
	{
		return sPB;
	}

	public void setSPB(String[] spb)
	{
		this.sPB = new String[spb.length];
		sPB = spb;
	}

}
