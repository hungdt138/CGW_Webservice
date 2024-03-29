package com.elcom.iwebservice;

import java.util.Calendar;

public class CallHistory
{

	private double				usageAmount;
	private AOBalanceEntity		balances;

	private java.util.Calendar	startCallDateTime;
	private java.util.Calendar	endCallDateTime;
	private java.lang.String	calledNumber;
	private long				callDuration;
	private java.lang.String	callType;

	private java.lang.String	reason;
	private java.lang.String	applicationName;
	private java.lang.String	unitTypeName;

	public CallHistory()
	{
	}

	public CallHistory(double usageAmount, AOBalanceEntity balances, Calendar startCallDateTime, Calendar endCallDateTime, String calledNumber,
			long callDuration, String callType, String reason, String applicationName, String unitTypeName)
	{
		super();
		this.usageAmount = usageAmount;
		this.balances = balances;
		this.startCallDateTime = startCallDateTime;
		this.endCallDateTime = endCallDateTime;
		this.calledNumber = calledNumber;
		this.callDuration = callDuration;
		this.callType = callType;
		this.reason = reason;
		this.applicationName = applicationName;
		this.unitTypeName = unitTypeName;
	}

	public java.lang.String getApplicationName()
	{
		return applicationName;
	}

	public void setApplicationName(java.lang.String applicationName)
	{
		this.applicationName = applicationName;
	}

	public AOBalanceEntity getBalances()
	{
		return balances;
	}

	public void setBalances(AOBalanceEntity balances)
	{
		this.balances = balances;
	}

	public long getCallDuration()
	{
		return callDuration;
	}

	public void setCallDuration(long callDuration)
	{
		this.callDuration = callDuration;
	}

	public java.lang.String getCalledNumber()
	{
		return calledNumber;
	}

	public void setCalledNumber(java.lang.String calledNumber)
	{
		this.calledNumber = calledNumber;
	}

	public java.lang.String getCallType()
	{
		return callType;
	}

	public void setCallType(java.lang.String callType)
	{
		this.callType = callType;
	}

	public java.util.Calendar getEndCallDateTime()
	{
		return endCallDateTime;
	}

	public void setEndCallDateTime(java.util.Calendar endCallDateTime)
	{
		this.endCallDateTime = endCallDateTime;
	}

	public java.lang.String getReason()
	{
		return reason;
	}

	public void setReason(java.lang.String reason)
	{
		this.reason = reason;
	}

	public java.util.Calendar getStartCallDateTime()
	{
		return startCallDateTime;
	}

	public void setStartCallDateTime(java.util.Calendar startCallDateTime)
	{
		this.startCallDateTime = startCallDateTime;
	}

	public java.lang.String getUnitTypeName()
	{
		return unitTypeName;
	}

	public void setUnitTypeName(java.lang.String unitTypeName)
	{
		this.unitTypeName = unitTypeName;
	}

	public double getUsageAmount()
	{
		return usageAmount;
	}

	public void setUsageAmount(double usageAmount)
	{
		this.usageAmount = usageAmount;
	}

}
