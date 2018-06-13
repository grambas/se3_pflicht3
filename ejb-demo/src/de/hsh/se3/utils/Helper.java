/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.utils;

import de.hsh.se3.transaction.beans.MoneyTransfer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author mindau
 */
public class Helper {
    /**
     * Returns bean reference
     * usage Helper.lookupBean(SomeBeanInterface.class)
     * @param cl interface class
     * @return 
     */
        public static MoneyTransfer lookupBean(Class cl) {
        try {
            Context c = new InitialContext();
            return (MoneyTransfer) c.lookup(cl.getName());
        } catch (NamingException ne) {
            System.out.println("exception caught:"+ ne.getMessage());
            throw new RuntimeException(ne);
        }
    }
}
