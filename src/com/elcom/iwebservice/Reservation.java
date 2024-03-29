/**
 * Reservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Reservation
{
	private AOAccumulatorBase	accumulatorAmounts;
	private AOReservationAmount	reservationAmounts;
	private java.lang.String	subscriberID;
	private java.lang.String	SLUName;
	private java.lang.String	processName;
	private java.lang.String	CRN;
	private int					reservationID;
	private java.lang.String	applicationName;
	private java.lang.String	subTypeName;
	private java.util.Calendar	reservationEndTime;
	private int					consUsage;
	private java.lang.String	masterSubID;
	private int					masterIdentityId;
	private java.util.Calendar	activityStartTime;
	private java.lang.String	calledNumber;
	private java.lang.String	serviceType;
	private java.lang.String	assumeConsumption;
	private java.lang.String	discountPlanName;
	private int					versionID;
	private java.lang.String	COSName;
	private FundsUsageType		fundUsageType;
	private java.lang.String	isoCode;
	private java.lang.String	originalTariffPlan;
	private java.lang.String	finalTariffPlan;
	private java.lang.String	overrideAlcsName;

	public Reservation()
	{
	}

	public Reservation(
			AOAccumulatorBase accumulatorAmounts,
			AOReservationAmount reservationAmounts,
			java.lang.String subscriberID,
			java.lang.String SLUName,
			java.lang.String processName,
			java.lang.String CRN,
			int reservationID,
			java.lang.String applicationName,
			java.lang.String subTypeName,
			java.util.Calendar reservationEndTime,
			int consUsage,
			java.lang.String masterSubID,
			int masterIdentityId,
			java.util.Calendar activityStartTime,
			java.lang.String calledNumber,
			java.lang.String serviceType,
			java.lang.String assumeConsumption,
			java.lang.String discountPlanName,
			int versionID,
			java.lang.String COSName,
			FundsUsageType fundUsageType,
			java.lang.String isoCode,
			java.lang.String originalTariffPlan,
			java.lang.String finalTariffPlan,
			java.lang.String overrideAlcsName)
	{
		this.accumulatorAmounts = accumulatorAmounts;
		this.reservationAmounts = reservationAmounts;
		this.subscriberID = subscriberID;
		this.SLUName = SLUName;
		this.processName = processName;
		this.CRN = CRN;
		this.reservationID = reservationID;
		this.applicationName = applicationName;
		this.subTypeName = subTypeName;
		this.reservationEndTime = reservationEndTime;
		this.consUsage = consUsage;
		this.masterSubID = masterSubID;
		this.masterIdentityId = masterIdentityId;
		this.activityStartTime = activityStartTime;
		this.calledNumber = calledNumber;
		this.serviceType = serviceType;
		this.assumeConsumption = assumeConsumption;
		this.discountPlanName = discountPlanName;
		this.versionID = versionID;
		this.COSName = COSName;
		this.fundUsageType = fundUsageType;
		this.isoCode = isoCode;
		this.originalTariffPlan = originalTariffPlan;
		this.finalTariffPlan = finalTariffPlan;
		this.overrideAlcsName = overrideAlcsName;
	}

	/**
	 * Gets the accumulatorAmounts value for this Reservation.
	 * 
	 * @return accumulatorAmounts
	 */
	public AOAccumulatorBase getAccumulatorAmounts()
	{
		return accumulatorAmounts;
	}

	/**
	 * Sets the accumulatorAmounts value for this Reservation.
	 * 
	 * @param accumulatorAmounts
	 */
	public void setAccumulatorAmounts(AOAccumulatorBase accumulatorAmounts)
	{
		this.accumulatorAmounts = accumulatorAmounts;
	}

	/**
	 * Gets the reservationAmounts value for this Reservation.
	 * 
	 * @return reservationAmounts
	 */
	public AOReservationAmount getReservationAmounts()
	{
		return reservationAmounts;
	}

	/**
	 * Sets the reservationAmounts value for this Reservation.
	 * 
	 * @param reservationAmounts
	 */
	public void setReservationAmounts(AOReservationAmount reservationAmounts)
	{
		this.reservationAmounts = reservationAmounts;
	}

	/**
	 * Gets the subscriberID value for this Reservation.
	 * 
	 * @return subscriberID
	 */
	public java.lang.String getSubscriberID()
	{
		return subscriberID;
	}

	/**
	 * Sets the subscriberID value for this Reservation.
	 * 
	 * @param subscriberID
	 */
	public void setSubscriberID(java.lang.String subscriberID)
	{
		this.subscriberID = subscriberID;
	}

	/**
	 * Gets the SLUName value for this Reservation.
	 * 
	 * @return SLUName
	 */
	public java.lang.String getSLUName()
	{
		return SLUName;
	}

	/**
	 * Sets the SLUName value for this Reservation.
	 * 
	 * @param SLUName
	 */
	public void setSLUName(java.lang.String SLUName)
	{
		this.SLUName = SLUName;
	}

	/**
	 * Gets the processName value for this Reservation.
	 * 
	 * @return processName
	 */
	public java.lang.String getProcessName()
	{
		return processName;
	}

	/**
	 * Sets the processName value for this Reservation.
	 * 
	 * @param processName
	 */
	public void setProcessName(java.lang.String processName)
	{
		this.processName = processName;
	}

	/**
	 * Gets the CRN value for this Reservation.
	 * 
	 * @return CRN
	 */
	public java.lang.String getCRN()
	{
		return CRN;
	}

	/**
	 * Sets the CRN value for this Reservation.
	 * 
	 * @param CRN
	 */
	public void setCRN(java.lang.String CRN)
	{
		this.CRN = CRN;
	}

	/**
	 * Gets the reservationID value for this Reservation.
	 * 
	 * @return reservationID
	 */
	public int getReservationID()
	{
		return reservationID;
	}

	/**
	 * Sets the reservationID value for this Reservation.
	 * 
	 * @param reservationID
	 */
	public void setReservationID(int reservationID)
	{
		this.reservationID = reservationID;
	}

	/**
	 * Gets the applicationName value for this Reservation.
	 * 
	 * @return applicationName
	 */
	public java.lang.String getApplicationName()
	{
		return applicationName;
	}

	/**
	 * Sets the applicationName value for this Reservation.
	 * 
	 * @param applicationName
	 */
	public void setApplicationName(java.lang.String applicationName)
	{
		this.applicationName = applicationName;
	}

	/**
	 * Gets the subTypeName value for this Reservation.
	 * 
	 * @return subTypeName
	 */
	public java.lang.String getSubTypeName()
	{
		return subTypeName;
	}

	/**
	 * Sets the subTypeName value for this Reservation.
	 * 
	 * @param subTypeName
	 */
	public void setSubTypeName(java.lang.String subTypeName)
	{
		this.subTypeName = subTypeName;
	}

	/**
	 * Gets the reservationEndTime value for this Reservation.
	 * 
	 * @return reservationEndTime
	 */
	public java.util.Calendar getReservationEndTime()
	{
		return reservationEndTime;
	}

	/**
	 * Sets the reservationEndTime value for this Reservation.
	 * 
	 * @param reservationEndTime
	 */
	public void setReservationEndTime(java.util.Calendar reservationEndTime)
	{
		this.reservationEndTime = reservationEndTime;
	}

	/**
	 * Gets the consUsage value for this Reservation.
	 * 
	 * @return consUsage
	 */
	public int getConsUsage()
	{
		return consUsage;
	}

	/**
	 * Sets the consUsage value for this Reservation.
	 * 
	 * @param consUsage
	 */
	public void setConsUsage(int consUsage)
	{
		this.consUsage = consUsage;
	}

	/**
	 * Gets the masterSubID value for this Reservation.
	 * 
	 * @return masterSubID
	 */
	public java.lang.String getMasterSubID()
	{
		return masterSubID;
	}

	/**
	 * Sets the masterSubID value for this Reservation.
	 * 
	 * @param masterSubID
	 */
	public void setMasterSubID(java.lang.String masterSubID)
	{
		this.masterSubID = masterSubID;
	}

	/**
	 * Gets the masterIdentityId value for this Reservation.
	 * 
	 * @return masterIdentityId
	 */
	public int getMasterIdentityId()
	{
		return masterIdentityId;
	}

	/**
	 * Sets the masterIdentityId value for this Reservation.
	 * 
	 * @param masterIdentityId
	 */
	public void setMasterIdentityId(int masterIdentityId)
	{
		this.masterIdentityId = masterIdentityId;
	}

	/**
	 * Gets the activityStartTime value for this Reservation.
	 * 
	 * @return activityStartTime
	 */
	public java.util.Calendar getActivityStartTime()
	{
		return activityStartTime;
	}

	/**
	 * Sets the activityStartTime value for this Reservation.
	 * 
	 * @param activityStartTime
	 */
	public void setActivityStartTime(java.util.Calendar activityStartTime)
	{
		this.activityStartTime = activityStartTime;
	}

	/**
	 * Gets the calledNumber value for this Reservation.
	 * 
	 * @return calledNumber
	 */
	public java.lang.String getCalledNumber()
	{
		return calledNumber;
	}

	/**
	 * Sets the calledNumber value for this Reservation.
	 * 
	 * @param calledNumber
	 */
	public void setCalledNumber(java.lang.String calledNumber)
	{
		this.calledNumber = calledNumber;
	}

	/**
	 * Gets the serviceType value for this Reservation.
	 * 
	 * @return serviceType
	 */
	public java.lang.String getServiceType()
	{
		return serviceType;
	}

	/**
	 * Sets the serviceType value for this Reservation.
	 * 
	 * @param serviceType
	 */
	public void setServiceType(java.lang.String serviceType)
	{
		this.serviceType = serviceType;
	}

	/**
	 * Gets the assumeConsumption value for this Reservation.
	 * 
	 * @return assumeConsumption
	 */
	public java.lang.String getAssumeConsumption()
	{
		return assumeConsumption;
	}

	/**
	 * Sets the assumeConsumption value for this Reservation.
	 * 
	 * @param assumeConsumption
	 */
	public void setAssumeConsumption(java.lang.String assumeConsumption)
	{
		this.assumeConsumption = assumeConsumption;
	}

	/**
	 * Gets the discountPlanName value for this Reservation.
	 * 
	 * @return discountPlanName
	 */
	public java.lang.String getDiscountPlanName()
	{
		return discountPlanName;
	}

	/**
	 * Sets the discountPlanName value for this Reservation.
	 * 
	 * @param discountPlanName
	 */
	public void setDiscountPlanName(java.lang.String discountPlanName)
	{
		this.discountPlanName = discountPlanName;
	}

	/**
	 * Gets the versionID value for this Reservation.
	 * 
	 * @return versionID
	 */
	public int getVersionID()
	{
		return versionID;
	}

	/**
	 * Sets the versionID value for this Reservation.
	 * 
	 * @param versionID
	 */
	public void setVersionID(int versionID)
	{
		this.versionID = versionID;
	}

	/**
	 * Gets the COSName value for this Reservation.
	 * 
	 * @return COSName
	 */
	public java.lang.String getCOSName()
	{
		return COSName;
	}

	/**
	 * Sets the COSName value for this Reservation.
	 * 
	 * @param COSName
	 */
	public void setCOSName(java.lang.String COSName)
	{
		this.COSName = COSName;
	}

	/**
	 * Gets the fundUsageType value for this Reservation.
	 * 
	 * @return fundUsageType
	 */
	public FundsUsageType getFundUsageType()
	{
		return fundUsageType;
	}

	/**
	 * Sets the fundUsageType value for this Reservation.
	 * 
	 * @param fundUsageType
	 */
	public void setFundUsageType(FundsUsageType fundUsageType)
	{
		this.fundUsageType = fundUsageType;
	}

	/**
	 * Gets the isoCode value for this Reservation.
	 * 
	 * @return isoCode
	 */
	public java.lang.String getIsoCode()
	{
		return isoCode;
	}

	/**
	 * Sets the isoCode value for this Reservation.
	 * 
	 * @param isoCode
	 */
	public void setIsoCode(java.lang.String isoCode)
	{
		this.isoCode = isoCode;
	}

	/**
	 * Gets the originalTariffPlan value for this Reservation.
	 * 
	 * @return originalTariffPlan
	 */
	public java.lang.String getOriginalTariffPlan()
	{
		return originalTariffPlan;
	}

	/**
	 * Sets the originalTariffPlan value for this Reservation.
	 * 
	 * @param originalTariffPlan
	 */
	public void setOriginalTariffPlan(java.lang.String originalTariffPlan)
	{
		this.originalTariffPlan = originalTariffPlan;
	}

	/**
	 * Gets the finalTariffPlan value for this Reservation.
	 * 
	 * @return finalTariffPlan
	 */
	public java.lang.String getFinalTariffPlan()
	{
		return finalTariffPlan;
	}

	/**
	 * Sets the finalTariffPlan value for this Reservation.
	 * 
	 * @param finalTariffPlan
	 */
	public void setFinalTariffPlan(java.lang.String finalTariffPlan)
	{
		this.finalTariffPlan = finalTariffPlan;
	}

	/**
	 * Gets the overrideAlcsName value for this Reservation.
	 * 
	 * @return overrideAlcsName
	 */
	public java.lang.String getOverrideAlcsName()
	{
		return overrideAlcsName;
	}

	/**
	 * Sets the overrideAlcsName value for this Reservation.
	 * 
	 * @param overrideAlcsName
	 */
	public void setOverrideAlcsName(java.lang.String overrideAlcsName)
	{
		this.overrideAlcsName = overrideAlcsName;
	}

}
