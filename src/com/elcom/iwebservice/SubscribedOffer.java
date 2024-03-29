/**
 * SubscribedOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class SubscribedOffer extends OfferBase
{
	private Offer_State			state;
	private java.util.Calendar	instantiationTime;

	public SubscribedOffer()
	{
	}

	public SubscribedOffer(
			Offer_State state,
			java.util.Calendar instantiationTime)
	{
		this.state = state;
		this.instantiationTime = instantiationTime;
	}

	/**
	 * Gets the state value for this SubscribedOffer.
	 * 
	 * @return state
	 */
	public Offer_State getState()
	{
		return state;
	}

	/**
	 * Sets the state value for this SubscribedOffer.
	 * 
	 * @param state
	 */
	public void setState(Offer_State state)
	{
		this.state = state;
	}

	/**
	 * Gets the instantiationTime value for this SubscribedOffer.
	 * 
	 * @return instantiationTime
	 */
	public java.util.Calendar getInstantiationTime()
	{
		return instantiationTime;
	}

	/**
	 * Sets the instantiationTime value for this SubscribedOffer.
	 * 
	 * @param instantiationTime
	 */
	public void setInstantiationTime(java.util.Calendar instantiationTime)
	{
		this.instantiationTime = instantiationTime;
	}

}
