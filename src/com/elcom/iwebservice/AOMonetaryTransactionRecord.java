package com.elcom.iwebservice;

public class AOMonetaryTransactionRecord
{
	private MonetaryTransactionRecord[]	monetaryTransactionsRecord;

	public AOMonetaryTransactionRecord()
	{
	}

	public AOMonetaryTransactionRecord(
			MonetaryTransactionRecord[] monetaryTransactionsRecord)
	{
		this.monetaryTransactionsRecord = monetaryTransactionsRecord;
	}

	/**
	 * Gets the monetaryTransactionsRecord value for this
	 * ArrayOfMonetaryTransactionRecord.
	 * 
	 * @return monetaryTransactionsRecord
	 */
	public MonetaryTransactionRecord[] getMonetaryTransactionsRecord()
	{
		return monetaryTransactionsRecord;
	}

	/**
	 * Sets the monetaryTransactionsRecord value for this
	 * ArrayOfMonetaryTransactionRecord.
	 * 
	 * @param monetaryTransactionsRecord
	 */
	public void setMonetaryTransactionsRecord(MonetaryTransactionRecord[] monetaryTransactionsRecord)
	{
		this.monetaryTransactionsRecord = monetaryTransactionsRecord;
	}

	public MonetaryTransactionRecord getMonetaryTransactionsRecord(int i)
	{
		return this.monetaryTransactionsRecord[i];
	}

	public void setMonetaryTransactionsRecord(int i, MonetaryTransactionRecord _value)
	{
		this.monetaryTransactionsRecord[i] = _value;
	}

}
