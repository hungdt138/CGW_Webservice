package com.elcom.iwebservice;

public class AccumulatorHistory extends AccumulatorBase
{
	private double	changeAmount;

	public AccumulatorHistory()
	{
	}

	public AccumulatorHistory(
			double changeAmount)
	{
		this.changeAmount = changeAmount;
	}

	/**
	 * Gets the changeAmount value for this AccumulatorHistory.
	 * 
	 * @return changeAmount
	 */
	public double getChangeAmount()
	{
		return changeAmount;
	}

	/**
	 * Sets the changeAmount value for this AccumulatorHistory.
	 * 
	 * @param changeAmount
	 */
	public void setChangeAmount(double changeAmount)
	{
		this.changeAmount = changeAmount;
	}

}
