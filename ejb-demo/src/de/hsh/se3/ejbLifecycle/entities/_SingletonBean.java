/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejbLifecycle.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remote;
import javax.ejb.Singleton;

/**
 *
 * @author Pyterion
 */
@Singleton
@Remote(_Singleton.class)
public class _SingletonBean implements _Singleton {

    @Override
    public void doAnything(){
    System.out.println("Singleton: Doing anything..");
    }
    @PostConstruct
    public void constructedInfo(){
    System.out.println("The Singleton Bean has been created.");
    }
    
    @PreDestroy
    public void destroyedInfo(){
    System.out.println("The Singleton Bean has been destroyed.");
    }
}
