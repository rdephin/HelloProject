//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditResponse44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditResponse44">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{http://axes.alldata.net/web-services/instantCredit}account" minOccurs="0"/>
 *         &lt;element name="authenticationQuestions" type="{http://axes.alldata.net/web-services/instantCredit}authenticationQuestions10" minOccurs="0"/>
 *         &lt;element name="accountSummary" type="{http://axes.alldata.net/web-services/instantCredit}accountSummary40" minOccurs="0"/>
 *         &lt;element name="instantCredit" type="{http://axes.alldata.net/web-services/instantCredit}instantCredit36" minOccurs="0"/>
 *         &lt;element name="prescreenAcceptance" type="{http://axes.alldata.net/web-services/instantCredit}prescreenAcceptance36" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditResponse44", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "correlationData",
    "customerPersonId",
    "returnCode",
    "errorCode",
    "errorMessage",
    "cardType",
    "account",
    "authenticationQuestions",
    "accountSummary",
    "instantCredit",
    "prescreenAcceptance"
})
public class InstantCreditResponse44 {

    protected String correlationData;
    protected String customerPersonId;
    protected String returnCode;
    protected String errorCode;
    protected String errorMessage;
    protected String cardType;
    protected Account account;
    protected AuthenticationQuestions10 authenticationQuestions;
    protected AccountSummary40 accountSummary;
    protected InstantCredit36 instantCredit;
    protected PrescreenAcceptance36 prescreenAcceptance;

    /**
     * Gets the value of the correlationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationData() {
        return correlationData;
    }

    /**
     * Sets the value of the correlationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationData(String value) {
        this.correlationData = value;
    }

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
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the authenticationQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationQuestions10 }
     *     
     */
    public AuthenticationQuestions10 getAuthenticationQuestions() {
        return authenticationQuestions;
    }

    /**
     * Sets the value of the authenticationQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationQuestions10 }
     *     
     */
    public void setAuthenticationQuestions(AuthenticationQuestions10 value) {
        this.authenticationQuestions = value;
    }

    /**
     * Gets the value of the accountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummary40 }
     *     
     */
    public AccountSummary40 getAccountSummary() {
        return accountSummary;
    }

    /**
     * Sets the value of the accountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummary40 }
     *     
     */
    public void setAccountSummary(AccountSummary40 value) {
        this.accountSummary = value;
    }

    /**
     * Gets the value of the instantCredit property.
     * 
     * @return
     *     possible object is
     *     {@link InstantCredit36 }
     *     
     */
    public InstantCredit36 getInstantCredit() {
        return instantCredit;
    }

    /**
     * Sets the value of the instantCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantCredit36 }
     *     
     */
    public void setInstantCredit(InstantCredit36 value) {
        this.instantCredit = value;
    }

    /**
     * Gets the value of the prescreenAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link PrescreenAcceptance36 }
     *     
     */
    public PrescreenAcceptance36 getPrescreenAcceptance() {
        return prescreenAcceptance;
    }

    /**
     * Sets the value of the prescreenAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescreenAcceptance36 }
     *     
     */
    public void setPrescreenAcceptance(PrescreenAcceptance36 value) {
        this.prescreenAcceptance = value;
    }

}