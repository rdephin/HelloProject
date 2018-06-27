//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.instantcredit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instantCreditRequest40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instantCreditRequest40">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://axes.alldata.net/web-services/instantCredit}address" minOccurs="0"/>
 *         &lt;element name="applicationSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authBuyer" type="{http://axes.alldata.net/web-services/instantCredit}authBuyer" minOccurs="0"/>
 *         &lt;element name="birthdayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clerkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientHeader" type="{http://axes.alldata.net/web-services/instantCredit}clientHeader" minOccurs="0"/>
 *         &lt;element name="customerFacingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverLicenseBlob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeAcknowledgementInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iovation" type="{http://axes.alldata.net/web-services/instantCredit}iovation" minOccurs="0"/>
 *         &lt;element name="jointApplicant" type="{http://axes.alldata.net/web-services/instantCredit}jointApplicant" minOccurs="0"/>
 *         &lt;element name="name" type="{http://axes.alldata.net/web-services/instantCredit}name" minOccurs="0"/>
 *         &lt;element name="posType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instantCreditRequest40", namespace = "http://axes.alldata.net/web-services/instantCredit", propOrder = {
    "address",
    "applicationSubType",
    "authBuyer",
    "birthdayDate",
    "businessPhoneNumber",
    "cardType",
    "clerkNumber",
    "clientHeader",
    "customerFacingInd",
    "customerMemberId",
    "customerPersonId",
    "departmentId",
    "deviceId",
    "driverLicenseBlob",
    "emailAddress",
    "homePhoneNumber",
    "incomeAcknowledgementInd",
    "incomeAmount",
    "incomeInd",
    "insuranceInd",
    "iovation",
    "jointApplicant",
    "name",
    "posType",
    "purchaseAmount",
    "recordType",
    "referenceNumber",
    "ssn",
    "storeNumber",
    "vipInd"
})
@XmlSeeAlso({
    InstantCreditRequest41 .class
})
public class InstantCreditRequest40 {

    protected Address address;
    protected String applicationSubType;
    protected AuthBuyer authBuyer;
    protected String birthdayDate;
    protected String businessPhoneNumber;
    protected String cardType;
    protected String clerkNumber;
    protected ClientHeader clientHeader;
    protected String customerFacingInd;
    protected String customerMemberId;
    protected String customerPersonId;
    protected String departmentId;
    protected String deviceId;
    protected String driverLicenseBlob;
    protected String emailAddress;
    protected String homePhoneNumber;
    protected String incomeAcknowledgementInd;
    protected String incomeAmount;
    protected String incomeInd;
    protected String insuranceInd;
    protected Iovation iovation;
    protected JointApplicant jointApplicant;
    protected Name name;
    protected String posType;
    protected String purchaseAmount;
    protected String recordType;
    protected String referenceNumber;
    protected String ssn;
    protected String storeNumber;
    protected String vipInd;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the applicationSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationSubType() {
        return applicationSubType;
    }

    /**
     * Sets the value of the applicationSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationSubType(String value) {
        this.applicationSubType = value;
    }

    /**
     * Gets the value of the authBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link AuthBuyer }
     *     
     */
    public AuthBuyer getAuthBuyer() {
        return authBuyer;
    }

    /**
     * Sets the value of the authBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthBuyer }
     *     
     */
    public void setAuthBuyer(AuthBuyer value) {
        this.authBuyer = value;
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
     * Gets the value of the clerkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkNumber() {
        return clerkNumber;
    }

    /**
     * Sets the value of the clerkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkNumber(String value) {
        this.clerkNumber = value;
    }

    /**
     * Gets the value of the clientHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ClientHeader }
     *     
     */
    public ClientHeader getClientHeader() {
        return clientHeader;
    }

    /**
     * Sets the value of the clientHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientHeader }
     *     
     */
    public void setClientHeader(ClientHeader value) {
        this.clientHeader = value;
    }

    /**
     * Gets the value of the customerFacingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFacingInd() {
        return customerFacingInd;
    }

    /**
     * Sets the value of the customerFacingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFacingInd(String value) {
        this.customerFacingInd = value;
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
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentId(String value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the driverLicenseBlob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLicenseBlob() {
        return driverLicenseBlob;
    }

    /**
     * Sets the value of the driverLicenseBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLicenseBlob(String value) {
        this.driverLicenseBlob = value;
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
     * Gets the value of the incomeAcknowledgementInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeAcknowledgementInd() {
        return incomeAcknowledgementInd;
    }

    /**
     * Sets the value of the incomeAcknowledgementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeAcknowledgementInd(String value) {
        this.incomeAcknowledgementInd = value;
    }

    /**
     * Gets the value of the incomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeAmount() {
        return incomeAmount;
    }

    /**
     * Sets the value of the incomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeAmount(String value) {
        this.incomeAmount = value;
    }

    /**
     * Gets the value of the incomeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeInd() {
        return incomeInd;
    }

    /**
     * Sets the value of the incomeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeInd(String value) {
        this.incomeInd = value;
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
     * Gets the value of the iovation property.
     * 
     * @return
     *     possible object is
     *     {@link Iovation }
     *     
     */
    public Iovation getIovation() {
        return iovation;
    }

    /**
     * Sets the value of the iovation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iovation }
     *     
     */
    public void setIovation(Iovation value) {
        this.iovation = value;
    }

    /**
     * Gets the value of the jointApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link JointApplicant }
     *     
     */
    public JointApplicant getJointApplicant() {
        return jointApplicant;
    }

    /**
     * Sets the value of the jointApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointApplicant }
     *     
     */
    public void setJointApplicant(JointApplicant value) {
        this.jointApplicant = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
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

    /**
     * Gets the value of the purchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * Sets the value of the purchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseAmount(String value) {
        this.purchaseAmount = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
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
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the vipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipInd() {
        return vipInd;
    }

    /**
     * Sets the value of the vipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipInd(String value) {
        this.vipInd = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
