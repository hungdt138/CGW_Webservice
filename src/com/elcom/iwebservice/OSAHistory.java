package com.elcom.iwebservice;

import java.util.Calendar;
import java.util.Date;

public class OSAHistory
{
	private java.util.Calendar	startCallDateTime;
	private java.util.Calendar	endCallDateTime;
	private java.lang.String	activityType;
	private long				usageAmount;

	private java.lang.String	reason;
	private java.lang.String	applicationName;
	private java.lang.String	subTypeName;

	private java.lang.String	unitTypeName;
	private java.lang.String	merchantName;
	private java.lang.String	sessionDescription;
	private java.lang.String	applicationDescription;
	private java.lang.String	OSAItem;
	private java.lang.String	OSASubType;

	private AOBalanceEntity		balances;

	public OSAHistory()
	{
		// startCallDateTime = Calendar.getInstance();
		// endCallDateTime = Calendar.getInstance();
		activityType = "";
		usageAmount = 0;
		reason = "";
		applicationName = "";
		subTypeName = "";
		merchantName = "";
		sessionDescription = "";
		applicationDescription = "";
		OSAItem = "";
		OSASubType = "";
		unitTypeName = "";
	}

	public OSAHistory(
			java.util.Calendar startCallDateTime,
			java.util.Calendar endCallDateTime,
			java.lang.String activityType,
			long usageAmount,

			java.lang.String reason,
			java.lang.String applicationName,
			java.lang.String subTypeName,

			java.lang.String unitTypeName,
			java.lang.String merchantName,
			java.lang.String sessionDescription,
			java.lang.String applicationDescription,
			java.lang.String OSAItem,
			java.lang.String OSASubType,

			AOBalanceEntity balances)
	{
		this.startCallDateTime = startCallDateTime;
		this.endCallDateTime = endCallDateTime;
		this.activityType = activityType;
		this.usageAmount = usageAmount;

		this.reason = reason;
		this.applicationName = applicationName;
		this.subTypeName = subTypeName;

		this.unitTypeName = unitTypeName;
		this.merchantName = merchantName;
		this.sessionDescription = sessionDescription;

		this.applicationDescription = applicationDescription;
		this.OSAItem = OSAItem;
		this.OSASubType = OSASubType;

		this.balances = balances;
	}

	/**
	 * Gets the startCallDateTime value for this OSAHistory.
	 * 
	 * @return startCallDateTime
	 */
	public java.util.Calendar getStartCallDateTime()
	{
		return startCallDateTime;
	}

	/**
	 * Sets the startCallDateTime value for this OSAHistory.
	 * 
	 * @param startCallDateTime
	 */
	public void setStartCallDateTime(java.util.Calendar startCallDateTime)
	{
		this.startCallDateTime = startCallDateTime;
	}

	/**
	 * Gets the endCallDateTime value for this OSAHistory.
	 * 
	 * @return endCallDateTime
	 */
	public java.util.Calendar getEndCallDateTime()
	{
		return endCallDateTime;
	}

	/**
	 * Sets the endCallDateTime value for this OSAHistory.
	 * 
	 * @param endCallDateTime
	 */
	public void setEndCallDateTime(java.util.Calendar endCallDateTime)
	{
		this.endCallDateTime = endCallDateTime;
	}

	/**
	 * Gets the activityType value for this OSAHistory.
	 * 
	 * @return activityType
	 */
	public java.lang.String getActivityType()
	{
		return activityType;
	}

	/**
	 * Sets the activityType value for this OSAHistory.
	 * 
	 * @param activityType
	 */
	public void setActivityType(java.lang.String activityType)
	{
		this.activityType = activityType;
	}

	/**
	 * Gets the usageAmount value for this OSAHistory.
	 * 
	 * @return usageAmount
	 */
	public long getUsageAmount()
	{
		return usageAmount;
	}

	/**
	 * Sets the usageAmount value for this OSAHistory.
	 * 
	 * @param usageAmount
	 */
	public void setUsageAmount(long usageAmount)
	{
		this.usageAmount = usageAmount;
	}

	/**
	 * Gets the reason value for this OSAHistory.
	 * 
	 * @return reason
	 */
	public java.lang.String getReason()
	{
		return reason;
	}

	/**
	 * Sets the reason value for this OSAHistory.
	 * 
	 * @param reason
	 */
	public void setReason(java.lang.String reason)
	{
		this.reason = reason;
	}

	/**
	 * Gets the applicationName value for this OSAHistory.
	 * 
	 * @return applicationName
	 */
	public java.lang.String getApplicationName()
	{
		return applicationName;
	}

	/**
	 * Sets the applicationName value for this OSAHistory.
	 * 
	 * @param applicationName
	 */
	public void setApplicationName(java.lang.String applicationName)
	{
		this.applicationName = applicationName;
	}

	/**
	 * Gets the subTypeName value for this OSAHistory.
	 * 
	 * @return subTypeName
	 */
	public java.lang.String getSubTypeName()
	{
		return subTypeName;
	}

	/**
	 * Sets the subTypeName value for this OSAHistory.
	 * 
	 * @param subTypeName
	 */
	public void setSubTypeName(java.lang.String subTypeName)
	{
		this.subTypeName = subTypeName;
	}

	/**
	 * Gets the unitTypeName value for this OSAHistory.
	 * 
	 * @return unitTypeName
	 */
	public java.lang.String getUnitTypeName()
	{
		return unitTypeName;
	}

	/**
	 * Sets the unitTypeName value for this OSAHistory.
	 * 
	 * @param unitTypeName
	 */
	public void setUnitTypeName(java.lang.String unitTypeName)
	{
		this.unitTypeName = unitTypeName;
	}

	/**
	 * Gets the merchantName value for this OSAHistory.
	 * 
	 * @return merchantName
	 */
	public java.lang.String getMerchantName()
	{
		return merchantName;
	}

	/**
	 * Sets the merchantName value for this OSAHistory.
	 * 
	 * @param merchantName
	 */
	public void setMerchantName(java.lang.String merchantName)
	{
		this.merchantName = merchantName;
	}

	/**
	 * Gets the sessionDescription value for this OSAHistory.
	 * 
	 * @return sessionDescription
	 */
	public java.lang.String getSessionDescription()
	{
		return sessionDescription;
	}

	/**
	 * Sets the sessionDescription value for this OSAHistory.
	 * 
	 * @param sessionDescription
	 */
	public void setSessionDescription(java.lang.String sessionDescription)
	{
		this.sessionDescription = sessionDescription;
	}

	/**
	 * Gets the applicationDescription value for this OSAHistory.
	 * 
	 * @return applicationDescription
	 */
	public java.lang.String getApplicationDescription()
	{
		return applicationDescription;
	}

	/**
	 * Sets the applicationDescription value for this OSAHistory.
	 * 
	 * @param applicationDescription
	 */
	public void setApplicationDescription(java.lang.String applicationDescription)
	{
		this.applicationDescription = applicationDescription;
	}

	/**
	 * Gets the OSAItem value for this OSAHistory.
	 * 
	 * @return OSAItem
	 */
	public java.lang.String getOSAItem()
	{
		return OSAItem;
	}

	/**
	 * Sets the OSAItem value for this OSAHistory.
	 * 
	 * @param OSAItem
	 */
	public void setOSAItem(java.lang.String OSAItem)
	{
		this.OSAItem = OSAItem;
	}

	/**
	 * Gets the OSASubType value for this OSAHistory.
	 * 
	 * @return OSASubType
	 */
	public java.lang.String getOSASubType()
	{
		return OSASubType;
	}

	/**
	 * Sets the OSASubType value for this OSAHistory.
	 * 
	 * @param OSASubType
	 */
	public void setOSASubType(java.lang.String OSASubType)
	{
		this.OSASubType = OSASubType;
	}

	/**
	 * Gets the balances value for this OSAHistory.
	 * 
	 * @return balances
	 */
	public AOBalanceEntity getBalances()
	{
		return balances;
	}

	/**
	 * Sets the balances value for this OSAHistory.
	 * 
	 * @param balances
	 */
	public void setBalances(AOBalanceEntity balances)
	{
		this.balances = balances;
	}

}
