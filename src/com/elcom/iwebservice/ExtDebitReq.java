package com.elcom.iwebservice;

public class ExtDebitReq extends RequestBase
{
	String	TransDateTime	= "";	// La thoi gian gui ban tin
	String	ANumber			= "";	// So dich vu: 19001570
	String	BNumber			= "";	// So thue bao gui tin nhan: for example:
									// 8492352722
	String	SubmitTime		= "";	// Thoi gian thue bao guitin, khuong dang:
									// yyyyMMddHHmmss
	String	ServiceState	= "";	// Trang thai cua ban tin: D ==> Ban tin
									// thanh cong, U ==> Ban tin khong thanh
									// cong
	String	SentTime		= "";	// Thoi gian he thong dich vu nhan duoc tin
	String	CPId			= "";	// Content Provider ID
	String	CPName			= "";	// Content Provider Name
	String	ContCode		= "";
	String	ContType		= "";
	String	Desc			= "";	// Description

	public void setDesc(String Desc)
	{
		this.Desc = Desc;
	}

	public String getDesc()
	{
		return this.Desc;
	}

	public void setCPId(String CPId)
	{
		this.CPId = CPId;
	}

	public String getCPId()
	{
		return this.CPId;
	}

	public void setCPName(String CPName)
	{
		this.CPName = CPName;
	}

	public String getCPName()
	{
		return this.CPName;
	}

	public void setContCode(String ContCode)
	{
		this.ContCode = ContCode;
	}

	public String getContCode()
	{
		return this.ContCode;
	}

	public void setContType(String ContType)
	{
		this.ContType = ContType;
	}

	public String getContType()
	{
		return this.ContType;
	}

	public void setTransDateTime(String TransDateTime)
	{
		this.TransDateTime = TransDateTime;
	}

	public String getTransDateTime()
	{
		return this.TransDateTime;
	}

	public void setANumber(String ANumber)
	{
		this.ANumber = ANumber;
	}

	public String getANumber()
	{
		return this.ANumber;
	}

	public void setBNumber(String BNumber)
	{
		this.BNumber = BNumber;
	}

	public String getBNumber()
	{
		return this.BNumber;
	}

	public void setSubmitTime(String SubmitTime)
	{
		this.SubmitTime = SubmitTime;
	}

	public String getSubmitTime()
	{
		return this.SubmitTime;
	}

	public void setServiceState(String ServiceState)
	{
		this.ServiceState = ServiceState;
	}

	public String getServiceState()
	{
		return this.ServiceState;
	}

	public void setSentTime(String SentTime)
	{
		this.SentTime = SentTime;
	}

	public String getSentTime()
	{
		return this.SentTime;
	}

	public Boolean IsValidSyntax()
	{
		if (this.getTransDateTime().trim().equals(""))
			return false;
		if (this.getANumber().trim().equals(""))
			return false;
		if (this.getBNumber().trim().equals(""))
			return false;
		if (this.getSubmitTime().trim().equals(""))
			return false;
		if (this.getServiceState().trim().equals(""))
			return false;
		if (this.getSentTime().trim().equals(""))
			return false;
		if (this.getCPId().trim().equals(""))
			return false;
		if (this.getCPName().trim().equals(""))
			return false;
		if (this.getContCode().trim().equals(""))
			return false;
		return true;
	}
}
