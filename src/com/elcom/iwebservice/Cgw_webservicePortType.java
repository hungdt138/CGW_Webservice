/**
 * Cgw_webservicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elcom.iwebservice;

public interface Cgw_webservicePortType extends java.rmi.Remote
{
	public com.elcom.iwebservice.ChangeStateResp changeState(com.elcom.iwebservice.ChangeStateReq in0) throws java.rmi.RemoteException;

	public com.elcom.iwebservice.AddBalanceResp addBalance(com.elcom.iwebservice.AddBalanceReq in0) throws java.rmi.RemoteException;

	public com.elcom.iwebservice.ExtDebitResp extDebit(com.elcom.iwebservice.ExtDebitReq in0) throws java.rmi.RemoteException;

	public com.elcom.iwebservice.DeductBalanceResp deductBalance(com.elcom.iwebservice.DeductBalanceReq in0) throws java.rmi.RemoteException;

	public com.elcom.iwebservice.SetBalanceResp setBalance(com.elcom.iwebservice.SetBalanceReq in0) throws java.rmi.RemoteException;

	public com.elcom.iwebservice.SubscriberRetrieveResp retrieveSubscriber(com.elcom.iwebservice.SubscriberRetrieveReq in0)
			throws java.rmi.RemoteException;

	public com.elcom.iwebservice.ChangeExpiredDateResp changeExpiredDate(com.elcom.iwebservice.ChangeExpiredDateReq in0)
			throws java.rmi.RemoteException;
}
