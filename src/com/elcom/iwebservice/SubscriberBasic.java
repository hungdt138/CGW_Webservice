/**
 * SubscriberBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class SubscriberBasic
{
	private java.lang.String	subscriberID;
	private java.lang.String	identity;

	public SubscriberBasic()
	{
	}

	public SubscriberBasic(
			java.lang.String subscriberID,
			java.lang.String identity)
	{
		this.subscriberID = subscriberID;
		this.identity = identity;
	}

	/**
	 * Gets the subscriberID value for this SubscriberBasic.
	 * 
	 * @return subscriberID
	 */
	public java.lang.String getSubscriberID()
	{
		return subscriberID;
	}

	/**
	 * Sets the subscriberID value for this SubscriberBasic.
	 * 
	 * @param subscriberID
	 */
	public void setSubscriberID(java.lang.String subscriberID)
	{
		this.subscriberID = subscriberID;
	}

	/**
	 * Gets the identity value for this SubscriberBasic.
	 * 
	 * @return identity
	 */
	public java.lang.String getIdentity()
	{
		return identity;
	}

	/**
	 * Sets the identity value for this SubscriberBasic.
	 * 
	 * @param identity
	 */
	public void setIdentity(java.lang.String identity)
	{
		this.identity = identity;
	}

}
