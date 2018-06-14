/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejb2ejb.entities;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author Pyterion
 */
@Stateful
@Remote(Called.class)
public class CalledBean implements Called {

    private String attribute;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void setAttribute(String attr) {
        this.attribute = attr;
    }

    public String getAttribute() {
        return this.attribute;
    }
}
