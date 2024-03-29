package com.elcom.iwebservice;

import com.comverse_in.prepaid.ccws.SubscriberHome;
import com.comverse_in.prepaid.ccws.SubscriberInfo;
import com.comverse_in.prepaid.ccws.SubscriberPB;

public abstract class SubscriberBase extends SubscriberBasic
{
	private SubscriberHome	subscriberHome;
	private SubscriberInfo	subscriberInfo;
	private SubscriberPB	subscriberPhoneBook;

	public SubscriberBase()
	{
	}

	public SubscriberBase(
			SubscriberHome subscriberHome,
			SubscriberInfo subscriberInfo,
			SubscriberPB subscriberPhoneBook)
	{
		this.subscriberHome = subscriberHome;
		this.subscriberInfo = subscriberInfo;
		this.subscriberPhoneBook = subscriberPhoneBook;
	}

	/**
	 * Gets the subscriberHome value for this SubscriberBase.
	 * 
	 * @return subscriberHome
	 */
	public SubscriberHome getSubscriberHome()
	{
		return subscriberHome;
	}

	/**
	 * Sets the subscriberHome value for this SubscriberBase.
	 * 
	 * @param subscriberHome
	 */
	public void setSubscriberHome(SubscriberHome subscriberHome)
	{
		this.subscriberHome = subscriberHome;
	}

	/**
	 * Gets the subscriberInfo value for this SubscriberBase.
	 * 
	 * @return subscriberInfo
	 */
	public SubscriberInfo getSubscriberInfo()
	{
		return subscriberInfo;
	}

	/**
	 * Sets the subscriberInfo value for this SubscriberBase.
	 * 
	 * @param subscriberInfo
	 */
	public void setSubscriberInfo(SubscriberInfo subscriberInfo)
	{
		this.subscriberInfo = subscriberInfo;
	}

	/**
	 * Gets the subscriberPhoneBook value for this SubscriberBase.
	 * 
	 * @return subscriberPhoneBook
	 */
	public SubscriberPB getSubscriberPhoneBook()
	{
		return subscriberPhoneBook;
	}

	/**
	 * Sets the subscriberPhoneBook value for this SubscriberBase.
	 * 
	 * @param subscriberPhoneBook
	 */
	public void setSubscriberPhoneBook(SubscriberPB subscriberPhoneBook)
	{
		this.subscriberPhoneBook = subscriberPhoneBook;
	}

}
