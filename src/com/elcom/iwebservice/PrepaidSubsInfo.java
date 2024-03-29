package com.elcom.iwebservice;

public class PrepaidSubsInfo
{
	private String			cos;
	private String			state;
	private double			balCore;
	private String			expiredCore;
	private BalanceInfo[]	balList;
	private PhoneBook		phoneBook;
	private String			sFirstName;
	private String			sLastName;
	private String			sBirthDate;
	private String			sPassPort;
	private String			sNational;
	private String			sCompany;
	private String			sAddress;
	private String			sActiveDate;

	public String getSActiveDate()
	{
		return sActiveDate;
	}

	public void setSActiveDate(String activeDate)
	{
		sActiveDate = activeDate;
	}

	public String getSAddress()
	{
		return sAddress;
	}

	public void setSAddress(String address)
	{
		sAddress = address;
	}

	public String getSBirthDate()
	{
		return sBirthDate;
	}

	public void setSBirthDate(String birthDate)
	{
		sBirthDate = birthDate;
	}

	public String getSCompany()
	{
		return sCompany;
	}

	public void setSCompany(String company)
	{
		sCompany = company;
	}

	public String getSFirstName()
	{
		return sFirstName;
	}

	public void setSFirstName(String firstName)
	{
		sFirstName = firstName;
	}

	public String getSLastName()
	{
		return sLastName;
	}

	public void setSLastName(String lastName)
	{
		sLastName = lastName;
	}

	public String getSNational()
	{
		return sNational;
	}

	public void setSNational(String national)
	{
		sNational = national;
	}

	public String getSPassPort()
	{
		return sPassPort;
	}

	public void setSPassPort(String passPort)
	{
		sPassPort = passPort;
	}

	// private String activeDate;
	// public String getActiveDate() {
	// return activeDate;
	// }
	// public void setActiveDate(String activeDate) {
	// this.activeDate = activeDate;
	// }
	public double getBalCore()
	{
		return balCore;
	}

	public void setBalCore(double balCore)
	{
		this.balCore = balCore;
	}

	public BalanceInfo[] getBalList()
	{
		return balList;
	}

	public void setBalList(BalanceInfo[] balList)
	{
		this.balList = new BalanceInfo[balList.length];
		this.balList = balList;
	}

	public String getCos()
	{
		return cos;
	}

	public void setCos(String cos)
	{
		this.cos = cos;
	}

	public String getExpiredCore()
	{
		return expiredCore;
	}

	public void setExpiredCore(String expiredCore)
	{
		this.expiredCore = expiredCore;
	}

	public PhoneBook getPhoneBook()
	{
		return phoneBook;
	}

	public void setPhoneBook(PhoneBook phoneBook)
	{
		this.phoneBook = phoneBook;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

}
