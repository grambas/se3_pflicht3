/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejbLifecycle.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Pyterion
 */
@Stateless
@Remote(_Stateless.class)
public class _StatelessBean implements _Stateless {

    public int number = 0;

    @Override
    public void doAnything() {
        System.out.println("Stateless: Doing anything..");
    }

    @PostConstruct
    public void constructedInfo() {
        System.out.println("The Stateless Bean has been created.");
    }

    @PreDestroy
    public void destroyedInfo() {
        System.out.println("The Stateless Bean has been destroyed.");
    }

    @Override
    public void increment() {
        number++;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
