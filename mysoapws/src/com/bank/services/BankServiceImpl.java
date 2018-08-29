package com.bank.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bank.services.BankServiceIfc")
public class BankServiceImpl implements BankServiceIfc {

	@Override
	public AcctInfo getAcctSummary(int acctNumber) {

		// Your DB code Here
		AcctInfo acct = new AcctInfo();

		if (acctNumber == 1234) {
			acct.setAcctNumber(acctNumber);
			acct.setAcctType("Checking");
			acct.setBalance("15600.00");
			acct.setLastupdatedby("someUser");
			acct.setLastupdateddate("08-01-2018");
		}
		return acct;
	}

	@Override
	public AcctInfo deposit(AcctInfo account) {

		return new AcctInfo();
	}

	@Override
	public AcctInfo withdraw(AcctInfo account) {

		return new AcctInfo();
	}

}
