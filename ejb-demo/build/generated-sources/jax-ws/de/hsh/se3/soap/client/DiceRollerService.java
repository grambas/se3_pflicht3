
package de.hsh.se3.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DiceRollerService", targetNamespace = "http://soap.se3.hsh.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DiceRollerService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rollDice", targetNamespace = "http://soap.se3.hsh.de/", className = "de.hsh.se3.soap.client.RollDice")
    @ResponseWrapper(localName = "rollDiceResponse", targetNamespace = "http://soap.se3.hsh.de/", className = "de.hsh.se3.soap.client.RollDiceResponse")
    @Action(input = "http://soap.se3.hsh.de/DiceRollerService/rollDiceRequest", output = "http://soap.se3.hsh.de/DiceRollerService/rollDiceResponse")
    public int rollDice();

}
