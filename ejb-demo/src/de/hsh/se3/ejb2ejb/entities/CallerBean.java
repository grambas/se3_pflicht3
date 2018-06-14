/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejb2ejb.entities;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author Pyterion
 */
@Stateful
@Remote(Caller.class)
public class CallerBean implements Caller {

    private String attribute;

    @EJB
    private Called calledBean;

    public void setAttribute(String attr) {
        this.attribute = attr;
    }

    public void sendAttr2CalledBean() {
        calledBean.setAttribute(attribute);
    }

    public Called getCalledBean() {
        return this.calledBean;
    }
}
