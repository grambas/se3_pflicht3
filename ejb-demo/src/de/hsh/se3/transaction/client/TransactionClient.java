package de.hsh.se3.transaction.client;

/**
 *
 * @author mindau
 */
import de.hsh.se3.client.Client;
import de.hsh.se3.transaction.beans.MoneyTransfer;
import javax.ejb.EJBTransactionRequiredException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TransactionClient implements Client {

    @Override
    public void demonstrate() throws Exception {
        MoneyTransfer beanInerface;
        try {
            Context c = new InitialContext();
            beanInerface = (MoneyTransfer) c.lookup(MoneyTransfer.class.getName());
        } catch (NamingException ne) {
            System.out.println("exception caught:" + ne.getMessage());
            throw new RuntimeException(ne);
        }

        System.out.println("***********************************************************");
        System.out.println("* Demonstration of calling method with REQUIRES_NEW which has");
        System.out.println("* 2 methods with MANDATORY annotations");
        System.out.println("***********************************************************");
        System.out.println(beanInerface.transferMoney());

        System.out.println("\n\n\n***********************************************************");
        System.out.println("* Demonstration of calling method with MANDATORY annotation directly");
        System.out.println("***********************************************************");

        try {
            beanInerface.addMoneyToDestination();
        } catch (EJBTransactionRequiredException ex) {
            System.out.println("EJBTransactionRequiredException exception catched");
        }

    }

    public static void main(String[] args) throws Exception {
        TransactionClient client = new TransactionClient();
        client.demonstrate();
    }

}
