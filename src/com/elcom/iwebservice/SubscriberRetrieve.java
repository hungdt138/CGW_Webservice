package com.elcom.iwebservice;

public class SubscriberRetrieve extends SubscriberBase
{
	private SubscriberEntity			subscriberData;
	private AOCallHistory				callHistories;
	private AOMonetaryTransactionRecord	monetaryTransactionsRecords;
	private PSTransaction[]				paymentServerTransaction;
	private AORechargeHistory			rechargeHistories;
	@SuppressWarnings("unused")
	private AOOSAHistory				OSAHistories;
	private AOOfferHistoryRecord		offerHistories;
	private CUGMembers					CUGMembers;
	private AOReservation				reservations;
	private AOSubscriberPeriodicCharge	periodicCharges;
	private AOIdentityHistory			identityHistories;
	private AOCircleMembership			circles;
	private DiameterOCSHistory[]		diameterOCSHistoryRecords;
	private FandFPhonebookHistory[]		fandFPhonebookHistoryRecords;

	public SubscriberRetrieve()
	{
	}

	public SubscriberRetrieve(
			SubscriberEntity subscriberData,
			AOCallHistory callHistories,
			AOMonetaryTransactionRecord monetaryTransactionsRecords,
			PSTransaction[] paymentServerTransaction,
			AORechargeHistory rechargeHistories,
			// ArrayOfOSAHistory OSAHistories,
			AOOfferHistoryRecord offerHistories,
			CUGMembers CUGMembers,
			AOReservation reservations,
			AOSubscriberPeriodicCharge periodicCharges,
			AOIdentityHistory identityHistories,
			AOCircleMembership circles,
			DiameterOCSHistory[] diameterOCSHistoryRecords,
			FandFPhonebookHistory[] fandFPhonebookHistoryRecords)
	{
		this.subscriberData = subscriberData;
		this.callHistories = callHistories;
		this.monetaryTransactionsRecords = monetaryTransactionsRecords;
		this.paymentServerTransaction = paymentServerTransaction;
		this.rechargeHistories = rechargeHistories;
		// this.OSAHistories = OSAHistories;
		this.offerHistories = offerHistories;
		this.CUGMembers = CUGMembers;
		this.reservations = reservations;
		this.periodicCharges = periodicCharges;
		this.identityHistories = identityHistories;
		this.circles = circles;
		this.diameterOCSHistoryRecords = diameterOCSHistoryRecords;
		this.fandFPhonebookHistoryRecords = fandFPhonebookHistoryRecords;
	}

	/**
	 * Gets the subscriberData value for this SubscriberRetrieve.
	 * 
	 * @return subscriberData
	 */
	public SubscriberEntity getSubscriberData()
	{
		return subscriberData;
	}

	/**
	 * Sets the subscriberData value for this SubscriberRetrieve.
	 * 
	 * @param subscriberData
	 */
	public void setSubscriberData(SubscriberEntity subscriberData)
	{
		this.subscriberData = subscriberData;
	}

	/**
	 * Gets the callHistories value for this SubscriberRetrieve.
	 * 
	 * @return callHistories
	 */
	public AOCallHistory getCallHistories()
	{
		return callHistories;
	}

	/**
	 * Sets the callHistories value for this SubscriberRetrieve.
	 * 
	 * @param callHistories
	 */
	public void setCallHistories(AOCallHistory callHistories)
	{
		this.callHistories = callHistories;
	}

	/**
	 * Gets the monetaryTransactionsRecords value for this SubscriberRetrieve.
	 * 
	 * @return monetaryTransactionsRecords
	 */
	public AOMonetaryTransactionRecord getMonetaryTransactionsRecords()
	{
		return monetaryTransactionsRecords;
	}

	/**
	 * Sets the monetaryTransactionsRecords value for this SubscriberRetrieve.
	 * 
	 * @param monetaryTransactionsRecords
	 */
	public void setMonetaryTransactionsRecords(AOMonetaryTransactionRecord monetaryTransactionsRecords)
	{
		this.monetaryTransactionsRecords = monetaryTransactionsRecords;
	}

	/**
	 * Gets the paymentServerTransaction value for this SubscriberRetrieve.
	 * 
	 * @return paymentServerTransaction
	 */
	public PSTransaction[] getPaymentServerTransaction()
	{
		return paymentServerTransaction;
	}

	/**
	 * Sets the paymentServerTransaction value for this SubscriberRetrieve.
	 * 
	 * @param paymentServerTransaction
	 */
	public void setPaymentServerTransaction(PSTransaction[] paymentServerTransaction)
	{
		this.paymentServerTransaction = paymentServerTransaction;
	}

	public PSTransaction getPaymentServerTransaction(int i)
	{
		return this.paymentServerTransaction[i];
	}

	public void setPaymentServerTransaction(int i, PSTransaction _value)
	{
		this.paymentServerTransaction[i] = _value;
	}

	/**
	 * Gets the rechargeHistories value for this SubscriberRetrieve.
	 * 
	 * @return rechargeHistories
	 */
	public AORechargeHistory getRechargeHistories()
	{
		return rechargeHistories;
	}

	/**
	 * Sets the rechargeHistories value for this SubscriberRetrieve.
	 * 
	 * @param rechargeHistories
	 */
	public void setRechargeHistories(AORechargeHistory rechargeHistories)
	{
		this.rechargeHistories = rechargeHistories;
	}

	/**
	 * Gets the OSAHistories value for this SubscriberRetrieve.
	 * 
	 * @return OSAHistories
	 */
	// public ArrayOfOSAHistory getOSAHistories() {
	// return OSAHistories;
	// }
	//
	//
	// /**
	// * Sets the OSAHistories value for this SubscriberRetrieve.
	// *
	// * @param OSAHistories
	// */
	// public void setOSAHistories( ArrayOfOSAHistory OSAHistories) {
	// this.OSAHistories = OSAHistories;
	// }

	/**
	 * Gets the offerHistories value for this SubscriberRetrieve.
	 * 
	 * @return offerHistories
	 */
	public AOOfferHistoryRecord getOfferHistories()
	{
		return offerHistories;
	}

	/**
	 * Sets the offerHistories value for this SubscriberRetrieve.
	 * 
	 * @param offerHistories
	 */
	public void setOfferHistories(AOOfferHistoryRecord offerHistories)
	{
		this.offerHistories = offerHistories;
	}

	/**
	 * Gets the CUGMembers value for this SubscriberRetrieve.
	 * 
	 * @return CUGMembers
	 */
	public CUGMembers getCUGMembers()
	{
		return CUGMembers;
	}

	/**
	 * Sets the CUGMembers value for this SubscriberRetrieve.
	 * 
	 * @param CUGMembers
	 */
	public void setCUGMembers(CUGMembers CUGMembers)
	{
		this.CUGMembers = CUGMembers;
	}

	/**
	 * Gets the reservations value for this SubscriberRetrieve.
	 * 
	 * @return reservations
	 */
	public AOReservation getReservations()
	{
		return reservations;
	}

	/**
	 * Sets the reservations value for this SubscriberRetrieve.
	 * 
	 * @param reservations
	 */
	public void setReservations(AOReservation reservations)
	{
		this.reservations = reservations;
	}

	/**
	 * Gets the periodicCharges value for this SubscriberRetrieve.
	 * 
	 * @return periodicCharges
	 */
	public AOSubscriberPeriodicCharge getPeriodicCharges()
	{
		return periodicCharges;
	}

	/**
	 * Sets the periodicCharges value for this SubscriberRetrieve.
	 * 
	 * @param periodicCharges
	 */
	public void setPeriodicCharges(AOSubscriberPeriodicCharge periodicCharges)
	{
		this.periodicCharges = periodicCharges;
	}

	/**
	 * Gets the identityHistories value for this SubscriberRetrieve.
	 * 
	 * @return identityHistories
	 */
	public AOIdentityHistory getIdentityHistories()
	{
		return identityHistories;
	}

	/**
	 * Sets the identityHistories value for this SubscriberRetrieve.
	 * 
	 * @param identityHistories
	 */
	public void setIdentityHistories(AOIdentityHistory identityHistories)
	{
		this.identityHistories = identityHistories;
	}

	/**
	 * Gets the circles value for this SubscriberRetrieve.
	 * 
	 * @return circles
	 */
	public AOCircleMembership getCircles()
	{
		return circles;
	}

	/**
	 * Sets the circles value for this SubscriberRetrieve.
	 * 
	 * @param circles
	 */
	public void setCircles(AOCircleMembership circles)
	{
		this.circles = circles;
	}

	/**
	 * Gets the diameterOCSHistoryRecords value for this SubscriberRetrieve.
	 * 
	 * @return diameterOCSHistoryRecords
	 */
	public DiameterOCSHistory[] getDiameterOCSHistoryRecords()
	{
		return diameterOCSHistoryRecords;
	}

	/**
	 * Sets the diameterOCSHistoryRecords value for this SubscriberRetrieve.
	 * 
	 * @param diameterOCSHistoryRecords
	 */
	public void setDiameterOCSHistoryRecords(DiameterOCSHistory[] diameterOCSHistoryRecords)
	{
		this.diameterOCSHistoryRecords = diameterOCSHistoryRecords;
	}

	public DiameterOCSHistory getDiameterOCSHistoryRecords(int i)
	{
		return this.diameterOCSHistoryRecords[i];
	}

	public void setDiameterOCSHistoryRecords(int i, DiameterOCSHistory _value)
	{
		this.diameterOCSHistoryRecords[i] = _value;
	}

	/**
	 * Gets the fandFPhonebookHistoryRecords value for this SubscriberRetrieve.
	 * 
	 * @return fandFPhonebookHistoryRecords
	 */
	public FandFPhonebookHistory[] getFandFPhonebookHistoryRecords()
	{
		return fandFPhonebookHistoryRecords;
	}

	/**
	 * Sets the fandFPhonebookHistoryRecords value for this SubscriberRetrieve.
	 * 
	 * @param fandFPhonebookHistoryRecords
	 */
	public void setFandFPhonebookHistoryRecords(FandFPhonebookHistory[] fandFPhonebookHistoryRecords)
	{
		this.fandFPhonebookHistoryRecords = fandFPhonebookHistoryRecords;
	}

	public FandFPhonebookHistory getFandFPhonebookHistoryRecords(int i)
	{
		return this.fandFPhonebookHistoryRecords[i];
	}

	public void setFandFPhonebookHistoryRecords(int i, FandFPhonebookHistory _value)
	{
		this.fandFPhonebookHistoryRecords[i] = _value;
	}

}
