/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejbLifecycle.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author Pyterion
 */
@Stateful
@Remote(_Stateful.class)
public class _StatefulBean implements _Stateful {

    public int number = 0;

    @Override
    public void doAnything() {
        System.out.println("Stateful: Doing anything..");
    }

    @PostConstruct
    public void constructedInfo() {
        System.out.println("The Stateful Bean has been created.");
    }

    @PreDestroy
    public void destroyedInfo() {
        System.out.println("The Stateful Bean has been destroyed.");
    }

    @PostActivate
    public void activatedInfo() {
        System.out.println("The Stateful Bean has been activated.");
    }

    @PrePassivate
    public void passivatedInfo() {
        System.out.println("The Stateful Bean has been passivated.");
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
