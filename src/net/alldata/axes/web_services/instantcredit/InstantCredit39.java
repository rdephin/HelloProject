//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCredit39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCredit39">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCredit38">
 *       &lt;sequence>
 *         &lt;element name="balanceTransferEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCredit39", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "balanceTransferEligibility"
})
public class InstantCredit39
    extends InstantCredit38
{

    protected String balanceTransferEligibility;

    /**
     * Gets the value of the balanceTransferEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceTransferEligibility() {
        return balanceTransferEligibility;
    }

    /**
     * Sets the value of the balanceTransferEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceTransferEligibility(String value) {
        this.balanceTransferEligibility = value;
    }

}