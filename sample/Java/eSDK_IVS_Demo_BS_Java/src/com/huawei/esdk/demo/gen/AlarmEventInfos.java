
package com.huawei.esdk.demo.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmEventInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmEventInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indexRange" type="{esdk_ivs_professional_server}IndexRange"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmEventInfoList" type="{esdk_ivs_professional_server}AlarmEventInfoList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEventInfos", propOrder = {
    "total",
    "indexRange",
    "reserve",
    "alarmEventInfoList"
})
public class AlarmEventInfos {

    protected int total;
    @XmlElement(required = true)
    protected IndexRange indexRange;
    @XmlElement(required = true)
    protected String reserve;
    @XmlElement(required = true)
    protected AlarmEventInfoList alarmEventInfoList;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the indexRange property.
     * 
     * @return
     *     possible object is
     *     {@link IndexRange }
     *     
     */
    public IndexRange getIndexRange() {
        return indexRange;
    }

    /**
     * Sets the value of the indexRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexRange }
     *     
     */
    public void setIndexRange(IndexRange value) {
        this.indexRange = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the alarmEventInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmEventInfoList }
     *     
     */
    public AlarmEventInfoList getAlarmEventInfoList() {
        return alarmEventInfoList;
    }

    /**
     * Sets the value of the alarmEventInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmEventInfoList }
     *     
     */
    public void setAlarmEventInfoList(AlarmEventInfoList value) {
        this.alarmEventInfoList = value;
    }

}
