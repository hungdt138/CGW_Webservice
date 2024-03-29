/**
 * FandFAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class FandFAction
{
	private java.lang.String			_value_;

	@SuppressWarnings("rawtypes")
	private static java.util.HashMap	_table_	= new java.util.HashMap();

	// Constructor
	@SuppressWarnings("unchecked")
	protected FandFAction(java.lang.String value)
	{
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String	_ADD	= "ADD";
	public static final java.lang.String	_DELETE	= "DELETE";
	public static final FandFAction			ADD		= new FandFAction(_ADD);
	public static final FandFAction			DELETE	= new FandFAction(_DELETE);

	public java.lang.String getValue()
	{
		return _value_;
	}

	public static FandFAction fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		FandFAction enumeration = (FandFAction)
				_table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static FandFAction fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException
	{
		return fromValue(value);
	}
}
