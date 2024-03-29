/**
 * Offer_State.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Offer_State
{
	private java.lang.String			_value_;
	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	public Offer_State()
	{
		// TODO Auto-generated constructor stub
	}

	// Constructor
	@SuppressWarnings("unchecked")
	protected Offer_State(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String	_ENABLED	= "ENABLED";
	public static final java.lang.String	_DISABLED	= "DISABLED";
	public static final java.lang.String	_INACTIVE	= "INACTIVE";
	public static final Offer_State			ENABLED		= new Offer_State(_ENABLED);
	public static final Offer_State			DISABLED	= new Offer_State(_DISABLED);
	public static final Offer_State			INACTIVE	= new Offer_State(_INACTIVE);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static Offer_State fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		Offer_State enumeration = (Offer_State)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static Offer_State fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}

}
