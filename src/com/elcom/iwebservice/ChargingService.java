/**
 * 
 */
package com.elcom.iwebservice;

/**
 * @author hungdt
 * 
 */
public interface ChargingService
{

	public ExtDebitResp ExtDebit(ExtDebitReq req);

	public AddBalanceResp AddBalance(AddBalanceReq req);

	public ChangeStateResp ChangeState(ChangeStateReq req);

	public ChangeExpiredDateResp ChangeExpiredDate(ChangeExpiredDateReq req);

	public DeductBalanceResp DeductBalance(DeductBalanceReq req);

	public SetBalanceResp SetBalance(SetBalanceReq req);

	public SubscriberRetrieveResp RetrieveSubscriber(SubscriberRetrieveReq req);
}
