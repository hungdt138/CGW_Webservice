/**
 * FandFPhonebookHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class FandFPhonebookHistory
{
	private java.lang.String	subscriberID;
	private java.lang.String	identityType;
	private java.lang.String	phoneNumber;
	private FandFAction			action;
	private java.util.Calendar	transDate;
	private java.lang.String	sourceApplication;
	private java.lang.String	loginName;
	private java.lang.String	comments;
	private int					position;

	public FandFPhonebookHistory()
	{
	}

	public FandFPhonebookHistory(
			java.lang.String subscriberID,
			java.lang.String identityType,
			java.lang.String phoneNumber,
			FandFAction action,
			java.util.Calendar transDate,
			java.lang.String sourceApplication,
			java.lang.String loginName,
			java.lang.String comments,
			int position)
	{
		this.subscriberID = subscriberID;
		this.identityType = identityType;
		this.phoneNumber = phoneNumber;
		this.action = action;
		this.transDate = transDate;
		this.sourceApplication = sourceApplication;
		this.loginName = loginName;
		this.comments = comments;
		this.position = position;
	}

	/**
	 * Gets the subscriberID value for this FandFPhonebookHistory.
	 * 
	 * @return subscriberID
	 */
	public java.lang.String getSubscriberID()
	{
		return subscriberID;
	}

	/**
	 * Sets the subscriberID value for this FandFPhonebookHistory.
	 * 
	 * @param subscriberID
	 */
	public void setSubscriberID(java.lang.String subscriberID)
	{
		this.subscriberID = subscriberID;
	}

	/**
	 * Gets the identityType value for this FandFPhonebookHistory.
	 * 
	 * @return identityType
	 */
	public java.lang.String getIdentityType()
	{
		return identityType;
	}

	/**
	 * Sets the identityType value for this FandFPhonebookHistory.
	 * 
	 * @param identityType
	 */
	public void setIdentityType(java.lang.String identityType)
	{
		this.identityType = identityType;
	}

	/**
	 * Gets the phoneNumber value for this FandFPhonebookHistory.
	 * 
	 * @return phoneNumber
	 */
	public java.lang.String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * Sets the phoneNumber value for this FandFPhonebookHistory.
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(java.lang.String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the action value for this FandFPhonebookHistory.
	 * 
	 * @return action
	 */
	public FandFAction getAction()
	{
		return action;
	}

	/**
	 * Sets the action value for this FandFPhonebookHistory.
	 * 
	 * @param action
	 */
	public void setAction(FandFAction action)
	{
		this.action = action;
	}

	/**
	 * Gets the transDate value for this FandFPhonebookHistory.
	 * 
	 * @return transDate
	 */
	public java.util.Calendar getTransDate()
	{
		return transDate;
	}

	/**
	 * Sets the transDate value for this FandFPhonebookHistory.
	 * 
	 * @param transDate
	 */
	public void setTransDate(java.util.Calendar transDate)
	{
		this.transDate = transDate;
	}

	/**
	 * Gets the sourceApplication value for this FandFPhonebookHistory.
	 * 
	 * @return sourceApplication
	 */
	public java.lang.String getSourceApplication()
	{
		return sourceApplication;
	}

	/**
	 * Sets the sourceApplication value for this FandFPhonebookHistory.
	 * 
	 * @param sourceApplication
	 */
	public void setSourceApplication(java.lang.String sourceApplication)
	{
		this.sourceApplication = sourceApplication;
	}

	/**
	 * Gets the loginName value for this FandFPhonebookHistory.
	 * 
	 * @return loginName
	 */
	public java.lang.String getLoginName()
	{
		return loginName;
	}

	/**
	 * Sets the loginName value for this FandFPhonebookHistory.
	 * 
	 * @param loginName
	 */
	public void setLoginName(java.lang.String loginName)
	{
		this.loginName = loginName;
	}

	/**
	 * Gets the comments value for this FandFPhonebookHistory.
	 * 
	 * @return comments
	 */
	public java.lang.String getComments()
	{
		return comments;
	}

	/**
	 * Sets the comments value for this FandFPhonebookHistory.
	 * 
	 * @param comments
	 */
	public void setComments(java.lang.String comments)
	{
		this.comments = comments;
	}

	/**
	 * Gets the position value for this FandFPhonebookHistory.
	 * 
	 * @return position
	 */
	public int getPosition()
	{
		return position;
	}

	/**
	 * Sets the position value for this FandFPhonebookHistory.
	 * 
	 * @param position
	 */
	public void setPosition(int position)
	{
		this.position = position;
	}

}
