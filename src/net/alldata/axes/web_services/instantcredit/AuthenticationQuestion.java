//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticationQuestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationQuestion", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "question",
    "choice1",
    "choice2",
    "choice3",
    "choice4",
    "choice5"
})
public class AuthenticationQuestion {

    protected String question;
    protected String choice1;
    protected String choice2;
    protected String choice3;
    protected String choice4;
    protected String choice5;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the choice1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice1() {
        return choice1;
    }

    /**
     * Sets the value of the choice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice1(String value) {
        this.choice1 = value;
    }

    /**
     * Gets the value of the choice2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice2() {
        return choice2;
    }

    /**
     * Sets the value of the choice2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice2(String value) {
        this.choice2 = value;
    }

    /**
     * Gets the value of the choice3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice3() {
        return choice3;
    }

    /**
     * Sets the value of the choice3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice3(String value) {
        this.choice3 = value;
    }

    /**
     * Gets the value of the choice4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice4() {
        return choice4;
    }

    /**
     * Sets the value of the choice4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice4(String value) {
        this.choice4 = value;
    }

    /**
     * Gets the value of the choice5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice5() {
        return choice5;
    }

    /**
     * Sets the value of the choice5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice5(String value) {
        this.choice5 = value;
    }

}
