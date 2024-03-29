/**
 * SubscriberAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class SubscriberAccountType
{
	private java.lang.String			_value_;
	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	public SubscriberAccountType()
	{
		// TODO Auto-generated constructor stub
	}

	// Constructor
	@SuppressWarnings("unchecked")
	protected SubscriberAccountType(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String		_GroupOwner	= "GroupOwner";
	public static final java.lang.String		_MemberSL	= "MemberSL";
	public static final java.lang.String		_Individual	= "Individual";
	public static final java.lang.String		_MemberBL	= "MemberBL";
	public static final java.lang.String		_MemberBoth	= "MemberBoth";
	public static final SubscriberAccountType	GroupOwner	= new SubscriberAccountType(_GroupOwner);
	public static final SubscriberAccountType	MemberSL	= new SubscriberAccountType(_MemberSL);
	public static final SubscriberAccountType	Individual	= new SubscriberAccountType(_Individual);
	public static final SubscriberAccountType	MemberBL	= new SubscriberAccountType(_MemberBL);
	public static final SubscriberAccountType	MemberBoth	= new SubscriberAccountType(_MemberBoth);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static SubscriberAccountType fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		SubscriberAccountType enumeration = (SubscriberAccountType)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static SubscriberAccountType fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}
}
