package com.elcom.iwebservice;

public class Cgw_webservicePortTypeProxy implements com.elcom.iwebservice.Cgw_webservicePortType
{
	private String											_endpoint				= null;
	private com.elcom.iwebservice.Cgw_webservicePortType	cgw_webservicePortType	= null;

	public Cgw_webservicePortTypeProxy()
	{
		_initCgw_webservicePortTypeProxy();
	}

	public Cgw_webservicePortTypeProxy(String endpoint)
	{
		_endpoint = endpoint;
		_initCgw_webservicePortTypeProxy();
	}

	private void _initCgw_webservicePortTypeProxy()
	{
		try
		{
			cgw_webservicePortType = (new com.elcom.iwebservice.Cgw_webserviceLocator()).getcgw_webserviceHttpPort();
			if (cgw_webservicePortType != null)
			{
				if (_endpoint != null)
					((javax.xml.rpc.Stub) cgw_webservicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) cgw_webservicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException)
		{
		}
	}

	public String getEndpoint()
	{
		return _endpoint;
	}

	public void setEndpoint(String endpoint)
	{
		_endpoint = endpoint;
		if (cgw_webservicePortType != null)
			((javax.xml.rpc.Stub) cgw_webservicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public com.elcom.iwebservice.Cgw_webservicePortType getCgw_webservicePortType()
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType;
	}

	public com.elcom.iwebservice.ChangeStateResp changeState(com.elcom.iwebservice.ChangeStateReq in0) throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.changeState(in0);
	}

	public com.elcom.iwebservice.AddBalanceResp addBalance(com.elcom.iwebservice.AddBalanceReq in0) throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.addBalance(in0);
	}

	public com.elcom.iwebservice.ExtDebitResp extDebit(com.elcom.iwebservice.ExtDebitReq in0) throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.extDebit(in0);
	}

	public com.elcom.iwebservice.DeductBalanceResp deductBalance(com.elcom.iwebservice.DeductBalanceReq in0) throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.deductBalance(in0);
	}

	public com.elcom.iwebservice.SetBalanceResp setBalance(com.elcom.iwebservice.SetBalanceReq in0) throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.setBalance(in0);
	}

	public com.elcom.iwebservice.SubscriberRetrieveResp retrieveSubscriber(com.elcom.iwebservice.SubscriberRetrieveReq in0)
			throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.retrieveSubscriber(in0);
	}

	public com.elcom.iwebservice.ChangeExpiredDateResp changeExpiredDate(com.elcom.iwebservice.ChangeExpiredDateReq in0)
			throws java.rmi.RemoteException
	{
		if (cgw_webservicePortType == null)
			_initCgw_webservicePortTypeProxy();
		return cgw_webservicePortType.changeExpiredDate(in0);
	}

}