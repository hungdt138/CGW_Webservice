/**
 * SubscriberEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class SubscriberEntity extends SubscriberMainBase
{
	private BonusPlanEntity[]		bonusPlan;
	private AOBalanceEntity			balances;
	private java.lang.String		SPName;
	private java.util.Calendar		creationDate;
	private java.util.Calendar		dateEnterActive;
	private java.lang.String		previousState;
	private java.util.Calendar		prevTransDate;
	private java.util.Calendar		lastTransDate;
	private SubscriberAccountType	accountType;
	private java.lang.String		groupName;
	private double					lastCallCharge;
	private java.lang.String		freeFFChgAllowance;
	private java.lang.String		FFChangeCount;
	private java.lang.String		currencyCode;
	private double					promisedPaymentAmount;
	private java.util.Calendar		promisedPaymentDueDate;
	private int						promisedPaymentBalanceID;
	private java.util.Calendar		cosInstantiationTimeStamp;
	private AccumulatorEntity[]		accumulator;
	private SubscribedOffer[]		offer;
	private java.util.Calendar		loyaltyEnrollmentDate;
	private java.util.Calendar		nextLoyaltySyncDate;
	private double					loyaltyScaleRate;
	private int						loyaltyBonusScale;
	private java.util.Calendar		currentHappyHourActiveDate;
	private java.util.Calendar		currentHappyHourEndDate;
	private java.lang.String[]		currentHappyHours;
	private java.lang.String[]		futureHappyHours;
	private java.lang.String		homeArea1;
	private java.lang.String		homeArea2;
	private java.lang.String		homeArea3;
	private java.lang.String		homeArea4;
	private java.lang.String		preferredNumber;
	private java.lang.String		previousPreferredNumber;
	private java.util.Calendar		preferredNumberDate;

	public SubscriberEntity()
	{
	}

	public SubscriberEntity(
			BonusPlanEntity[] bonusPlan,
			AOBalanceEntity balances,
			java.lang.String SPName,
			java.util.Calendar creationDate,
			java.util.Calendar dateEnterActive,
			java.lang.String previousState,
			java.util.Calendar prevTransDate,
			java.util.Calendar lastTransDate,
			SubscriberAccountType accountType,
			java.lang.String groupName,
			double lastCallCharge,
			java.lang.String freeFFChgAllowance,
			java.lang.String FFChangeCount,
			java.lang.String currencyCode,
			double promisedPaymentAmount,
			java.util.Calendar promisedPaymentDueDate,
			int promisedPaymentBalanceID,
			java.util.Calendar cosInstantiationTimeStamp,
			AccumulatorEntity[] accumulator,
			SubscribedOffer[] offer,
			java.util.Calendar loyaltyEnrollmentDate,
			java.util.Calendar nextLoyaltySyncDate,
			double loyaltyScaleRate,
			int loyaltyBonusScale,
			java.util.Calendar currentHappyHourActiveDate,
			java.util.Calendar currentHappyHourEndDate,
			java.lang.String[] currentHappyHours,
			java.lang.String[] futureHappyHours,
			java.lang.String homeArea1,
			java.lang.String homeArea2,
			java.lang.String homeArea3,
			java.lang.String homeArea4,
			java.lang.String preferredNumber,
			java.lang.String previousPreferredNumber,
			java.util.Calendar preferredNumberDate)
	{
		this.bonusPlan = bonusPlan;
		this.balances = balances;
		this.SPName = SPName;
		this.creationDate = creationDate;
		this.dateEnterActive = dateEnterActive;
		this.previousState = previousState;
		this.prevTransDate = prevTransDate;
		this.lastTransDate = lastTransDate;
		this.accountType = accountType;
		this.groupName = groupName;
		this.lastCallCharge = lastCallCharge;
		this.freeFFChgAllowance = freeFFChgAllowance;
		this.FFChangeCount = FFChangeCount;
		this.currencyCode = currencyCode;
		this.promisedPaymentAmount = promisedPaymentAmount;
		this.promisedPaymentDueDate = promisedPaymentDueDate;
		this.promisedPaymentBalanceID = promisedPaymentBalanceID;
		this.cosInstantiationTimeStamp = cosInstantiationTimeStamp;
		this.accumulator = accumulator;
		this.offer = offer;
		this.loyaltyEnrollmentDate = loyaltyEnrollmentDate;
		this.nextLoyaltySyncDate = nextLoyaltySyncDate;
		this.loyaltyScaleRate = loyaltyScaleRate;
		this.loyaltyBonusScale = loyaltyBonusScale;
		this.currentHappyHourActiveDate = currentHappyHourActiveDate;
		this.currentHappyHourEndDate = currentHappyHourEndDate;
		this.currentHappyHours = currentHappyHours;
		this.futureHappyHours = futureHappyHours;
		this.homeArea1 = homeArea1;
		this.homeArea2 = homeArea2;
		this.homeArea3 = homeArea3;
		this.homeArea4 = homeArea4;
		this.preferredNumber = preferredNumber;
		this.previousPreferredNumber = previousPreferredNumber;
		this.preferredNumberDate = preferredNumberDate;
	}

	/**
	 * Gets the bonusPlan value for this SubscriberEntity.
	 * 
	 * @return bonusPlan
	 */
	public BonusPlanEntity[] getBonusPlan()
	{
		return bonusPlan;
	}

	/**
	 * Sets the bonusPlan value for this SubscriberEntity.
	 * 
	 * @param bonusPlan
	 */
	public void setBonusPlan(BonusPlanEntity[] bonusPlan)
	{
		this.bonusPlan = bonusPlan;
	}

	public BonusPlanEntity getBonusPlan(int i)
	{
		return this.bonusPlan[i];
	}

	public void setBonusPlan(int i, BonusPlanEntity _value)
	{
		this.bonusPlan[i] = _value;
	}

	/**
	 * Gets the balances value for this SubscriberEntity.
	 * 
	 * @return balances
	 */
	public AOBalanceEntity getBalances()
	{
		return balances;
	}

	/**
	 * Sets the balances value for this SubscriberEntity.
	 * 
	 * @param balances
	 */
	public void setBalances(AOBalanceEntity balances)
	{
		this.balances = balances;
	}

	/**
	 * Gets the SPName value for this SubscriberEntity.
	 * 
	 * @return SPName
	 */
	public java.lang.String getSPName()
	{
		return SPName;
	}

	/**
	 * Sets the SPName value for this SubscriberEntity.
	 * 
	 * @param SPName
	 */
	public void setSPName(java.lang.String SPName)
	{
		this.SPName = SPName;
	}

	/**
	 * Gets the creationDate value for this SubscriberEntity.
	 * 
	 * @return creationDate
	 */
	public java.util.Calendar getCreationDate()
	{
		return creationDate;
	}

	/**
	 * Sets the creationDate value for this SubscriberEntity.
	 * 
	 * @param creationDate
	 */
	public void setCreationDate(java.util.Calendar creationDate)
	{
		this.creationDate = creationDate;
	}

	/**
	 * Gets the dateEnterActive value for this SubscriberEntity.
	 * 
	 * @return dateEnterActive
	 */
	public java.util.Calendar getDateEnterActive()
	{
		return dateEnterActive;
	}

	/**
	 * Sets the dateEnterActive value for this SubscriberEntity.
	 * 
	 * @param dateEnterActive
	 */
	public void setDateEnterActive(java.util.Calendar dateEnterActive)
	{
		this.dateEnterActive = dateEnterActive;
	}

	/**
	 * Gets the previousState value for this SubscriberEntity.
	 * 
	 * @return previousState
	 */
	public java.lang.String getPreviousState()
	{
		return previousState;
	}

	/**
	 * Sets the previousState value for this SubscriberEntity.
	 * 
	 * @param previousState
	 */
	public void setPreviousState(java.lang.String previousState)
	{
		this.previousState = previousState;
	}

	/**
	 * Gets the prevTransDate value for this SubscriberEntity.
	 * 
	 * @return prevTransDate
	 */
	public java.util.Calendar getPrevTransDate()
	{
		return prevTransDate;
	}

	/**
	 * Sets the prevTransDate value for this SubscriberEntity.
	 * 
	 * @param prevTransDate
	 */
	public void setPrevTransDate(java.util.Calendar prevTransDate)
	{
		this.prevTransDate = prevTransDate;
	}

	/**
	 * Gets the lastTransDate value for this SubscriberEntity.
	 * 
	 * @return lastTransDate
	 */
	public java.util.Calendar getLastTransDate()
	{
		return lastTransDate;
	}

	/**
	 * Sets the lastTransDate value for this SubscriberEntity.
	 * 
	 * @param lastTransDate
	 */
	public void setLastTransDate(java.util.Calendar lastTransDate)
	{
		this.lastTransDate = lastTransDate;
	}

	/**
	 * Gets the accountType value for this SubscriberEntity.
	 * 
	 * @return accountType
	 */
	public SubscriberAccountType getAccountType()
	{
		return accountType;
	}

	/**
	 * Sets the accountType value for this SubscriberEntity.
	 * 
	 * @param accountType
	 */
	public void setAccountType(SubscriberAccountType accountType)
	{
		this.accountType = accountType;
	}

	/**
	 * Gets the groupName value for this SubscriberEntity.
	 * 
	 * @return groupName
	 */
	public java.lang.String getGroupName()
	{
		return groupName;
	}

	/**
	 * Sets the groupName value for this SubscriberEntity.
	 * 
	 * @param groupName
	 */
	public void setGroupName(java.lang.String groupName)
	{
		this.groupName = groupName;
	}

	/**
	 * Gets the lastCallCharge value for this SubscriberEntity.
	 * 
	 * @return lastCallCharge
	 */
	public double getLastCallCharge()
	{
		return lastCallCharge;
	}

	/**
	 * Sets the lastCallCharge value for this SubscriberEntity.
	 * 
	 * @param lastCallCharge
	 */
	public void setLastCallCharge(double lastCallCharge)
	{
		this.lastCallCharge = lastCallCharge;
	}

	/**
	 * Gets the freeFFChgAllowance value for this SubscriberEntity.
	 * 
	 * @return freeFFChgAllowance
	 */
	public java.lang.String getFreeFFChgAllowance()
	{
		return freeFFChgAllowance;
	}

	/**
	 * Sets the freeFFChgAllowance value for this SubscriberEntity.
	 * 
	 * @param freeFFChgAllowance
	 */
	public void setFreeFFChgAllowance(java.lang.String freeFFChgAllowance)
	{
		this.freeFFChgAllowance = freeFFChgAllowance;
	}

	/**
	 * Gets the FFChangeCount value for this SubscriberEntity.
	 * 
	 * @return FFChangeCount
	 */
	public java.lang.String getFFChangeCount()
	{
		return FFChangeCount;
	}

	/**
	 * Sets the FFChangeCount value for this SubscriberEntity.
	 * 
	 * @param FFChangeCount
	 */
	public void setFFChangeCount(java.lang.String FFChangeCount)
	{
		this.FFChangeCount = FFChangeCount;
	}

	/**
	 * Gets the currencyCode value for this SubscriberEntity.
	 * 
	 * @return currencyCode
	 */
	public java.lang.String getCurrencyCode()
	{
		return currencyCode;
	}

	/**
	 * Sets the currencyCode value for this SubscriberEntity.
	 * 
	 * @param currencyCode
	 */
	public void setCurrencyCode(java.lang.String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the promisedPaymentAmount value for this SubscriberEntity.
	 * 
	 * @return promisedPaymentAmount
	 */
	public double getPromisedPaymentAmount()
	{
		return promisedPaymentAmount;
	}

	/**
	 * Sets the promisedPaymentAmount value for this SubscriberEntity.
	 * 
	 * @param promisedPaymentAmount
	 */
	public void setPromisedPaymentAmount(double promisedPaymentAmount)
	{
		this.promisedPaymentAmount = promisedPaymentAmount;
	}

	/**
	 * Gets the promisedPaymentDueDate value for this SubscriberEntity.
	 * 
	 * @return promisedPaymentDueDate
	 */
	public java.util.Calendar getPromisedPaymentDueDate()
	{
		return promisedPaymentDueDate;
	}

	/**
	 * Sets the promisedPaymentDueDate value for this SubscriberEntity.
	 * 
	 * @param promisedPaymentDueDate
	 */
	public void setPromisedPaymentDueDate(java.util.Calendar promisedPaymentDueDate)
	{
		this.promisedPaymentDueDate = promisedPaymentDueDate;
	}

	/**
	 * Gets the promisedPaymentBalanceID value for this SubscriberEntity.
	 * 
	 * @return promisedPaymentBalanceID
	 */
	public int getPromisedPaymentBalanceID()
	{
		return promisedPaymentBalanceID;
	}

	/**
	 * Sets the promisedPaymentBalanceID value for this SubscriberEntity.
	 * 
	 * @param promisedPaymentBalanceID
	 */
	public void setPromisedPaymentBalanceID(int promisedPaymentBalanceID)
	{
		this.promisedPaymentBalanceID = promisedPaymentBalanceID;
	}

	/**
	 * Gets the cosInstantiationTimeStamp value for this SubscriberEntity.
	 * 
	 * @return cosInstantiationTimeStamp
	 */
	public java.util.Calendar getCosInstantiationTimeStamp()
	{
		return cosInstantiationTimeStamp;
	}

	/**
	 * Sets the cosInstantiationTimeStamp value for this SubscriberEntity.
	 * 
	 * @param cosInstantiationTimeStamp
	 */
	public void setCosInstantiationTimeStamp(java.util.Calendar cosInstantiationTimeStamp)
	{
		this.cosInstantiationTimeStamp = cosInstantiationTimeStamp;
	}

	/**
	 * Gets the accumulator value for this SubscriberEntity.
	 * 
	 * @return accumulator
	 */
	public AccumulatorEntity[] getAccumulator()
	{
		return accumulator;
	}

	/**
	 * Sets the accumulator value for this SubscriberEntity.
	 * 
	 * @param accumulator
	 */
	public void setAccumulator(AccumulatorEntity[] accumulator)
	{
		this.accumulator = accumulator;
	}

	public AccumulatorEntity getAccumulator(int i)
	{
		return this.accumulator[i];
	}

	public void setAccumulator(int i, AccumulatorEntity _value)
	{
		this.accumulator[i] = _value;
	}

	/**
	 * Gets the offer value for this SubscriberEntity.
	 * 
	 * @return offer
	 */
	public SubscribedOffer[] getOffer()
	{
		return offer;
	}

	/**
	 * Sets the offer value for this SubscriberEntity.
	 * 
	 * @param offer
	 */
	public void setOffer(SubscribedOffer[] offer)
	{
		this.offer = offer;
	}

	public SubscribedOffer getOffer(int i)
	{
		return this.offer[i];
	}

	public void setOffer(int i, SubscribedOffer _value)
	{
		this.offer[i] = _value;
	}

	/**
	 * Gets the loyaltyEnrollmentDate value for this SubscriberEntity.
	 * 
	 * @return loyaltyEnrollmentDate
	 */
	public java.util.Calendar getLoyaltyEnrollmentDate()
	{
		return loyaltyEnrollmentDate;
	}

	/**
	 * Sets the loyaltyEnrollmentDate value for this SubscriberEntity.
	 * 
	 * @param loyaltyEnrollmentDate
	 */
	public void setLoyaltyEnrollmentDate(java.util.Calendar loyaltyEnrollmentDate)
	{
		this.loyaltyEnrollmentDate = loyaltyEnrollmentDate;
	}

	/**
	 * Gets the nextLoyaltySyncDate value for this SubscriberEntity.
	 * 
	 * @return nextLoyaltySyncDate
	 */
	public java.util.Calendar getNextLoyaltySyncDate()
	{
		return nextLoyaltySyncDate;
	}

	/**
	 * Sets the nextLoyaltySyncDate value for this SubscriberEntity.
	 * 
	 * @param nextLoyaltySyncDate
	 */
	public void setNextLoyaltySyncDate(java.util.Calendar nextLoyaltySyncDate)
	{
		this.nextLoyaltySyncDate = nextLoyaltySyncDate;
	}

	/**
	 * Gets the loyaltyScaleRate value for this SubscriberEntity.
	 * 
	 * @return loyaltyScaleRate
	 */
	public double getLoyaltyScaleRate()
	{
		return loyaltyScaleRate;
	}

	/**
	 * Sets the loyaltyScaleRate value for this SubscriberEntity.
	 * 
	 * @param loyaltyScaleRate
	 */
	public void setLoyaltyScaleRate(double loyaltyScaleRate)
	{
		this.loyaltyScaleRate = loyaltyScaleRate;
	}

	/**
	 * Gets the loyaltyBonusScale value for this SubscriberEntity.
	 * 
	 * @return loyaltyBonusScale
	 */
	public int getLoyaltyBonusScale()
	{
		return loyaltyBonusScale;
	}

	/**
	 * Sets the loyaltyBonusScale value for this SubscriberEntity.
	 * 
	 * @param loyaltyBonusScale
	 */
	public void setLoyaltyBonusScale(int loyaltyBonusScale)
	{
		this.loyaltyBonusScale = loyaltyBonusScale;
	}

	/**
	 * Gets the currentHappyHourActiveDate value for this SubscriberEntity.
	 * 
	 * @return currentHappyHourActiveDate
	 */
	public java.util.Calendar getCurrentHappyHourActiveDate()
	{
		return currentHappyHourActiveDate;
	}

	/**
	 * Sets the currentHappyHourActiveDate value for this SubscriberEntity.
	 * 
	 * @param currentHappyHourActiveDate
	 */
	public void setCurrentHappyHourActiveDate(java.util.Calendar currentHappyHourActiveDate)
	{
		this.currentHappyHourActiveDate = currentHappyHourActiveDate;
	}

	/**
	 * Gets the currentHappyHourEndDate value for this SubscriberEntity.
	 * 
	 * @return currentHappyHourEndDate
	 */
	public java.util.Calendar getCurrentHappyHourEndDate()
	{
		return currentHappyHourEndDate;
	}

	/**
	 * Sets the currentHappyHourEndDate value for this SubscriberEntity.
	 * 
	 * @param currentHappyHourEndDate
	 */
	public void setCurrentHappyHourEndDate(java.util.Calendar currentHappyHourEndDate)
	{
		this.currentHappyHourEndDate = currentHappyHourEndDate;
	}

	/**
	 * Gets the currentHappyHours value for this SubscriberEntity.
	 * 
	 * @return currentHappyHours
	 */
	public java.lang.String[] getCurrentHappyHours()
	{
		return currentHappyHours;
	}

	/**
	 * Sets the currentHappyHours value for this SubscriberEntity.
	 * 
	 * @param currentHappyHours
	 */
	public void setCurrentHappyHours(java.lang.String[] currentHappyHours)
	{
		this.currentHappyHours = currentHappyHours;
	}

	public java.lang.String getCurrentHappyHours(int i)
	{
		return this.currentHappyHours[i];
	}

	public void setCurrentHappyHours(int i, java.lang.String _value)
	{
		this.currentHappyHours[i] = _value;
	}

	/**
	 * Gets the futureHappyHours value for this SubscriberEntity.
	 * 
	 * @return futureHappyHours
	 */
	public java.lang.String[] getFutureHappyHours()
	{
		return futureHappyHours;
	}

	/**
	 * Sets the futureHappyHours value for this SubscriberEntity.
	 * 
	 * @param futureHappyHours
	 */
	public void setFutureHappyHours(java.lang.String[] futureHappyHours)
	{
		this.futureHappyHours = futureHappyHours;
	}

	public java.lang.String getFutureHappyHours(int i)
	{
		return this.futureHappyHours[i];
	}

	public void setFutureHappyHours(int i, java.lang.String _value)
	{
		this.futureHappyHours[i] = _value;
	}

	/**
	 * Gets the homeArea1 value for this SubscriberEntity.
	 * 
	 * @return homeArea1
	 */
	public java.lang.String getHomeArea1()
	{
		return homeArea1;
	}

	/**
	 * Sets the homeArea1 value for this SubscriberEntity.
	 * 
	 * @param homeArea1
	 */
	public void setHomeArea1(java.lang.String homeArea1)
	{
		this.homeArea1 = homeArea1;
	}

	/**
	 * Gets the homeArea2 value for this SubscriberEntity.
	 * 
	 * @return homeArea2
	 */
	public java.lang.String getHomeArea2()
	{
		return homeArea2;
	}

	/**
	 * Sets the homeArea2 value for this SubscriberEntity.
	 * 
	 * @param homeArea2
	 */
	public void setHomeArea2(java.lang.String homeArea2)
	{
		this.homeArea2 = homeArea2;
	}

	/**
	 * Gets the homeArea3 value for this SubscriberEntity.
	 * 
	 * @return homeArea3
	 */
	public java.lang.String getHomeArea3()
	{
		return homeArea3;
	}

	/**
	 * Sets the homeArea3 value for this SubscriberEntity.
	 * 
	 * @param homeArea3
	 */
	public void setHomeArea3(java.lang.String homeArea3)
	{
		this.homeArea3 = homeArea3;
	}

	/**
	 * Gets the homeArea4 value for this SubscriberEntity.
	 * 
	 * @return homeArea4
	 */
	public java.lang.String getHomeArea4()
	{
		return homeArea4;
	}

	/**
	 * Sets the homeArea4 value for this SubscriberEntity.
	 * 
	 * @param homeArea4
	 */
	public void setHomeArea4(java.lang.String homeArea4)
	{
		this.homeArea4 = homeArea4;
	}

	/**
	 * Gets the preferredNumber value for this SubscriberEntity.
	 * 
	 * @return preferredNumber
	 */
	public java.lang.String getPreferredNumber()
	{
		return preferredNumber;
	}

	/**
	 * Sets the preferredNumber value for this SubscriberEntity.
	 * 
	 * @param preferredNumber
	 */
	public void setPreferredNumber(java.lang.String preferredNumber)
	{
		this.preferredNumber = preferredNumber;
	}

	/**
	 * Gets the previousPreferredNumber value for this SubscriberEntity.
	 * 
	 * @return previousPreferredNumber
	 */
	public java.lang.String getPreviousPreferredNumber()
	{
		return previousPreferredNumber;
	}

	/**
	 * Sets the previousPreferredNumber value for this SubscriberEntity.
	 * 
	 * @param previousPreferredNumber
	 */
	public void setPreviousPreferredNumber(java.lang.String previousPreferredNumber)
	{
		this.previousPreferredNumber = previousPreferredNumber;
	}

	/**
	 * Gets the preferredNumberDate value for this SubscriberEntity.
	 * 
	 * @return preferredNumberDate
	 */
	public java.util.Calendar getPreferredNumberDate()
	{
		return preferredNumberDate;
	}

	/**
	 * Sets the preferredNumberDate value for this SubscriberEntity.
	 * 
	 * @param preferredNumberDate
	 */
	public void setPreferredNumberDate(java.util.Calendar preferredNumberDate)
	{
		this.preferredNumberDate = preferredNumberDate;
	}

}
