/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.transaction.client;

/**
 *
 * @author mindau
 */
import de.hsh.se3.client.Client;
import de.hsh.se3.transaction.beans.MoneyTransfer;
import de.hsh.se3.utils.Helper;
import javax.ejb.EJBTransactionRequiredException;

public class TransactionClient implements Client   {
    
@Override
public void demonstrate()throws Exception {
            MoneyTransfer beanInerface = Helper.lookupBean(MoneyTransfer.class);

            System.out.println("***********************************************************");
            System.out.println("* Demonstration of calling method with REQUIRES_NEW which has");
            System.out.println("* 2 methods with MANDATORY annotations");
            System.out.println("***********************************************************");
            System.out.println( beanInerface.transferMoney() ); 


            System.out.println("\n\n\n***********************************************************");
            System.out.println("* Demonstration of calling method with MANDATORY annotation directly");
            System.out.println("***********************************************************");            
            
            try{
                beanInerface.addMoneyToDestination();
            }catch(EJBTransactionRequiredException ex){
                System.out.println("EJBTransactionRequiredException exception catched");
            }

       
    }

    
        public static void main(String[] args) throws Exception {
        TransactionClient client = new TransactionClient();
        client.demonstrate();
    }

}
