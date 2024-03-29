package com.elcom.iwebservice;

public class AOBalanceEntity
{
	private BalanceEntity[]	balance;

	public AOBalanceEntity()
	{
	}

	public AOBalanceEntity(
			BalanceEntity[] balance)
	{
		this.balance = balance;
	}

	/**
	 * Gets the balance value for this ArrayOfBalanceEntity.
	 * 
	 * @return balance
	 */
	public BalanceEntity[] getBalance()
	{
		return balance;
	}

	/**
	 * Sets the balance value for this ArrayOfBalanceEntity.
	 * 
	 * @param balance
	 */
	public void setBalance(BalanceEntity[] balance)
	{
		this.balance = balance;
	}

	public BalanceEntity getBalance(int i)
	{
		return this.balance[i];
	}

	public void setBalance(int i, BalanceEntity _value)
	{
		this.balance[i] = _value;
	}

}
