//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.ping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pingRequest30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pingRequest30">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientHeader" type="{http://axes.alldata.net/web-services/ping}clientHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pingRequest30", namespace = "http://axes.alldata.net/web-services/ping", propOrder = {
    "clientHeader"
})
public class PingRequest30 {

    protected ClientHeader clientHeader;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the clientHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ClientHeader }
     *     
     */
    public ClientHeader getClientHeader() {
        return clientHeader;
    }

    /**
     * Sets the value of the clientHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientHeader }
     *     
     */
    public void setClientHeader(ClientHeader value) {
        this.clientHeader = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
