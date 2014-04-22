package com.elcom.iwebservice;

public class AOOSAHistory
{
	private OSAHistory[]	OSAHistory;

	public AOOSAHistory()
	{
	}

	public AOOSAHistory(
			OSAHistory[] OSAHistory)
	{
		this.OSAHistory = OSAHistory;
	}

	/**
	 * Gets the OSAHistory value for this ArrayOfOSAHistory.
	 * 
	 * @return OSAHistory
	 */
	public OSAHistory[] getOSAHistory()
	{
		return OSAHistory;
	}

	/**
	 * Sets the OSAHistory value for this ArrayOfOSAHistory.
	 * 
	 * @param OSAHistory
	 */
	public void setOSAHistory(OSAHistory[] OSAHistory)
	{
		this.OSAHistory = OSAHistory;
	}

	public OSAHistory getOSAHistory(int i)
	{
		return this.OSAHistory[i];
	}

	public void setOSAHistory(int i, OSAHistory _value)
	{
		this.OSAHistory[i] = _value;
	}

}
