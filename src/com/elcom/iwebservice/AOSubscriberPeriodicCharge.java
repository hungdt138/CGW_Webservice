package com.elcom.iwebservice;

public class AOSubscriberPeriodicCharge
{
	private SubscriberPeriodicCharge[]	periodicCharge;

	public AOSubscriberPeriodicCharge()
	{
	}

	public AOSubscriberPeriodicCharge(
			SubscriberPeriodicCharge[] periodicCharge)
	{
		this.periodicCharge = periodicCharge;
	}

	/**
	 * Gets the periodicCharge value for this ArrayOfSubscriberPeriodicCharge.
	 * 
	 * @return periodicCharge
	 */
	public SubscriberPeriodicCharge[] getPeriodicCharge()
	{
		return periodicCharge;
	}

	/**
	 * Sets the periodicCharge value for this ArrayOfSubscriberPeriodicCharge.
	 * 
	 * @param periodicCharge
	 */
	public void setPeriodicCharge(SubscriberPeriodicCharge[] periodicCharge)
	{
		this.periodicCharge = periodicCharge;
	}

	public SubscriberPeriodicCharge getPeriodicCharge(int i)
	{
		return this.periodicCharge[i];
	}

	public void setPeriodicCharge(int i, SubscriberPeriodicCharge _value)
	{
		this.periodicCharge[i] = _value;
	}

}
