//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditRequest49 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditRequest49">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCreditRequest48">
 *       &lt;sequence>
 *         &lt;element name="echoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditRequest49", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "echoURL",
    "sessionId"
})
@XmlSeeAlso({
    InstantCreditRequest410 .class
})
public class InstantCreditRequest49
    extends InstantCreditRequest48
{

    protected String echoURL;
    protected String sessionId;

    /**
     * Gets the value of the echoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoURL() {
        return echoURL;
    }

    /**
     * Sets the value of the echoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoURL(String value) {
        this.echoURL = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}