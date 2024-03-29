/**
 * IdentityHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class IdentityHistory
{
	private java.util.Calendar	startDateTime;
	private java.util.Calendar	endDateTime;
	private java.lang.String	oldIdentity;
	private java.lang.String	newIdentity;

	public IdentityHistory()
	{
	}

	public IdentityHistory(
			java.util.Calendar startDateTime,
			java.util.Calendar endDateTime,
			java.lang.String oldIdentity,
			java.lang.String newIdentity)
	{
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.oldIdentity = oldIdentity;
		this.newIdentity = newIdentity;
	}

	/**
	 * Gets the startDateTime value for this IdentityHistory.
	 * 
	 * @return startDateTime
	 */
	public java.util.Calendar getStartDateTime()
	{
		return startDateTime;
	}

	/**
	 * Sets the startDateTime value for this IdentityHistory.
	 * 
	 * @param startDateTime
	 */
	public void setStartDateTime(java.util.Calendar startDateTime)
	{
		this.startDateTime = startDateTime;
	}

	/**
	 * Gets the endDateTime value for this IdentityHistory.
	 * 
	 * @return endDateTime
	 */
	public java.util.Calendar getEndDateTime()
	{
		return endDateTime;
	}

	/**
	 * Sets the endDateTime value for this IdentityHistory.
	 * 
	 * @param endDateTime
	 */
	public void setEndDateTime(java.util.Calendar endDateTime)
	{
		this.endDateTime = endDateTime;
	}

	/**
	 * Gets the oldIdentity value for this IdentityHistory.
	 * 
	 * @return oldIdentity
	 */
	public java.lang.String getOldIdentity()
	{
		return oldIdentity;
	}

	/**
	 * Sets the oldIdentity value for this IdentityHistory.
	 * 
	 * @param oldIdentity
	 */
	public void setOldIdentity(java.lang.String oldIdentity)
	{
		this.oldIdentity = oldIdentity;
	}

	/**
	 * Gets the newIdentity value for this IdentityHistory.
	 * 
	 * @return newIdentity
	 */
	public java.lang.String getNewIdentity()
	{
		return newIdentity;
	}

	/**
	 * Sets the newIdentity value for this IdentityHistory.
	 * 
	 * @param newIdentity
	 */
	public void setNewIdentity(java.lang.String newIdentity)
	{
		this.newIdentity = newIdentity;
	}

}
