//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCredit33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCredit33">
 *   &lt;complexContent>
 *     &lt;extension base="{http://axes.alldata.net/web-services/instantCredit}instantCredit32">
 *       &lt;sequence>
 *         &lt;element name="duplicateDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCredit33", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "duplicateDivisionNumber"
})
@XmlSeeAlso({
    InstantCredit34 .class
})
public class InstantCredit33
    extends InstantCredit32
{

    protected String duplicateDivisionNumber;

    /**
     * Gets the value of the duplicateDivisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateDivisionNumber() {
        return duplicateDivisionNumber;
    }

    /**
     * Sets the value of the duplicateDivisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateDivisionNumber(String value) {
        this.duplicateDivisionNumber = value;
    }

}
