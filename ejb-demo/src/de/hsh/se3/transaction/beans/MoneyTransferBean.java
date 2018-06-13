package de.hsh.se3.transaction.beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author mindau
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@Remote(MoneyTransfer.class)
public class MoneyTransferBean implements MoneyTransfer {
    

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    @Override
    public String transferMoney() {
        String result ="";
        result += deductMoneyFromSource();
        result += addMoneyToDestination();
        return result;
    }

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public String deductMoneyFromSource() {
        return "\ndeductMoneyFromSource() exwcuted\n";
    }

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    @Override
    public String addMoneyToDestination() {
        return"addMoneyToDestination()  executed";
    }
}