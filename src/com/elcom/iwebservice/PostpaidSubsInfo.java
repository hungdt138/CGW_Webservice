package com.elcom.iwebservice;

public class PostpaidSubsInfo
{
	private double	dmonthDebt;			// So no thang truoc
	private double	dcurrDebt;			// So no thang nay
	private double	dtotalDebt;			// Tong no
	private double	dlastPaymentDebt;	// So tien da thanh toan lan gan nhat

	private String	sFirstName;
	private String	sLastName;
	private String	sBirthDate;
	private String	sPassPort;
	private String	sNational;
	private String	sCompany;
	private String	sAddress;

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

	public double getDcurrDebt()
	{
		return dcurrDebt;
	}

	public void setDcurrDebt(double dcurrDebt)
	{
		this.dcurrDebt = dcurrDebt;
	}

	public double getDmonthDebt()
	{
		return dmonthDebt;
	}

	public void setDmonthDebt(double dmonthDebt)
	{
		this.dmonthDebt = dmonthDebt;
	}

	public double getDtotalDebt()
	{
		return dtotalDebt;
	}

	public void setDtotalDebt(double dtotalDebt)
	{
		this.dtotalDebt = dtotalDebt;
	}

	public double getDlastPaymentDebt()
	{
		return dlastPaymentDebt;
	}

	public void setDlastPaymentDebt(double dlastPaymentDebt)
	{
		this.dlastPaymentDebt = dlastPaymentDebt;
	}
}
