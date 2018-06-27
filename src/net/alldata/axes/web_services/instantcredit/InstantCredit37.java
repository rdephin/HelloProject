//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCredit37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCredit37">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditTermNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bureauCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondSource" type="{http://axes.alldata.net/web-services/instantCredit}secondSource11" minOccurs="0"/>
 *         &lt;element name="birthdayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditTermType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bureauScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="virtualCard" type="{http://axes.alldata.net/web-services/instantCredit}virtualCard" minOccurs="0"/>
 *         &lt;element name="personalizeCard" type="{http://axes.alldata.net/web-services/instantCredit}personalizeCard10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCredit37", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "accountNumber",
    "accountId",
    "applicationId",
    "creditLimit",
    "apr",
    "firstName",
    "middleInitial",
    "lastName",
    "address1",
    "address2",
    "city",
    "state",
    "zipCode",
    "creditTermNumber",
    "bureauCode",
    "secondSource",
    "birthdayDate",
    "businessPhoneNumber",
    "emailAddress",
    "insuranceInd",
    "homePhoneNumber",
    "ssn",
    "creditTermType",
    "customerMemberId",
    "rejectReason",
    "bureauScore",
    "virtualCard",
    "personalizeCard"
})
@XmlSeeAlso({
    InstantCredit38 .class
})
public class InstantCredit37 {

    protected String accountNumber;
    protected String accountId;
    protected String applicationId;
    protected String creditLimit;
    protected String apr;
    protected String firstName;
    protected String middleInitial;
    protected String lastName;
    protected String address1;
    protected String address2;
    protected String city;
    protected String state;
    protected String zipCode;
    protected String creditTermNumber;
    protected String bureauCode;
    protected SecondSource11 secondSource;
    protected String birthdayDate;
    protected String businessPhoneNumber;
    protected String emailAddress;
    protected String insuranceInd;
    protected String homePhoneNumber;
    protected String ssn;
    protected String creditTermType;
    protected String customerMemberId;
    @XmlElement(nillable = true)
    protected List<String> rejectReason;
    protected Integer bureauScore;
    protected VirtualCard virtualCard;
    protected PersonalizeCard10 personalizeCard;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the apr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApr() {
        return apr;
    }

    /**
     * Sets the value of the apr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApr(String value) {
        this.apr = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the creditTermNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTermNumber() {
        return creditTermNumber;
    }

    /**
     * Sets the value of the creditTermNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTermNumber(String value) {
        this.creditTermNumber = value;
    }

    /**
     * Gets the value of the bureauCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureauCode() {
        return bureauCode;
    }

    /**
     * Sets the value of the bureauCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureauCode(String value) {
        this.bureauCode = value;
    }

    /**
     * Gets the value of the secondSource property.
     * 
     * @return
     *     possible object is
     *     {@link SecondSource11 }
     *     
     */
    public SecondSource11 getSecondSource() {
        return secondSource;
    }

    /**
     * Sets the value of the secondSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondSource11 }
     *     
     */
    public void setSecondSource(SecondSource11 value) {
        this.secondSource = value;
    }

    /**
     * Gets the value of the birthdayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdayDate() {
        return birthdayDate;
    }

    /**
     * Sets the value of the birthdayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdayDate(String value) {
        this.birthdayDate = value;
    }

    /**
     * Gets the value of the businessPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * Sets the value of the businessPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumber(String value) {
        this.businessPhoneNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the insuranceInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceInd() {
        return insuranceInd;
    }

    /**
     * Sets the value of the insuranceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceInd(String value) {
        this.insuranceInd = value;
    }

    /**
     * Gets the value of the homePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the value of the homePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumber(String value) {
        this.homePhoneNumber = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the creditTermType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTermType() {
        return creditTermType;
    }

    /**
     * Sets the value of the creditTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTermType(String value) {
        this.creditTermType = value;
    }

    /**
     * Gets the value of the customerMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMemberId() {
        return customerMemberId;
    }

    /**
     * Sets the value of the customerMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMemberId(String value) {
        this.customerMemberId = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRejectReason() {
        if (rejectReason == null) {
            rejectReason = new ArrayList<String>();
        }
        return this.rejectReason;
    }

    /**
     * Gets the value of the bureauScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBureauScore() {
        return bureauScore;
    }

    /**
     * Sets the value of the bureauScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBureauScore(Integer value) {
        this.bureauScore = value;
    }

    /**
     * Gets the value of the virtualCard property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCard }
     *     
     */
    public VirtualCard getVirtualCard() {
        return virtualCard;
    }

    /**
     * Sets the value of the virtualCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCard }
     *     
     */
    public void setVirtualCard(VirtualCard value) {
        this.virtualCard = value;
    }

    /**
     * Gets the value of the personalizeCard property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalizeCard10 }
     *     
     */
    public PersonalizeCard10 getPersonalizeCard() {
        return personalizeCard;
    }

    /**
     * Sets the value of the personalizeCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalizeCard10 }
     *     
     */
    public void setPersonalizeCard(PersonalizeCard10 value) {
        this.personalizeCard = value;
    }

}
