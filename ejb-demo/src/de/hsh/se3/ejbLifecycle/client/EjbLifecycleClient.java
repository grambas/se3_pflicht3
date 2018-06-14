/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejbLifecycle.client;

import de.hsh.se3.client.Client;
import de.hsh.se3.ejbLifecycle.entities._Singleton;
import de.hsh.se3.ejbLifecycle.entities._Stateful;
import de.hsh.se3.ejbLifecycle.entities._Stateless;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Pyterion
 */
public class EjbLifecycleClient implements Client {

    @Override
    public void demonstrate() throws Exception {
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);

        _Stateful stateful = (_Stateful) jndiContext.lookup(_Stateful.class.getName());
        _Stateless stateless = (_Stateless) jndiContext.lookup(_Stateless.class.getName());
        _Singleton singleton = (_Singleton) jndiContext.lookup(_Singleton.class.getName());

        System.out.println("Using Stateful Bean...");
        stateful.doAnything();
        
        System.out.println("Using Stateless Bean...");
        stateless.doAnything();

        System.out.println("Using Singleton Bean...");
        singleton.doAnything();
    }

    public static void main(String[] args) throws NamingException, Exception {
        new EjbLifecycleClient().demonstrate();
    }

}
