package com.elcom.iwebservice;

public class ChangeExpiredDateResp extends ResponseBase
{
	String	balance;
	String	expiredDate;

	public void setExpiredDate(String expiredDate)
	{
		this.expiredDate = expiredDate;
	}

	public String getExpiredDate()
	{
		return this.expiredDate;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public String getBalance()
	{
		return this.balance;
	}
}
