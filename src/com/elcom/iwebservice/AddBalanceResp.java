package com.elcom.iwebservice;

public class AddBalanceResp extends ResponseBase
{
	String	balance;
	int		addValue;

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public String getBalance()
	{
		return this.balance;
	}

	public void setAddValue(int addValue)
	{
		this.addValue = addValue;
	}

	public int getAddValue()
	{
		return this.addValue;
	}

}
