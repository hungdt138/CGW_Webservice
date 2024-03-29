package com.elcom.iwebservice;

public class AOCircleMembership
{
	private CircleMembership[]	circleMembership;

	public AOCircleMembership()
	{
	}

	public AOCircleMembership(
			CircleMembership[] circleMembership)
	{
		this.circleMembership = circleMembership;
	}

	/**
	 * Gets the circleMembership value for this ArrayOfCircleMembership.
	 * 
	 * @return circleMembership
	 */
	public CircleMembership[] getCircleMembership()
	{
		return circleMembership;
	}

	/**
	 * Sets the circleMembership value for this ArrayOfCircleMembership.
	 * 
	 * @param circleMembership
	 */
	public void setCircleMembership(CircleMembership[] circleMembership)
	{
		this.circleMembership = circleMembership;
	}

	public CircleMembership getCircleMembership(int i)
	{
		return this.circleMembership[i];
	}

	public void setCircleMembership(int i, CircleMembership _value)
	{
		this.circleMembership[i] = _value;
	}

}
