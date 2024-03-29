/**
 * RechargeHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class RechargeHistory
{
	private java.lang.String	rechargeOriginator;
	private java.util.Calendar	rechargeDate;
	private java.lang.String	cardNumber;
	private long				expirationOffset;
	private long				voucherType;
	private long				batchNumber;
	private long				serialNumber;
	private java.lang.String	comment;
	private double				faceValue;
	private double				billedBalanceAmount;

	public RechargeHistory()
	{
	}

	public RechargeHistory(
			java.lang.String rechargeOriginator,
			java.util.Calendar rechargeDate,
			java.lang.String cardNumber,
			long expirationOffset,
			long voucherType,
			long batchNumber,
			long serialNumber,
			java.lang.String comment,
			double faceValue,
			double billedBalanceAmount)
	{
		this.rechargeOriginator = rechargeOriginator;
		this.rechargeDate = rechargeDate;
		this.cardNumber = cardNumber;
		this.expirationOffset = expirationOffset;
		this.voucherType = voucherType;
		this.batchNumber = batchNumber;
		this.serialNumber = serialNumber;
		this.comment = comment;
		this.faceValue = faceValue;
		this.billedBalanceAmount = billedBalanceAmount;
	}

	public long getBatchNumber()
	{
		return batchNumber;
	}

	public void setBatchNumber(long batchNumber)
	{
		this.batchNumber = batchNumber;
	}

	public double getBilledBalanceAmount()
	{
		return billedBalanceAmount;
	}

	public void setBilledBalanceAmount(double billedBalanceAmount)
	{
		this.billedBalanceAmount = billedBalanceAmount;
	}

	public java.lang.String getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(java.lang.String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public java.lang.String getComment()
	{
		return comment;
	}

	public void setComment(java.lang.String comment)
	{
		this.comment = comment;
	}

	public long getExpirationOffset()
	{
		return expirationOffset;
	}

	public void setExpirationOffset(long expirationOffset)
	{
		this.expirationOffset = expirationOffset;
	}

	public double getFaceValue()
	{
		return faceValue;
	}

	public void setFaceValue(double faceValue)
	{
		this.faceValue = faceValue;
	}

	public java.util.Calendar getRechargeDate()
	{
		return rechargeDate;
	}

	public void setRechargeDate(java.util.Calendar rechargeDate)
	{
		this.rechargeDate = rechargeDate;
	}

	public java.lang.String getRechargeOriginator()
	{
		return rechargeOriginator;
	}

	public void setRechargeOriginator(java.lang.String rechargeOriginator)
	{
		this.rechargeOriginator = rechargeOriginator;
	}

	public long getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public long getVoucherType()
	{
		return voucherType;
	}

	public void setVoucherType(long voucherType)
	{
		this.voucherType = voucherType;
	}

}
