package com.elcom.iwebservice;

public class DeductBalanceResp extends ResponseBase
{
	String	balance;
	int		deductValue;

	public String getBalance()
	{
		return balance;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public int getDeductValue()
	{
		return deductValue;
	}

	public void setDeductValue(int deductValue)
	{
		this.deductValue = deductValue;
	}

}
