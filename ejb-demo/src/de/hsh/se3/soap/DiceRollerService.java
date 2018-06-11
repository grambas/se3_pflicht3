/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.soap;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;


@WebService(serviceName = "DiceRollerService")
@Stateless
public class DiceRollerService {

    @EJB
    private DiceRollerBean ejbRef;

    @WebMethod(operationName = "rollDice")
    public int rollDice() {
        return ejbRef.rollDice();
    }
    
}
