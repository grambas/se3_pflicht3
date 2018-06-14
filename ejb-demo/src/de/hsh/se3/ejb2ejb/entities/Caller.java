/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejb2ejb.entities;

/**
 *
 * @author Pyterion
 */
public interface Caller {

    public void setAttribute(String attr);

    public void sendAttr2CalledBean();

    public Called getCalledBean();
}
