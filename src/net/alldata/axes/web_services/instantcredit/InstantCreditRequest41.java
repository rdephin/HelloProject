//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditRequest41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditRequest41">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCreditRequest40">
 *       &lt;sequence>
 *         &lt;element name="feeBaseInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditRequest41", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "feeBaseInd"
})
@XmlSeeAlso({
    InstantCreditRequest42 .class,
    InstantCreditRequest43 .class
})
public class InstantCreditRequest41
    extends InstantCreditRequest40
{

    protected String feeBaseInd;

    /**
     * Gets the value of the feeBaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeBaseInd() {
        return feeBaseInd;
    }

    /**
     * Sets the value of the feeBaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeBaseInd(String value) {
        this.feeBaseInd = value;
    }

}
