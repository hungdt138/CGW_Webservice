package com.elcom.iwebservice;

public class AOOfferHistoryRecord
{
	private OfferHistoryRecord[]	offerHistory;

	public AOOfferHistoryRecord()
	{
	}

	public AOOfferHistoryRecord(
			OfferHistoryRecord[] offerHistory)
	{
		this.offerHistory = offerHistory;
	}

	/**
	 * Gets the offerHistory value for this ArrayOfOfferHistoryRecord.
	 * 
	 * @return offerHistory
	 */
	public OfferHistoryRecord[] getOfferHistory()
	{
		return offerHistory;
	}

	/**
	 * Sets the offerHistory value for this ArrayOfOfferHistoryRecord.
	 * 
	 * @param offerHistory
	 */
	public void setOfferHistory(OfferHistoryRecord[] offerHistory)
	{
		this.offerHistory = offerHistory;
	}

	public OfferHistoryRecord getOfferHistory(int i)
	{
		return this.offerHistory[i];
	}

	public void setOfferHistory(int i, OfferHistoryRecord _value)
	{
		this.offerHistory[i] = _value;
	}

}
