package com.elcom.iwebservice;

public class AccumulatorBase
{
	private java.lang.String	accumulatorName;
	private java.lang.String	amount;

	public AccumulatorBase()
	{
	}

	public AccumulatorBase(
			java.lang.String accumulatorName,
			java.lang.String amount)
	{
		this.accumulatorName = accumulatorName;
		this.amount = amount;
	}

	/**
	 * Gets the accumulatorName value for this AccumulatorBase.
	 * 
	 * @return accumulatorName
	 */
	public java.lang.String getAccumulatorName()
	{
		return accumulatorName;
	}

	/**
	 * Sets the accumulatorName value for this AccumulatorBase.
	 * 
	 * @param accumulatorName
	 */
	public void setAccumulatorName(java.lang.String accumulatorName)
	{
		this.accumulatorName = accumulatorName;
	}

	/**
	 * Gets the amount value for this AccumulatorBase.
	 * 
	 * @return amount
	 */
	public java.lang.String getAmount()
	{
		return amount;
	}

	/**
	 * Sets the amount value for this AccumulatorBase.
	 * 
	 * @param amount
	 */
	public void setAmount(java.lang.String amount)
	{
		this.amount = amount;
	}

}
