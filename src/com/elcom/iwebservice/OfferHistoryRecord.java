/**
 * OfferHistoryRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class OfferHistoryRecord extends OfferBase
{
	private java.lang.String		subscriberID;
	private java.lang.String		identity;
	private java.lang.String		username;
	private java.lang.String		serviceProvider;
	private java.lang.String		groupID;
	private SubscriberAccountType	accountType;
	private Offer_Action			action;
	private java.util.Calendar		actionDate;
	private Offer_Action_Reason		reason;
	private Offer_Type				type;

	public OfferHistoryRecord()
	{
	}

	public OfferHistoryRecord(
			java.lang.String subscriberID,
			java.lang.String identity,
			java.lang.String username,
			java.lang.String serviceProvider,
			java.lang.String groupID,
			SubscriberAccountType accountType,
			Offer_Action action,
			java.util.Calendar actionDate,
			Offer_Action_Reason reason,
			Offer_Type type)
	{
		this.subscriberID = subscriberID;
		this.identity = identity;
		this.username = username;
		this.serviceProvider = serviceProvider;
		this.groupID = groupID;
		this.accountType = accountType;
		this.action = action;
		this.actionDate = actionDate;
		this.reason = reason;
		this.type = type;
	}

	/**
	 * Gets the subscriberID value for this OfferHistoryRecord.
	 * 
	 * @return subscriberID
	 */
	public java.lang.String getSubscriberID()
	{
		return subscriberID;
	}

	/**
	 * Sets the subscriberID value for this OfferHistoryRecord.
	 * 
	 * @param subscriberID
	 */
	public void setSubscriberID(java.lang.String subscriberID)
	{
		this.subscriberID = subscriberID;
	}

	/**
	 * Gets the identity value for this OfferHistoryRecord.
	 * 
	 * @return identity
	 */
	public java.lang.String getIdentity()
	{
		return identity;
	}

	/**
	 * Sets the identity value for this OfferHistoryRecord.
	 * 
	 * @param identity
	 */
	public void setIdentity(java.lang.String identity)
	{
		this.identity = identity;
	}

	/**
	 * Gets the username value for this OfferHistoryRecord.
	 * 
	 * @return username
	 */
	public java.lang.String getUsername()
	{
		return username;
	}

	/**
	 * Sets the username value for this OfferHistoryRecord.
	 * 
	 * @param username
	 */
	public void setUsername(java.lang.String username)
	{
		this.username = username;
	}

	/**
	 * Gets the serviceProvider value for this OfferHistoryRecord.
	 * 
	 * @return serviceProvider
	 */
	public java.lang.String getServiceProvider()
	{
		return serviceProvider;
	}

	/**
	 * Sets the serviceProvider value for this OfferHistoryRecord.
	 * 
	 * @param serviceProvider
	 */
	public void setServiceProvider(java.lang.String serviceProvider)
	{
		this.serviceProvider = serviceProvider;
	}

	/**
	 * Gets the groupID value for this OfferHistoryRecord.
	 * 
	 * @return groupID
	 */
	public java.lang.String getGroupID()
	{
		return groupID;
	}

	/**
	 * Sets the groupID value for this OfferHistoryRecord.
	 * 
	 * @param groupID
	 */
	public void setGroupID(java.lang.String groupID)
	{
		this.groupID = groupID;
	}

	/**
	 * Gets the accountType value for this OfferHistoryRecord.
	 * 
	 * @return accountType
	 */
	public SubscriberAccountType getAccountType()
	{
		return accountType;
	}

	/**
	 * Sets the accountType value for this OfferHistoryRecord.
	 * 
	 * @param accountType
	 */
	public void setAccountType(SubscriberAccountType accountType)
	{
		this.accountType = accountType;
	}

	/**
	 * Gets the action value for this OfferHistoryRecord.
	 * 
	 * @return action
	 */
	public Offer_Action getAction()
	{
		return action;
	}

	/**
	 * Sets the action value for this OfferHistoryRecord.
	 * 
	 * @param action
	 */
	public void setAction(Offer_Action action)
	{
		this.action = action;
	}

	/**
	 * Gets the actionDate value for this OfferHistoryRecord.
	 * 
	 * @return actionDate
	 */
	public java.util.Calendar getActionDate()
	{
		return actionDate;
	}

	/**
	 * Sets the actionDate value for this OfferHistoryRecord.
	 * 
	 * @param actionDate
	 */
	public void setActionDate(java.util.Calendar actionDate)
	{
		this.actionDate = actionDate;
	}

	/**
	 * Gets the reason value for this OfferHistoryRecord.
	 * 
	 * @return reason
	 */
	public Offer_Action_Reason getReason()
	{
		return reason;
	}

	/**
	 * Sets the reason value for this OfferHistoryRecord.
	 * 
	 * @param reason
	 */
	public void setReason(Offer_Action_Reason reason)
	{
		this.reason = reason;
	}

	/**
	 * Gets the type value for this OfferHistoryRecord.
	 * 
	 * @return type
	 */
	public Offer_Type getType()
	{
		return type;
	}

	/**
	 * Sets the type value for this OfferHistoryRecord.
	 * 
	 * @param type
	 */
	public void setType(Offer_Type type)
	{
		this.type = type;
	}

}
