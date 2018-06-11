/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.soap;

import java.util.concurrent.ThreadLocalRandom;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;


@Stateless
public class DiceRollerBean {
    
    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
}
