package com.elcom.iwebservice;

public class SetBalanceResp extends ResponseBase
{

	public SetBalanceResp()
	{
		super();
	}

	public String	balance;
	public int		value;

	public String getBalance()
	{
		return balance;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

}
