//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCredit45Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCredit45Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://axes.alldata.net/web-services/instantCredit}instantCreditResponse45" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCredit45Response", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "response"
})
public class InstantCredit45Response {

    protected InstantCreditResponse45 response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link InstantCreditResponse45 }
     *     
     */
    public InstantCreditResponse45 getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantCreditResponse45 }
     *     
     */
    public void setResponse(InstantCreditResponse45 value) {
        this.response = value;
    }

}
