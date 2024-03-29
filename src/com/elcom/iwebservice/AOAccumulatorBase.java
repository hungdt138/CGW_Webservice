package com.elcom.iwebservice;

public class AOAccumulatorBase
{
	private AccumulatorBase[]	accumulatorBase;

	public AOAccumulatorBase()
	{
	}

	public AOAccumulatorBase(
			AccumulatorBase[] accumulatorBase)
	{
		this.accumulatorBase = accumulatorBase;
	}

	/**
	 * Gets the accumulatorBase value for this ArrayOfAccumulatorBase.
	 * 
	 * @return accumulatorBase
	 */
	public AccumulatorBase[] getAccumulatorBase()
	{
		return accumulatorBase;
	}

	/**
	 * Sets the accumulatorBase value for this ArrayOfAccumulatorBase.
	 * 
	 * @param accumulatorBase
	 */
	public void setAccumulatorBase(AccumulatorBase[] accumulatorBase)
	{
		this.accumulatorBase = accumulatorBase;
	}

	public AccumulatorBase getAccumulatorBase(int i)
	{
		return this.accumulatorBase[i];
	}

	public void setAccumulatorBase(int i, AccumulatorBase _value)
	{
		this.accumulatorBase[i] = _value;
	}

}
