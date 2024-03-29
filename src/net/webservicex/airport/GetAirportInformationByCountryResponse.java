
package net.webservicex.airport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAirportInformationByCountryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAirportInformationByCountryResult"
})
@XmlRootElement(name = "GetAirportInformationByCountryResponse")
public class GetAirportInformationByCountryResponse {

    @XmlElement(name = "GetAirportInformationByCountryResult")
    protected String getAirportInformationByCountryResult;

    /**
     * Gets the value of the getAirportInformationByCountryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAirportInformationByCountryResult() {
        return getAirportInformationByCountryResult;
    }

    /**
     * Sets the value of the getAirportInformationByCountryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAirportInformationByCountryResult(String value) {
        this.getAirportInformationByCountryResult = value;
    }

}
