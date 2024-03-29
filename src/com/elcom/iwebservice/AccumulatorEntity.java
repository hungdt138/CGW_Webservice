package com.elcom.iwebservice;

public class AccumulatorEntity extends AccumulatorBase
{
	private int					zeroDay;
	private int					period;
	private java.lang.String	currencyCode;
	private java.util.Calendar	nextResetAccumulatorTS;

	public AccumulatorEntity()
	{
	}

	public AccumulatorEntity(
			int zeroDay,
			int period,
			java.lang.String currencyCode,
			java.util.Calendar nextResetAccumulatorTS)
	{
		this.zeroDay = zeroDay;
		this.period = period;
		this.currencyCode = currencyCode;
		this.nextResetAccumulatorTS = nextResetAccumulatorTS;
	}

	/**
	 * Gets the zeroDay value for this AccumulatorEntity.
	 * 
	 * @return zeroDay
	 */
	public int getZeroDay()
	{
		return zeroDay;
	}

	/**
	 * Sets the zeroDay value for this AccumulatorEntity.
	 * 
	 * @param zeroDay
	 */
	public void setZeroDay(int zeroDay)
	{
		this.zeroDay = zeroDay;
	}

	/**
	 * Gets the period value for this AccumulatorEntity.
	 * 
	 * @return period
	 */
	public int getPeriod()
	{
		return period;
	}

	/**
	 * Sets the period value for this AccumulatorEntity.
	 * 
	 * @param period
	 */
	public void setPeriod(int period)
	{
		this.period = period;
	}

	/**
	 * Gets the currencyCode value for this AccumulatorEntity.
	 * 
	 * @return currencyCode
	 */
	public java.lang.String getCurrencyCode()
	{
		return currencyCode;
	}

	/**
	 * Sets the currencyCode value for this AccumulatorEntity.
	 * 
	 * @param currencyCode
	 */
	public void setCurrencyCode(java.lang.String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the nextResetAccumulatorTS value for this AccumulatorEntity.
	 * 
	 * @return nextResetAccumulatorTS
	 */
	public java.util.Calendar getNextResetAccumulatorTS()
	{
		return nextResetAccumulatorTS;
	}

	/**
	 * Sets the nextResetAccumulatorTS value for this AccumulatorEntity.
	 * 
	 * @param nextResetAccumulatorTS
	 */
	public void setNextResetAccumulatorTS(java.util.Calendar nextResetAccumulatorTS)
	{
		this.nextResetAccumulatorTS = nextResetAccumulatorTS;
	}

}
