
package de.hsh.se3.soap.client.generated;

import de.hsh.se3.soap.client.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DiceRollerService", targetNamespace = "http://soap.se3.hsh.de/", wsdlLocation = "http://localhost:8080/DiceRollerService/DiceRollerService?wsdl")
public class DiceRollerService_Service
    extends Service
{

    private final static URL DICEROLLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException DICEROLLERSERVICE_EXCEPTION;
    private final static QName DICEROLLERSERVICE_QNAME = new QName("http://soap.se3.hsh.de/", "DiceRollerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DiceRollerService/DiceRollerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DICEROLLERSERVICE_WSDL_LOCATION = url;
        DICEROLLERSERVICE_EXCEPTION = e;
    }

    public DiceRollerService_Service() {
        super(__getWsdlLocation(), DICEROLLERSERVICE_QNAME);
    }

    public DiceRollerService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DICEROLLERSERVICE_QNAME, features);
    }

    public DiceRollerService_Service(URL wsdlLocation) {
        super(wsdlLocation, DICEROLLERSERVICE_QNAME);
    }

    public DiceRollerService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DICEROLLERSERVICE_QNAME, features);
    }

    public DiceRollerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiceRollerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DiceRollerService
     */
    @WebEndpoint(name = "DiceRollerServicePort")
    public DiceRollerService getDiceRollerServicePort() {
        return super.getPort(new QName("http://soap.se3.hsh.de/", "DiceRollerServicePort"), DiceRollerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DiceRollerService
     */
    @WebEndpoint(name = "DiceRollerServicePort")
    public DiceRollerService getDiceRollerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.se3.hsh.de/", "DiceRollerServicePort"), DiceRollerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DICEROLLERSERVICE_EXCEPTION!= null) {
            throw DICEROLLERSERVICE_EXCEPTION;
        }
        return DICEROLLERSERVICE_WSDL_LOCATION;
    }

}
