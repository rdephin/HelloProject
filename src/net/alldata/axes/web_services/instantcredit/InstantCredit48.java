//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCredit48 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCredit48">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://axes.alldata.net/web-services/instantCredit}instantCreditRequest48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCredit48", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "request"
})
public class InstantCredit48 {

    protected InstantCreditRequest48 request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link InstantCreditRequest48 }
     *     
     */
    public InstantCreditRequest48 getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantCreditRequest48 }
     *     
     */
    public void setRequest(InstantCreditRequest48 value) {
        this.request = value;
    }

}
