//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services._void;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sale36Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sale36Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://axes.alldata.net/web-services/void}voidResponse36" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sale36Response", namespace = "http://axes.alldata.net/web-services/void", propOrder = {
    "response"
})
public class Sale36Response {

    protected VoidResponse36 response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link VoidResponse36 }
     *     
     */
    public VoidResponse36 getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidResponse36 }
     *     
     */
    public void setResponse(VoidResponse36 value) {
        this.response = value;
    }

}
