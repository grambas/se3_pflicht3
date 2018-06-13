package de.hsh.se3.transaction.beans;

import javax.ejb.Remote;

/**
 *
 * @author mindau
 */
@Remote
public interface MoneyTransfer {

    public String transferMoney();

    public String addMoneyToDestination();
}
