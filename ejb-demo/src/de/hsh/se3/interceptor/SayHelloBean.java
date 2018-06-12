/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.interceptor;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author acer
 */
@Stateless
@Remote(SayHello.class)
@Interceptors(Interceptor.class)
public class SayHelloBean implements SayHello{
    
    @Override
    public String sayHello() {
        return "sayHello wurde aufgerufen";
    }
    
}
