/**
 * BalanceEntityBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

import java.util.Calendar;

public class BalanceEntityBase
{
	private double				balance;
	private java.util.Calendar	accountExpiration;
	private java.lang.String	balanceName;
	private double				nextMaximumSpendingLimit;
	private double				totalSpendingLimit;

	public BalanceEntityBase()
	{
		balance = 0;
		// accountExpiration = Calendar.getInstance();
		balanceName = "";
		nextMaximumSpendingLimit = 0;
		totalSpendingLimit = 0;
	}

	public BalanceEntityBase(
			double balance,
			java.util.Calendar accountExpiration,
			java.lang.String balanceName,
			double nextMaximumSpendingLimit,
			double totalSpendingLimit)
	{
		this.balance = balance;
		this.accountExpiration = accountExpiration;
		this.balanceName = balanceName;
		this.nextMaximumSpendingLimit = nextMaximumSpendingLimit;
		this.totalSpendingLimit = totalSpendingLimit;
	}

	/**
	 * Gets the balance value for this BalanceEntityBase.
	 * 
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Sets the balance value for this BalanceEntityBase.
	 * 
	 * @param balance
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	/**
	 * Gets the accountExpiration value for this BalanceEntityBase.
	 * 
	 * @return accountExpiration
	 */
	public java.util.Calendar getAccountExpiration()
	{
		return accountExpiration;
	}

	/**
	 * Sets the accountExpiration value for this BalanceEntityBase.
	 * 
	 * @param accountExpiration
	 */
	public void setAccountExpiration(java.util.Calendar accountExpiration)
	{
		this.accountExpiration = accountExpiration;
	}

	/**
	 * Gets the balanceName value for this BalanceEntityBase.
	 * 
	 * @return balanceName
	 */
	public java.lang.String getBalanceName()
	{
		return balanceName;
	}

	/**
	 * Sets the balanceName value for this BalanceEntityBase.
	 * 
	 * @param balanceName
	 */
	public void setBalanceName(java.lang.String balanceName)
	{
		this.balanceName = balanceName;
	}

	/**
	 * Gets the nextMaximumSpendingLimit value for this BalanceEntityBase.
	 * 
	 * @return nextMaximumSpendingLimit
	 */
	public double getNextMaximumSpendingLimit()
	{
		return nextMaximumSpendingLimit;
	}

	/**
	 * Sets the nextMaximumSpendingLimit value for this BalanceEntityBase.
	 * 
	 * @param nextMaximumSpendingLimit
	 */
	public void setNextMaximumSpendingLimit(double nextMaximumSpendingLimit)
	{
		this.nextMaximumSpendingLimit = nextMaximumSpendingLimit;
	}

	/**
	 * Gets the totalSpendingLimit value for this BalanceEntityBase.
	 * 
	 * @return totalSpendingLimit
	 */
	public double getTotalSpendingLimit()
	{
		return totalSpendingLimit;
	}

	/**
	 * Sets the totalSpendingLimit value for this BalanceEntityBase.
	 * 
	 * @param totalSpendingLimit
	 */
	public void setTotalSpendingLimit(double totalSpendingLimit)
	{
		this.totalSpendingLimit = totalSpendingLimit;
	}
}
