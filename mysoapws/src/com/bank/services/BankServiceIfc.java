package com.bank.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface BankServiceIfc {

	@WebMethod
	public AcctInfo getAcctSummary(int acctNumber);

	@WebMethod
	public AcctInfo deposit(AcctInfo account);

	@WebMethod
	public AcctInfo withdraw(AcctInfo account);

}
