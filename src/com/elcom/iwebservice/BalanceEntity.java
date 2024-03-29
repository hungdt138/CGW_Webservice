/**
 * BalanceEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class BalanceEntity extends BalanceEntityBase
{
	private double		availableBalance;
	private FundsType	fundsType;
	private double		maximumSpendingLimit;
	private double		availableSpendingLimit;
	private int			precisionPoint;
	private boolean		exclusiveBalance;

	public BalanceEntity()
	{
		super();
		availableBalance = 0;
		fundsType = new FundsType();
		maximumSpendingLimit = 0;
		availableSpendingLimit = 0;
		precisionPoint = 0;
		exclusiveBalance = false;
	}

	public BalanceEntity(
			double availableBalance,
			FundsType fundsType,
			double maximumSpendingLimit,
			double availableSpendingLimit,
			int precisionPoint,
			boolean exclusiveBalance)
	{
		this.availableBalance = availableBalance;
		this.fundsType = fundsType;
		this.maximumSpendingLimit = maximumSpendingLimit;
		this.availableSpendingLimit = availableSpendingLimit;
		this.precisionPoint = precisionPoint;
		this.exclusiveBalance = exclusiveBalance;
	}

	/**
	 * Gets the availableBalance value for this BalanceEntity.
	 * 
	 * @return availableBalance
	 */
	public double getAvailableBalance()
	{
		return availableBalance;
	}

	/**
	 * Sets the availableBalance value for this BalanceEntity.
	 * 
	 * @param availableBalance
	 */
	public void setAvailableBalance(double availableBalance)
	{
		this.availableBalance = availableBalance;
	}

	/**
	 * Gets the fundsType value for this BalanceEntity.
	 * 
	 * @return fundsType
	 */
	public FundsType getFundsType()
	{
		return fundsType;
	}

	/**
	 * Sets the fundsType value for this BalanceEntity.
	 * 
	 * @param fundsType
	 */
	public void setFundsType(FundsType fundsType)
	{
		this.fundsType = fundsType;
	}

	/**
	 * Gets the maximumSpendingLimit value for this BalanceEntity.
	 * 
	 * @return maximumSpendingLimit
	 */
	public double getMaximumSpendingLimit()
	{
		return maximumSpendingLimit;
	}

	/**
	 * Sets the maximumSpendingLimit value for this BalanceEntity.
	 * 
	 * @param maximumSpendingLimit
	 */
	public void setMaximumSpendingLimit(double maximumSpendingLimit)
	{
		this.maximumSpendingLimit = maximumSpendingLimit;
	}

	/**
	 * Gets the availableSpendingLimit value for this BalanceEntity.
	 * 
	 * @return availableSpendingLimit
	 */
	public double getAvailableSpendingLimit()
	{
		return availableSpendingLimit;
	}

	/**
	 * Sets the availableSpendingLimit value for this BalanceEntity.
	 * 
	 * @param availableSpendingLimit
	 */
	public void setAvailableSpendingLimit(double availableSpendingLimit)
	{
		this.availableSpendingLimit = availableSpendingLimit;
	}

	/**
	 * Gets the precisionPoint value for this BalanceEntity.
	 * 
	 * @return precisionPoint
	 */
	public int getPrecisionPoint()
	{
		return precisionPoint;
	}

	/**
	 * Sets the precisionPoint value for this BalanceEntity.
	 * 
	 * @param precisionPoint
	 */
	public void setPrecisionPoint(int precisionPoint)
	{
		this.precisionPoint = precisionPoint;
	}

	/**
	 * Gets the exclusiveBalance value for this BalanceEntity.
	 * 
	 * @return exclusiveBalance
	 */
	public boolean isExclusiveBalance()
	{
		return exclusiveBalance;
	}

	/**
	 * Sets the exclusiveBalance value for this BalanceEntity.
	 * 
	 * @param exclusiveBalance
	 */
	public void setExclusiveBalance(boolean exclusiveBalance)
	{
		this.exclusiveBalance = exclusiveBalance;
	}

}
