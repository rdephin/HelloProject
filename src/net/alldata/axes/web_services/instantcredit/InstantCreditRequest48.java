//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditRequest48 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditRequest48">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCreditRequest47">
 *       &lt;sequence>
 *         &lt;element name="cellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditRequest48", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "cellPhoneNumber"
})
@XmlSeeAlso({
    InstantCreditRequest49 .class
})
public class InstantCreditRequest48
    extends InstantCreditRequest47
{

    protected String cellPhoneNumber;

    /**
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

}
