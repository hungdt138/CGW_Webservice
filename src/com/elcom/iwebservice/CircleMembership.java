/**
 * CircleMembership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class CircleMembership
{
	private int					position;
	private java.lang.String	circleName;

	public CircleMembership()
	{
	}

	public CircleMembership(
			int position,
			java.lang.String circleName)
	{
		this.position = position;
		this.circleName = circleName;
	}

	/**
	 * Gets the position value for this CircleMembership.
	 * 
	 * @return position
	 */
	public int getPosition()
	{
		return position;
	}

	/**
	 * Sets the position value for this CircleMembership.
	 * 
	 * @param position
	 */
	public void setPosition(int position)
	{
		this.position = position;
	}

	/**
	 * Gets the circleName value for this CircleMembership.
	 * 
	 * @return circleName
	 */
	public java.lang.String getCircleName()
	{
		return circleName;
	}

	/**
	 * Sets the circleName value for this CircleMembership.
	 * 
	 * @param circleName
	 */
	public void setCircleName(java.lang.String circleName)
	{
		this.circleName = circleName;
	}

}
