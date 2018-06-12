
package de.hsh.se3.soap.client.generated;

import de.hsh.se3.soap.client.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hsh.se3.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RollDice_QNAME = new QName("http://soap.se3.hsh.de/", "rollDice");
    private final static QName _RollDiceResponse_QNAME = new QName("http://soap.se3.hsh.de/", "rollDiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hsh.se3.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RollDice }
     * 
     */
    public RollDice createRollDice() {
        return new RollDice();
    }

    /**
     * Create an instance of {@link RollDiceResponse }
     * 
     */
    public RollDiceResponse createRollDiceResponse() {
        return new RollDiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollDice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.se3.hsh.de/", name = "rollDice")
    public JAXBElement<RollDice> createRollDice(RollDice value) {
        return new JAXBElement<RollDice>(_RollDice_QNAME, RollDice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollDiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.se3.hsh.de/", name = "rollDiceResponse")
    public JAXBElement<RollDiceResponse> createRollDiceResponse(RollDiceResponse value) {
        return new JAXBElement<RollDiceResponse>(_RollDiceResponse_QNAME, RollDiceResponse.class, null, value);
    }

}
