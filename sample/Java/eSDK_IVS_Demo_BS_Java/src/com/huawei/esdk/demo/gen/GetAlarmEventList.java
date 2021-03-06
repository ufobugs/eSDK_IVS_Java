
package com.huawei.esdk.demo.gen;

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
 *         &lt;element name="unifiedQuery" type="{esdk_ivs_professional_server}QueryUnifiedFormat"/>
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
    "unifiedQuery"
})
@XmlRootElement(name = "getAlarmEventList")
public class GetAlarmEventList {

    @XmlElement(required = true)
    protected QueryUnifiedFormat unifiedQuery;

    /**
     * Gets the value of the unifiedQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryUnifiedFormat }
     *     
     */
    public QueryUnifiedFormat getUnifiedQuery() {
        return unifiedQuery;
    }

    /**
     * Sets the value of the unifiedQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryUnifiedFormat }
     *     
     */
    public void setUnifiedQuery(QueryUnifiedFormat value) {
        this.unifiedQuery = value;
    }

}
