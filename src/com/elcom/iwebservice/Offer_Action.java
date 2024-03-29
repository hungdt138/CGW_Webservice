/**
 * Offer_Action.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Offer_Action
{
	private java.lang.String			_value_;
	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	public Offer_Action()
	{
		// TODO Auto-generated constructor stub
	}

	// Constructor
	@SuppressWarnings("unchecked")
	protected Offer_Action(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String	_SUBSCRIPTION	= "SUBSCRIPTION";
	public static final java.lang.String	_UNSUBSCRIPTION	= "UNSUBSCRIPTION";
	public static final java.lang.String	_RCSTATE		= "RCSTATE";
	public static final Offer_Action		SUBSCRIPTION	= new Offer_Action(_SUBSCRIPTION);
	public static final Offer_Action		UNSUBSCRIPTION	= new Offer_Action(_UNSUBSCRIPTION);
	public static final Offer_Action		RCSTATE			= new Offer_Action(_RCSTATE);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static Offer_Action fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		Offer_Action enumeration = (Offer_Action)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static Offer_Action fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}
}
