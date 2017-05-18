
package client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RandServiceService", targetNamespace = "http://rand/", wsdlLocation = "http://localhost:8080/rand?wsdl")
public class RandServiceService
    extends Service
{

    private final static URL RandServiceSERVICE_WSDL_LOCATION;
    private final static WebServiceException RandServiceSERVICE_EXCEPTION;
    private final static QName RandServiceSERVICE_QNAME = new QName("http://rand/", "RandServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/rand?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RandServiceSERVICE_WSDL_LOCATION = url;
        RandServiceSERVICE_EXCEPTION = e;
    }

    public RandServiceService() {
        super(__getWsdlLocation(), RandServiceSERVICE_QNAME);
    }

    public RandServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RandServiceSERVICE_QNAME, features);
    }

    public RandServiceService(URL wsdlLocation) {
        super(wsdlLocation, RandServiceSERVICE_QNAME);
    }

    public RandServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RandServiceSERVICE_QNAME, features);
    }

    public RandServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RandServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RandService
     */
    @WebEndpoint(name = "RandServicePort")
    public RandService getRandServicePort() {
        return super.getPort(new QName("http://rand/", "RandServicePort"), RandService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RandService
     */
    @WebEndpoint(name = "RandServicePort")
    public RandService getRandServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rand/", "RandServicePort"), RandService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RandServiceSERVICE_EXCEPTION!= null) {
            throw RandServiceSERVICE_EXCEPTION;
        }
        return RandServiceSERVICE_WSDL_LOCATION;
    }

}