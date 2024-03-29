package com.elcom.iwebservice;


public class SubscriberRetrieveResp extends CGWResp
{

	private PostpaidSubsInfo	postInfo;
	private PrepaidSubsInfo		preInfo;
	private int					subType;
	public static final int		PREPAID_TYPE	= 1;
	public static final int		POSTPAID_TYPE	= 2;

	public SubscriberRetrieveResp(String msisdn, int result, String detail)
	{
		initCGWResp(msisdn, result, detail);
	}

	public SubscriberRetrieveResp()
	{
		initCGWResp("", -1, "");
	}

	public PostpaidSubsInfo getPostInfo()
	{
		return postInfo;
	}

	public void setPostInfo(PostpaidSubsInfo postInfo)
	{
		this.postInfo = postInfo;
	}

	public PrepaidSubsInfo getPreInfo()
	{
		return preInfo;
	}

	public void setPreInfo(PrepaidSubsInfo preInfo)
	{
		this.preInfo = preInfo;
	}

	public int getSubType()
	{
		return subType;
	}

	public void setSubType(int subType)
	{
		this.subType = subType;
	}

}
