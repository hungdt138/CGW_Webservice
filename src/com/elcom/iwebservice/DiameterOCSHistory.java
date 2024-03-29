/**
 * DiameterOCSHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class DiameterOCSHistory
{
	private java.util.Calendar	startCallDateTime;
	private java.util.Calendar	endCallDateTime;
	private java.lang.String	activityType;
	private long				usageAmount;
	private AOBalanceEntity		balances;
	private java.lang.String	description;
	private java.lang.String	reason;
	private java.lang.String	applicationName;
	private java.lang.String	subTypeName;
	private java.lang.String	originalTariffPlan;
	private java.lang.String	finalTariffPlan;
	private java.lang.String	OCSComment;

	public java.lang.String getOCSComment()
	{
		return OCSComment;
	}

	public void setOCSComment(java.lang.String comment)
	{
		OCSComment = comment;
	}

	public DiameterOCSHistory()
	{
	}

	public DiameterOCSHistory(
			java.util.Calendar startCallDateTime,
			java.util.Calendar endCallDateTime,
			java.lang.String activityType,
			long usageAmount,

			java.lang.String description,
			java.lang.String reason,

			java.lang.String applicationName,
			java.lang.String subTypeName,

			java.lang.String unitTypeName,

			AOBalanceEntity balances,
			java.lang.String originalTariffPlan,
			java.lang.String finalTariffPlan,
			java.lang.String ocsComment)
	{
		this.startCallDateTime = startCallDateTime;
		this.endCallDateTime = endCallDateTime;
		this.activityType = activityType;
		this.usageAmount = usageAmount;
		this.description = description;
		this.reason = reason;

		this.applicationName = applicationName;
		this.subTypeName = subTypeName;
		this.balances = balances;
		this.originalTariffPlan = originalTariffPlan;
		this.finalTariffPlan = finalTariffPlan;
		this.OCSComment = ocsComment;
	}

	/**
	 * Gets the startCallDateTime value for this DiameterOCSHistory.
	 * 
	 * @return startCallDateTime
	 */
	public java.util.Calendar getStartCallDateTime()
	{
		return startCallDateTime;
	}

	/**
	 * Sets the startCallDateTime value for this DiameterOCSHistory.
	 * 
	 * @param startCallDateTime
	 */
	public void setStartCallDateTime(java.util.Calendar startCallDateTime)
	{
		this.startCallDateTime = startCallDateTime;
	}

	/**
	 * Gets the endCallDateTime value for this DiameterOCSHistory.
	 * 
	 * @return endCallDateTime
	 */
	public java.util.Calendar getEndCallDateTime()
	{
		return endCallDateTime;
	}

	/**
	 * Sets the endCallDateTime value for this DiameterOCSHistory.
	 * 
	 * @param endCallDateTime
	 */
	public void setEndCallDateTime(java.util.Calendar endCallDateTime)
	{
		this.endCallDateTime = endCallDateTime;
	}

	/**
	 * Gets the activityType value for this DiameterOCSHistory.
	 * 
	 * @return activityType
	 */
	public java.lang.String getActivityType()
	{
		return activityType;
	}

	/**
	 * Sets the activityType value for this DiameterOCSHistory.
	 * 
	 * @param activityType
	 */
	public void setActivityType(java.lang.String activityType)
	{
		this.activityType = activityType;
	}

	/**
	 * Gets the usageAmount value for this DiameterOCSHistory.
	 * 
	 * @return usageAmount
	 */
	public long getUsageAmount()
	{
		return usageAmount;
	}

	/**
	 * Sets the usageAmount value for this DiameterOCSHistory.
	 * 
	 * @param usageAmount
	 */
	public void setUsageAmount(long usageAmount)
	{
		this.usageAmount = usageAmount;
	}

	/**
	 * Gets the description value for this DiameterOCSHistory.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription()
	{
		return description;
	}

	/**
	 * Sets the description value for this DiameterOCSHistory.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description)
	{
		this.description = description;
	}

	/**
	 * Gets the reason value for this DiameterOCSHistory.
	 * 
	 * @return reason
	 */
	public java.lang.String getReason()
	{
		return reason;
	}

	/**
	 * Sets the reason value for this DiameterOCSHistory.
	 * 
	 * @param reason
	 */
	public void setReason(java.lang.String reason)
	{
		this.reason = reason;
	}

	/**
	 * Gets the applicationName value for this DiameterOCSHistory.
	 * 
	 * @return applicationName
	 */
	public java.lang.String getApplicationName()
	{
		return applicationName;
	}

	/**
	 * Sets the applicationName value for this DiameterOCSHistory.
	 * 
	 * @param applicationName
	 */
	public void setApplicationName(java.lang.String applicationName)
	{
		this.applicationName = applicationName;
	}

	/**
	 * Gets the subTypeName value for this DiameterOCSHistory.
	 * 
	 * @return subTypeName
	 */
	public java.lang.String getSubTypeName()
	{
		return subTypeName;
	}

	/**
	 * Sets the subTypeName value for this DiameterOCSHistory.
	 * 
	 * @param subTypeName
	 */
	public void setSubTypeName(java.lang.String subTypeName)
	{
		this.subTypeName = subTypeName;
	}

	/**
	 * Gets the balances value for this DiameterOCSHistory.
	 * 
	 * @return balances
	 */
	public AOBalanceEntity getBalances()
	{
		return balances;
	}

	/**
	 * Sets the balances value for this DiameterOCSHistory.
	 * 
	 * @param balances
	 */
	public void setBalances(AOBalanceEntity balances)
	{
		this.balances = balances;
	}

	/**
	 * Gets the originalTariffPlan value for this DiameterOCSHistory.
	 * 
	 * @return originalTariffPlan
	 */
	public java.lang.String getOriginalTariffPlan()
	{
		return originalTariffPlan;
	}

	/**
	 * Sets the originalTariffPlan value for this DiameterOCSHistory.
	 * 
	 * @param originalTariffPlan
	 */
	public void setOriginalTariffPlan(java.lang.String originalTariffPlan)
	{
		this.originalTariffPlan = originalTariffPlan;
	}

	/**
	 * Gets the finalTariffPlan value for this DiameterOCSHistory.
	 * 
	 * @return finalTariffPlan
	 */
	public java.lang.String getFinalTariffPlan()
	{
		return finalTariffPlan;
	}

	/**
	 * Sets the finalTariffPlan value for this DiameterOCSHistory.
	 * 
	 * @param finalTariffPlan
	 */
	public void setFinalTariffPlan(java.lang.String finalTariffPlan)
	{
		this.finalTariffPlan = finalTariffPlan;
	}

}
