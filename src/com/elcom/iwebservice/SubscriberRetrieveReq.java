package com.elcom.iwebservice;

public class SubscriberRetrieveReq extends CGWReq
{

	// private String sCommand;

	// public String getSCommand() {
	// return sCommand;
	// }
	//
	// public void setSCommand(String command) {
	// sCommand = command;
	// }

	public SubscriberRetrieveReq()
	{
		super();
	}

	public SubscriberRetrieveReq(String msisdn, int timeout, String username, String password)
	{
		super(msisdn, timeout, username, password);
	}

}
