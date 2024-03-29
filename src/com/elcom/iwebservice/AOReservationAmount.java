package com.elcom.iwebservice;

public class AOReservationAmount
{
	private ReservationAmount[]	reservationAmount;

	public AOReservationAmount()
	{
	}

	public AOReservationAmount(
			ReservationAmount[] reservationAmount)
	{
		this.reservationAmount = reservationAmount;
	}

	/**
	 * Gets the reservationAmount value for this ArrayOfReservationAmount.
	 * 
	 * @return reservationAmount
	 */
	public ReservationAmount[] getReservationAmount()
	{
		return reservationAmount;
	}

	/**
	 * Sets the reservationAmount value for this ArrayOfReservationAmount.
	 * 
	 * @param reservationAmount
	 */
	public void setReservationAmount(ReservationAmount[] reservationAmount)
	{
		this.reservationAmount = reservationAmount;
	}

	public ReservationAmount getReservationAmount(int i)
	{
		return this.reservationAmount[i];
	}

	public void setReservationAmount(int i, ReservationAmount _value)
	{
		this.reservationAmount[i] = _value;
	}

}
