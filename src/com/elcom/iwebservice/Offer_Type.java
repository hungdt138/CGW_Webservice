/**
 * Offer_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Offer_Type
{
	private java.lang.String			_value_;
	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	public Offer_Type()
	{
		// TODO Auto-generated constructor stub
	}

	// Constructor
	@SuppressWarnings("unchecked")
	protected Offer_Type(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String	_USAGE				= "USAGE";
	public static final java.lang.String	_DISCOUNT_AWARD		= "DISCOUNT_AWARD";
	public static final java.lang.String	_BONUS_AWARD		= "BONUS_AWARD";
	public static final java.lang.String	_OVERRIDE			= "OVERRIDE";
	public static final java.lang.String	_OVERRIDE_BBT		= "OVERRIDE_BBT";
	public static final java.lang.String	_OVERRIDE_HAPPYHOUR	= "OVERRIDE_HAPPYHOUR";
	public static final java.lang.String	_OVERRIDE_HOMEAREA	= "OVERRIDE_HOMEAREA";
	public static final Offer_Type			USAGE				= new Offer_Type(_USAGE);
	public static final Offer_Type			DISCOUNT_AWARD		= new Offer_Type(_DISCOUNT_AWARD);
	public static final Offer_Type			BONUS_AWARD			= new Offer_Type(_BONUS_AWARD);
	public static final Offer_Type			OVERRIDE			= new Offer_Type(_OVERRIDE);
	public static final Offer_Type			OVERRIDE_BBT		= new Offer_Type(_OVERRIDE_BBT);
	public static final Offer_Type			OVERRIDE_HAPPYHOUR	= new Offer_Type(_OVERRIDE_HAPPYHOUR);
	public static final Offer_Type			OVERRIDE_HOMEAREA	= new Offer_Type(_OVERRIDE_HOMEAREA);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static Offer_Type fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		Offer_Type enumeration = (Offer_Type)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static Offer_Type fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}
}
