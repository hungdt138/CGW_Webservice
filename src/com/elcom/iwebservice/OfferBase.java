/**
 * OfferBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class OfferBase
{
	private java.lang.String	name;
	private java.util.Calendar	serviceStart;
	private java.util.Calendar	serviceEnd;

	public OfferBase()
	{
	}

	public OfferBase(
			java.lang.String name,
			java.util.Calendar serviceStart,
			java.util.Calendar serviceEnd)
	{
		this.name = name;
		this.serviceStart = serviceStart;
		this.serviceEnd = serviceEnd;
	}

	/**
	 * Gets the name value for this OfferBase.
	 * 
	 * @return name
	 */
	public java.lang.String getName()
	{
		return name;
	}

	/**
	 * Sets the name value for this OfferBase.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name)
	{
		this.name = name;
	}

	/**
	 * Gets the serviceStart value for this OfferBase.
	 * 
	 * @return serviceStart
	 */
	public java.util.Calendar getServiceStart()
	{
		return serviceStart;
	}

	/**
	 * Sets the serviceStart value for this OfferBase.
	 * 
	 * @param serviceStart
	 */
	public void setServiceStart(java.util.Calendar serviceStart)
	{
		this.serviceStart = serviceStart;
	}

	/**
	 * Gets the serviceEnd value for this OfferBase.
	 * 
	 * @return serviceEnd
	 */
	public java.util.Calendar getServiceEnd()
	{
		return serviceEnd;
	}

	/**
	 * Sets the serviceEnd value for this OfferBase.
	 * 
	 * @param serviceEnd
	 */
	public void setServiceEnd(java.util.Calendar serviceEnd)
	{
		this.serviceEnd = serviceEnd;
	}

}
