package com.elcom.iwebservice;

public class BalanceInfo
{
	private String	Name;
	private double	Value;
	private String	ExpireTime;

	public void setName(String Name)
	{
		this.Name = Name;
	}

	public String getName()
	{
		return this.Name;
	}

	public void setValue(double Value)
	{
		this.Value = Value;
	}

	public double getValue()
	{
		return this.Value;
	}

	public void setExpireTime(String ExpireTime)
	{
		this.ExpireTime = ExpireTime;
	}

	public String getExpireTime()
	{
		return this.ExpireTime;
	}
}
