//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services._void;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voidRequest32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voidRequest32">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/void}voidRequest31">
 *       &lt;sequence>
 *         &lt;element name="customerPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voidRequest32", namespace = "http://axes.alldata.net/web-services/void", propOrder = {
    "customerPersonId",
    "posType"
})
@XmlSeeAlso({
    VoidRequest33 .class
})
public class VoidRequest32
    extends VoidRequest31
{

    protected String customerPersonId;
    protected String posType;

    /**
     * Gets the value of the customerPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPersonId() {
        return customerPersonId;
    }

    /**
     * Sets the value of the customerPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPersonId(String value) {
        this.customerPersonId = value;
    }

    /**
     * Gets the value of the posType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosType() {
        return posType;
    }

    /**
     * Sets the value of the posType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosType(String value) {
        this.posType = value;
    }

}
