//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for merchantDiscountFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="merchantDiscountFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimated1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentage1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimated2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentage2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimated3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentage3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merchantDiscountFee", namespace = "http://axes.alldata.net/web-services/sales", propOrder = {
    "depositAmount",
    "discountTotal",
    "estimated1",
    "percentage1",
    "estimated2",
    "percentage2",
    "estimated3",
    "percentage3"
})
public class MerchantDiscountFee {

    protected String depositAmount;
    protected String discountTotal;
    protected String estimated1;
    protected String percentage1;
    protected String estimated2;
    protected String percentage2;
    protected String estimated3;
    protected String percentage3;

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositAmount(String value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the discountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Sets the value of the discountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountTotal(String value) {
        this.discountTotal = value;
    }

    /**
     * Gets the value of the estimated1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimated1() {
        return estimated1;
    }

    /**
     * Sets the value of the estimated1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimated1(String value) {
        this.estimated1 = value;
    }

    /**
     * Gets the value of the percentage1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage1() {
        return percentage1;
    }

    /**
     * Sets the value of the percentage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage1(String value) {
        this.percentage1 = value;
    }

    /**
     * Gets the value of the estimated2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimated2() {
        return estimated2;
    }

    /**
     * Sets the value of the estimated2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimated2(String value) {
        this.estimated2 = value;
    }

    /**
     * Gets the value of the percentage2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage2() {
        return percentage2;
    }

    /**
     * Sets the value of the percentage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage2(String value) {
        this.percentage2 = value;
    }

    /**
     * Gets the value of the estimated3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimated3() {
        return estimated3;
    }

    /**
     * Sets the value of the estimated3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimated3(String value) {
        this.estimated3 = value;
    }

    /**
     * Gets the value of the percentage3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage3() {
        return percentage3;
    }

    /**
     * Sets the value of the percentage3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage3(String value) {
        this.percentage3 = value;
    }

}
