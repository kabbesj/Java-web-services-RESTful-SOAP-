
package client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RandService", targetNamespace = "http://rand/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RandService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "next1", targetNamespace = "http://rand/", className = "client.Next1")
    @ResponseWrapper(localName = "next1Response", targetNamespace = "http://rand/", className = "client.Next1Response")
    @Action(input = "http://rand/RandService/next1Request", output = "http://rand/RandService/next1Response")
    public String next1();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nextN", targetNamespace = "http://rand/", className = "client.NextN")
    @ResponseWrapper(localName = "nextNResponse", targetNamespace = "http://rand/", className = "client.NextNResponse")
    @Action(input = "http://rand/RandService/nextNRequest", output = "http://rand/RandService/nextNResponse")
    public List<String> nextN();

}