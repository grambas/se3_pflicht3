/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.interceptor.client;

import de.hsh.se3.interceptor.Interceptor;
import de.hsh.se3.interceptor.SayHello;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author acer
 */
public class InterceptorClient {
    public static void main(String[] args) throws NamingException {
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);
        
        SayHello sayHello = (SayHello) jndiContext.lookup(SayHello.class.getName());
        System.out.println(sayHello.sayHello());
    }
}
