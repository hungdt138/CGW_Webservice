package com.elcom.iwebservice;

public class AOCallHistory
{
	private CallHistory[]	callHistory;

	public AOCallHistory()
	{
	}

	public AOCallHistory(
			CallHistory[] callHistory)
	{
		this.callHistory = callHistory;
	}

	public CallHistory[] getCallHistory()
	{
		return callHistory;
	}

	public void setCallHistory(CallHistory[] callHistory)
	{
		this.callHistory = callHistory;
	}

	public CallHistory getCallHistory(int i)
	{
		return this.callHistory[i];
	}

	public void setCallHistory(int i, CallHistory _value)
	{
		this.callHistory[i] = _value;
	}

}
