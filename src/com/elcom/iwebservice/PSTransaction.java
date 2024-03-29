package com.elcom.iwebservice;

public class PSTransaction
{
	private java.lang.String	typeOfCharge;
	private java.lang.String	chargecode;
	private double				usageAmount;
	private java.lang.String	unitTypeName;
	private java.util.Calendar	dateTimeTrans;
	private java.lang.String	messageType;

	public PSTransaction()
	{
	}

	public PSTransaction(
			java.lang.String typeOfCharge,
			java.lang.String chargecode,
			double usageAmount,
			java.lang.String unitTypeName,
			java.util.Calendar dateTimeTrans,
			java.lang.String messageType)
	{

		this.typeOfCharge = typeOfCharge;
		this.chargecode = chargecode;
		this.usageAmount = usageAmount;
		this.unitTypeName = unitTypeName;
		this.dateTimeTrans = dateTimeTrans;
		this.messageType = messageType;
	}

	/**
	 * Gets the typeOfCharge value for this PSTransaction.
	 * 
	 * @return typeOfCharge
	 */
	public java.lang.String getTypeOfCharge()
	{
		return typeOfCharge;
	}

	/**
	 * Sets the typeOfCharge value for this PSTransaction.
	 * 
	 * @param typeOfCharge
	 */
	public void setTypeOfCharge(java.lang.String typeOfCharge)
	{
		this.typeOfCharge = typeOfCharge;
	}

	/**
	 * Gets the chargecode value for this PSTransaction.
	 * 
	 * @return chargecode
	 */
	public java.lang.String getChargecode()
	{
		return chargecode;
	}

	/**
	 * Sets the chargecode value for this PSTransaction.
	 * 
	 * @param chargecode
	 */
	public void setChargecode(java.lang.String chargecode)
	{
		this.chargecode = chargecode;
	}

	/**
	 * Gets the usageAmount value for this PSTransaction.
	 * 
	 * @return usageAmount
	 */
	public double getUsageAmount()
	{
		return usageAmount;
	}

	/**
	 * Sets the usageAmount value for this PSTransaction.
	 * 
	 * @param usageAmount
	 */
	public void setUsageAmount(double usageAmount)
	{
		this.usageAmount = usageAmount;
	}

	/**
	 * Gets the unitTypeName value for this PSTransaction.
	 * 
	 * @return unitTypeName
	 */
	public java.lang.String getUnitTypeName()
	{
		return unitTypeName;
	}

	/**
	 * Sets the unitTypeName value for this PSTransaction.
	 * 
	 * @param unitTypeName
	 */
	public void setUnitTypeName(java.lang.String unitTypeName)
	{
		this.unitTypeName = unitTypeName;
	}

	/**
	 * Gets the dateTimeTrans value for this PSTransaction.
	 * 
	 * @return dateTimeTrans
	 */
	public java.util.Calendar getDateTimeTrans()
	{
		return dateTimeTrans;
	}

	/**
	 * Sets the dateTimeTrans value for this PSTransaction.
	 * 
	 * @param dateTimeTrans
	 */
	public void setDateTimeTrans(java.util.Calendar dateTimeTrans)
	{
		this.dateTimeTrans = dateTimeTrans;
	}

	/**
	 * Gets the messageType value for this PSTransaction.
	 * 
	 * @return messageType
	 */
	public java.lang.String getMessageType()
	{
		return messageType;
	}

	/**
	 * Sets the messageType value for this PSTransaction.
	 * 
	 * @param messageType
	 */
	public void setMessageType(java.lang.String messageType)
	{
		this.messageType = messageType;
	}

}
