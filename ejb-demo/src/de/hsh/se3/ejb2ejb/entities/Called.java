/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejb2ejb.entities;

import javax.ejb.Local;

/**
 *
 * @author Pyterion
 */
public interface Called {

    public void setAttribute(String attr);

    public String getAttribute();
}
