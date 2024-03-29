package com.elcom.iwebservice;

public class AORechargeHistory
{
	private RechargeHistory[]	rechargeHistory;

	public AORechargeHistory()
	{
	}

	public AORechargeHistory(
			RechargeHistory[] rechargeHistory)
	{
		this.rechargeHistory = rechargeHistory;
	}

	/**
	 * Gets the rechargeHistory value for this ArrayOfRechargeHistory.
	 * 
	 * @return rechargeHistory
	 */
	public RechargeHistory[] getRechargeHistory()
	{
		return rechargeHistory;
	}

	/**
	 * Sets the rechargeHistory value for this ArrayOfRechargeHistory.
	 * 
	 * @param rechargeHistory
	 */
	public void setRechargeHistory(RechargeHistory[] rechargeHistory)
	{
		this.rechargeHistory = rechargeHistory;
	}

	public RechargeHistory getRechargeHistory(int i)
	{
		return this.rechargeHistory[i];
	}

	public void setRechargeHistory(int i, RechargeHistory _value)
	{
		this.rechargeHistory[i] = _value;
	}

}
