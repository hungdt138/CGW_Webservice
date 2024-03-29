package com.elcom.iwebservice;

public class AOReservation
{
	private Reservation[]	reservations;

	public AOReservation()
	{
	}

	public AOReservation(
			Reservation[] reservations)
	{
		this.reservations = reservations;
	}

	/**
	 * Gets the reservations value for this ArrayOfReservation.
	 * 
	 * @return reservations
	 */
	public Reservation[] getReservations()
	{
		return reservations;
	}

	/**
	 * Sets the reservations value for this ArrayOfReservation.
	 * 
	 * @param reservations
	 */
	public void setReservations(Reservation[] reservations)
	{
		this.reservations = reservations;
	}

	public Reservation getReservations(int i)
	{
		return this.reservations[i];
	}

	public void setReservations(int i, Reservation _value)
	{
		this.reservations[i] = _value;
	}

}
