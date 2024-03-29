package com.elcom.iwebservice;

public class Accumulator
{
	private java.lang.String	accumulatorName;
	private long				accumulatorId;
	private long				resetPoint;
	private long				period;
	private long				count_type;
	private long				accumulator_type;
	private java.lang.String	unitTypeName;

	public Accumulator()
	{
	}

	public Accumulator(
			java.lang.String accumulatorName,
			long accumulatorId,
			long resetPoint,
			long period,
			long count_type,
			long accumulator_type,
			java.lang.String unitTypeName)
	{
		this.accumulatorName = accumulatorName;
		this.accumulatorId = accumulatorId;
		this.resetPoint = resetPoint;
		this.period = period;
		this.count_type = count_type;
		this.accumulator_type = accumulator_type;
		this.unitTypeName = unitTypeName;
	}

	/**
	 * Gets the accumulatorName value for this Accumulator.
	 * 
	 * @return accumulatorName
	 */
	public java.lang.String getAccumulatorName()
	{
		return accumulatorName;
	}

	/**
	 * Sets the accumulatorName value for this Accumulator.
	 * 
	 * @param accumulatorName
	 */
	public void setAccumulatorName(java.lang.String accumulatorName)
	{
		this.accumulatorName = accumulatorName;
	}

	/**
	 * Gets the accumulatorId value for this Accumulator.
	 * 
	 * @return accumulatorId
	 */
	public long getAccumulatorId()
	{
		return accumulatorId;
	}

	/**
	 * Sets the accumulatorId value for this Accumulator.
	 * 
	 * @param accumulatorId
	 */
	public void setAccumulatorId(long accumulatorId)
	{
		this.accumulatorId = accumulatorId;
	}

	/**
	 * Gets the resetPoint value for this Accumulator.
	 * 
	 * @return resetPoint
	 */
	public long getResetPoint()
	{
		return resetPoint;
	}

	/**
	 * Sets the resetPoint value for this Accumulator.
	 * 
	 * @param resetPoint
	 */
	public void setResetPoint(long resetPoint)
	{
		this.resetPoint = resetPoint;
	}

	/**
	 * Gets the period value for this Accumulator.
	 * 
	 * @return period
	 */
	public long getPeriod()
	{
		return period;
	}

	/**
	 * Sets the period value for this Accumulator.
	 * 
	 * @param period
	 */
	public void setPeriod(long period)
	{
		this.period = period;
	}

	/**
	 * Gets the count_type value for this Accumulator.
	 * 
	 * @return count_type
	 */
	public long getCount_type()
	{
		return count_type;
	}

	/**
	 * Sets the count_type value for this Accumulator.
	 * 
	 * @param count_type
	 */
	public void setCount_type(long count_type)
	{
		this.count_type = count_type;
	}

	/**
	 * Gets the accumulator_type value for this Accumulator.
	 * 
	 * @return accumulator_type
	 */
	public long getAccumulator_type()
	{
		return accumulator_type;
	}

	/**
	 * Sets the accumulator_type value for this Accumulator.
	 * 
	 * @param accumulator_type
	 */
	public void setAccumulator_type(long accumulator_type)
	{
		this.accumulator_type = accumulator_type;
	}

	/**
	 * Gets the unitTypeName value for this Accumulator.
	 * 
	 * @return unitTypeName
	 */
	public java.lang.String getUnitTypeName()
	{
		return unitTypeName;
	}

	/**
	 * Sets the unitTypeName value for this Accumulator.
	 * 
	 * @param unitTypeName
	 */
	public void setUnitTypeName(java.lang.String unitTypeName)
	{
		this.unitTypeName = unitTypeName;
	}

}
