package com.mysoapws.client.MyClient;

import com.mysoapws.generated.AcctInfo;
import com.mysoapws.generated.BankServiceIfc;
import com.mysoapws.generated.BankServiceImplService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BankServiceImplService webService = new BankServiceImplService();
        
        
        BankServiceIfc service = webService.getBankServiceImplPort();
        
       AcctInfo account =  service.getAcctSummary(1234);
       
       System.out.println(account.toString());
    }
}
