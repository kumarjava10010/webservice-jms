package com.bank.client.MyClient;

import com.bank.generated.Customer;
import com.bank.generated.CustomerIfc;
import com.bank.generated.CustomerOperationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        CustomerOperationService webService = new CustomerOperationService();
        
        
        CustomerIfc service = webService.getCustomerOperationPort();
        
       Customer customer =  service.getCustomer("robert");
       
       System.out.println(customer.toString());
    }
}
