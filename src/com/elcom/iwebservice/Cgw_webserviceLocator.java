/**
 * Cgw_webserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public class Cgw_webserviceLocator extends org.apache.axis.client.Service implements com.elcom.iwebservice.Cgw_webservice
{

	public Cgw_webserviceLocator()
	{
	}

	public Cgw_webserviceLocator(org.apache.axis.EngineConfiguration config)
	{
		super(config);
	}

	public Cgw_webserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException
	{
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for cgw_webserviceHttpPort
	private java.lang.String	cgw_webserviceHttpPort_address	= "http://localhost:8080/cgw-web-service/services/cgw_webservice";

	public java.lang.String getcgw_webserviceHttpPortAddress()
	{
		return cgw_webserviceHttpPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String	cgw_webserviceHttpPortWSDDServiceName	= "cgw_webserviceHttpPort";

	public java.lang.String getcgw_webserviceHttpPortWSDDServiceName()
	{
		return cgw_webserviceHttpPortWSDDServiceName;
	}

	public void setcgw_webserviceHttpPortWSDDServiceName(java.lang.String name)
	{
		cgw_webserviceHttpPortWSDDServiceName = name;
	}

	public com.elcom.iwebservice.Cgw_webservicePortType getcgw_webserviceHttpPort() throws javax.xml.rpc.ServiceException
	{
		java.net.URL endpoint;
		try
		{
			endpoint = new java.net.URL(cgw_webserviceHttpPort_address);
		}
		catch (java.net.MalformedURLException e)
		{
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getcgw_webserviceHttpPort(endpoint);
	}

	public com.elcom.iwebservice.Cgw_webservicePortType getcgw_webserviceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException
	{
		try
		{
			com.elcom.iwebservice.Cgw_webserviceHttpBindingStub _stub = new com.elcom.iwebservice.Cgw_webserviceHttpBindingStub(portAddress, this);
			_stub.setPortName(getcgw_webserviceHttpPortWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e)
		{
			return null;
		}
	}

	public void setcgw_webserviceHttpPortEndpointAddress(java.lang.String address)
	{
		cgw_webserviceHttpPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException
	{
		try
		{
			if (com.elcom.iwebservice.Cgw_webservicePortType.class.isAssignableFrom(serviceEndpointInterface))
			{
				com.elcom.iwebservice.Cgw_webserviceHttpBindingStub _stub = new com.elcom.iwebservice.Cgw_webserviceHttpBindingStub(new java.net.URL(
						cgw_webserviceHttpPort_address), this);
				_stub.setPortName(getcgw_webserviceHttpPortWSDDServiceName());
				return _stub;
			}
		}
		catch (java.lang.Throwable t)
		{
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException
	{
		if (portName == null)
		{
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("cgw_webserviceHttpPort".equals(inputPortName))
		{
			return getcgw_webserviceHttpPort();
		}
		else
		{
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName()
	{
		return new javax.xml.namespace.QName("http://iwebservice.elcom.com", "cgw_webservice");
	}

	private java.util.HashSet	ports	= null;

	public java.util.Iterator getPorts()
	{
		if (ports == null)
		{
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://iwebservice.elcom.com", "cgw_webserviceHttpPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException
	{

		if ("cgw_webserviceHttpPort".equals(portName))
		{
			setcgw_webserviceHttpPortEndpointAddress(address);
		}
		else
		{ // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException
	{
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
