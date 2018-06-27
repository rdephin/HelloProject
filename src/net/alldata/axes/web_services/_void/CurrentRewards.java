//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services._void;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currentRewards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currentRewards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="levelNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPointsAvailable" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currentRewards", namespace = "http://axes.alldata.net/web-services/void", propOrder = {
    "levelNumber",
    "totalPointsAvailable",
    "postDate",
    "description"
})
@XmlSeeAlso({
    CurrentRewards10 .class
})
public class CurrentRewards {

    protected int levelNumber;
    protected long totalPointsAvailable;
    protected int postDate;
    protected String description;

    /**
     * Gets the value of the levelNumber property.
     * 
     */
    public int getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     */
    public void setLevelNumber(int value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the totalPointsAvailable property.
     * 
     */
    public long getTotalPointsAvailable() {
        return totalPointsAvailable;
    }

    /**
     * Sets the value of the totalPointsAvailable property.
     * 
     */
    public void setTotalPointsAvailable(long value) {
        this.totalPointsAvailable = value;
    }

    /**
     * Gets the value of the postDate property.
     * 
     */
    public int getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     */
    public void setPostDate(int value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
