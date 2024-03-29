/**
 * MonetaryTransactionRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

import java.util.Calendar;

public class MonetaryTransactionRecord
{
	private java.util.Calendar	modDate;
	private double				bonusAwarded;
	private double				discountAwarded;

	private AOBalanceEntity		balances;

	public MonetaryTransactionRecord()
	{
	}

	public MonetaryTransactionRecord(Calendar modDate, double bonusAwarded, double discountAwarded, AOBalanceEntity balances)
	{
		super();
		this.modDate = modDate;
		this.bonusAwarded = bonusAwarded;
		this.discountAwarded = discountAwarded;
		this.balances = balances;
	}

	public AOBalanceEntity getBalances()
	{
		return balances;
	}

	public void setBalances(AOBalanceEntity balances)
	{
		this.balances = balances;
	}

	public double getBonusAwarded()
	{
		return bonusAwarded;
	}

	public void setBonusAwarded(double bonusAwarded)
	{
		this.bonusAwarded = bonusAwarded;
	}

	public double getDiscountAwarded()
	{
		return discountAwarded;
	}

	public void setDiscountAwarded(double discountAwarded)
	{
		this.discountAwarded = discountAwarded;
	}

	public java.util.Calendar getModDate()
	{
		return modDate;
	}

	public void setModDate(java.util.Calendar modDate)
	{
		this.modDate = modDate;
	}

}
