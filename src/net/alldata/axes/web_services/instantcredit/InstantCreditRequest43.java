//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditRequest43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditRequest43">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCreditRequest41">
 *       &lt;sequence>
 *         &lt;element name="onsiteIssueInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditRequest43", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "onsiteIssueInd"
})
@XmlSeeAlso({
    InstantCreditRequest44 .class
})
public class InstantCreditRequest43
    extends InstantCreditRequest41
{

    protected String onsiteIssueInd;

    /**
     * Gets the value of the onsiteIssueInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnsiteIssueInd() {
        return onsiteIssueInd;
    }

    /**
     * Sets the value of the onsiteIssueInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnsiteIssueInd(String value) {
        this.onsiteIssueInd = value;
    }

}