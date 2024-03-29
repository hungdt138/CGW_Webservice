/**
 * Offer_Action_Reason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Offer_Action_Reason
{
	private java.lang.String	_value_;

	public Offer_Action_Reason()
	{

	}

	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	// Constructor
	@SuppressWarnings("unchecked")
	protected Offer_Action_Reason(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String	_SUBSCRIPTION				= "SUBSCRIPTION";
	public static final java.lang.String	_RCT_SUBSCRIPTION			= "RCT_SUBSCRIPTION";
	public static final java.lang.String	_COS_CHANGE_SUBSCRIPTION	= "COS_CHANGE_SUBSCRIPTION";
	public static final java.lang.String	_CCWS_OPERATION				= "CCWS_OPERATION";
	public static final java.lang.String	_COS_CHANGE_UNSUBSCRIPTION	= "COS_CHANGE_UNSUBSCRIPTION";
	public static final java.lang.String	_BATCH_OPERATION			= "BATCH_OPERATION";
	public static final java.lang.String	_RC_ENABLE					= "RC_ENABLE";
	public static final java.lang.String	_RC_DISABLE					= "RC_DISABLE";
	public static final java.lang.String	_RC_INACTIVE				= "RC_INACTIVE";
	public static final Offer_Action_Reason	SUBSCRIPTION				= new Offer_Action_Reason(_SUBSCRIPTION);
	public static final Offer_Action_Reason	RCT_SUBSCRIPTION			= new Offer_Action_Reason(_RCT_SUBSCRIPTION);
	public static final Offer_Action_Reason	COS_CHANGE_SUBSCRIPTION		= new Offer_Action_Reason(_COS_CHANGE_SUBSCRIPTION);
	public static final Offer_Action_Reason	CCWS_OPERATION				= new Offer_Action_Reason(_CCWS_OPERATION);
	public static final Offer_Action_Reason	COS_CHANGE_UNSUBSCRIPTION	= new Offer_Action_Reason(_COS_CHANGE_UNSUBSCRIPTION);
	public static final Offer_Action_Reason	BATCH_OPERATION				= new Offer_Action_Reason(_BATCH_OPERATION);
	public static final Offer_Action_Reason	RC_ENABLE					= new Offer_Action_Reason(_RC_ENABLE);
	public static final Offer_Action_Reason	RC_DISABLE					= new Offer_Action_Reason(_RC_DISABLE);
	public static final Offer_Action_Reason	RC_INACTIVE					= new Offer_Action_Reason(_RC_INACTIVE);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static Offer_Action_Reason fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		Offer_Action_Reason enumeration = (Offer_Action_Reason)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static Offer_Action_Reason fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}
}
