/**
 * ReservationAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class ReservationAmount
{
	private java.lang.String		balanceName;
	private java.math.BigDecimal	totalReservationAmount;
	private java.math.BigDecimal	totalConsAmount;

	public ReservationAmount()
	{
	}

	public ReservationAmount(
			java.lang.String balanceName,
			java.math.BigDecimal totalReservationAmount,
			java.math.BigDecimal totalConsAmount)
	{
		this.balanceName = balanceName;
		this.totalReservationAmount = totalReservationAmount;
		this.totalConsAmount = totalConsAmount;
	}

	/**
	 * Gets the balanceName value for this ReservationAmount.
	 * 
	 * @return balanceName
	 */
	public java.lang.String getBalanceName()
	{
		return balanceName;
	}

	/**
	 * Sets the balanceName value for this ReservationAmount.
	 * 
	 * @param balanceName
	 */
	public void setBalanceName(java.lang.String balanceName)
	{
		this.balanceName = balanceName;
	}

	/**
	 * Gets the totalReservationAmount value for this ReservationAmount.
	 * 
	 * @return totalReservationAmount
	 */
	public java.math.BigDecimal getTotalReservationAmount()
	{
		return totalReservationAmount;
	}

	/**
	 * Sets the totalReservationAmount value for this ReservationAmount.
	 * 
	 * @param totalReservationAmount
	 */
	public void setTotalReservationAmount(java.math.BigDecimal totalReservationAmount)
	{
		this.totalReservationAmount = totalReservationAmount;
	}

	/**
	 * Gets the totalConsAmount value for this ReservationAmount.
	 * 
	 * @return totalConsAmount
	 */
	public java.math.BigDecimal getTotalConsAmount()
	{
		return totalConsAmount;
	}

	/**
	 * Sets the totalConsAmount value for this ReservationAmount.
	 * 
	 * @param totalConsAmount
	 */
	public void setTotalConsAmount(java.math.BigDecimal totalConsAmount)
	{
		this.totalConsAmount = totalConsAmount;
	}

}
