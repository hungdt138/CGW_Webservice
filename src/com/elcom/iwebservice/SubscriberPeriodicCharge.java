package com.elcom.iwebservice;

public class SubscriberPeriodicCharge
{
	private java.lang.String	periodicChargeID;
	private int					remainingApplications;
	private java.util.Calendar	startDate;
	private java.util.Calendar	endDate;
	private boolean				firstChargeApplied;
	private java.util.Calendar	lastChargeDate;
	private long				applyDay;
	private java.lang.String	postActiveChargeApplied;

	public SubscriberPeriodicCharge()
	{
	}

	public SubscriberPeriodicCharge(
			java.lang.String periodicChargeID,
			int remainingApplications,
			java.util.Calendar startDate,
			java.util.Calendar endDate,
			boolean firstChargeApplied,
			java.util.Calendar lastChargeDate,
			long applyDay,
			java.lang.String postActiveChargeApplied)
	{
		this.periodicChargeID = periodicChargeID;
		this.remainingApplications = remainingApplications;
		this.startDate = startDate;
		this.endDate = endDate;
		this.firstChargeApplied = firstChargeApplied;
		this.lastChargeDate = lastChargeDate;
		this.applyDay = applyDay;
		this.postActiveChargeApplied = postActiveChargeApplied;
	}

	/**
	 * Gets the periodicChargeID value for this SubscriberPeriodicCharge.
	 * 
	 * @return periodicChargeID
	 */
	public java.lang.String getPeriodicChargeID()
	{
		return periodicChargeID;
	}

	/**
	 * Sets the periodicChargeID value for this SubscriberPeriodicCharge.
	 * 
	 * @param periodicChargeID
	 */
	public void setPeriodicChargeID(java.lang.String periodicChargeID)
	{
		this.periodicChargeID = periodicChargeID;
	}

	/**
	 * Gets the remainingApplications value for this SubscriberPeriodicCharge.
	 * 
	 * @return remainingApplications
	 */
	public int getRemainingApplications()
	{
		return remainingApplications;
	}

	/**
	 * Sets the remainingApplications value for this SubscriberPeriodicCharge.
	 * 
	 * @param remainingApplications
	 */
	public void setRemainingApplications(int remainingApplications)
	{
		this.remainingApplications = remainingApplications;
	}

	/**
	 * Gets the startDate value for this SubscriberPeriodicCharge.
	 * 
	 * @return startDate
	 */
	public java.util.Calendar getStartDate()
	{
		return startDate;
	}

	/**
	 * Sets the startDate value for this SubscriberPeriodicCharge.
	 * 
	 * @param startDate
	 */
	public void setStartDate(java.util.Calendar startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * Gets the endDate value for this SubscriberPeriodicCharge.
	 * 
	 * @return endDate
	 */
	public java.util.Calendar getEndDate()
	{
		return endDate;
	}

	/**
	 * Sets the endDate value for this SubscriberPeriodicCharge.
	 * 
	 * @param endDate
	 */
	public void setEndDate(java.util.Calendar endDate)
	{
		this.endDate = endDate;
	}

	/**
	 * Gets the firstChargeApplied value for this SubscriberPeriodicCharge.
	 * 
	 * @return firstChargeApplied
	 */
	public boolean isFirstChargeApplied()
	{
		return firstChargeApplied;
	}

	/**
	 * Sets the firstChargeApplied value for this SubscriberPeriodicCharge.
	 * 
	 * @param firstChargeApplied
	 */
	public void setFirstChargeApplied(boolean firstChargeApplied)
	{
		this.firstChargeApplied = firstChargeApplied;
	}

	/**
	 * Gets the lastChargeDate value for this SubscriberPeriodicCharge.
	 * 
	 * @return lastChargeDate
	 */
	public java.util.Calendar getLastChargeDate()
	{
		return lastChargeDate;
	}

	/**
	 * Sets the lastChargeDate value for this SubscriberPeriodicCharge.
	 * 
	 * @param lastChargeDate
	 */
	public void setLastChargeDate(java.util.Calendar lastChargeDate)
	{
		this.lastChargeDate = lastChargeDate;
	}

	/**
	 * Gets the applyDay value for this SubscriberPeriodicCharge.
	 * 
	 * @return applyDay
	 */
	public long getApplyDay()
	{
		return applyDay;
	}

	/**
	 * Sets the applyDay value for this SubscriberPeriodicCharge.
	 * 
	 * @param applyDay
	 */
	public void setApplyDay(long applyDay)
	{
		this.applyDay = applyDay;
	}

	/**
	 * Gets the postActiveChargeApplied value for this SubscriberPeriodicCharge.
	 * 
	 * @return postActiveChargeApplied
	 */
	public java.lang.String getPostActiveChargeApplied()
	{
		return postActiveChargeApplied;
	}

	/**
	 * Sets the postActiveChargeApplied value for this SubscriberPeriodicCharge.
	 * 
	 * @param postActiveChargeApplied
	 */
	public void setPostActiveChargeApplied(java.lang.String postActiveChargeApplied)
	{
		this.postActiveChargeApplied = postActiveChargeApplied;
	}

}
