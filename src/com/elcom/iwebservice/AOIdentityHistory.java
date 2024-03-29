package com.elcom.iwebservice;

public class AOIdentityHistory
{
	private IdentityHistory[]	identityHistory;

	public AOIdentityHistory()
	{
	}

	public AOIdentityHistory(
			IdentityHistory[] identityHistory)
	{
		this.identityHistory = identityHistory;
	}

	/**
	 * Gets the identityHistory value for this ArrayOfIdentityHistory.
	 * 
	 * @return identityHistory
	 */
	public IdentityHistory[] getIdentityHistory()
	{
		return identityHistory;
	}

	/**
	 * Sets the identityHistory value for this ArrayOfIdentityHistory.
	 * 
	 * @param identityHistory
	 */
	public void setIdentityHistory(IdentityHistory[] identityHistory)
	{
		this.identityHistory = identityHistory;
	}

	public IdentityHistory getIdentityHistory(int i)
	{
		return this.identityHistory[i];
	}

	public void setIdentityHistory(int i, IdentityHistory _value)
	{
		this.identityHistory[i] = _value;
	}

}
