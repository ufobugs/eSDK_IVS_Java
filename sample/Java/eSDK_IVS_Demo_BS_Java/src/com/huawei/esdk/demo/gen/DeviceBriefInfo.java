
package com.huawei.esdk.demo.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceBriefInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceBriefInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceBasicInfo" type="{esdk_ivs_professional_server}DeviceBasicInfo"/>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enableSchedule" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceBriefInfo", propOrder = {
    "deviceBasicInfo",
    "protocolType",
    "loginType",
    "enableSchedule",
    "status",
    "reserve"
})
public class DeviceBriefInfo {

    @XmlElement(required = true)
    protected DeviceBasicInfo deviceBasicInfo;
    @XmlElement(required = true)
    protected String protocolType;
    protected int loginType;
    protected int enableSchedule;
    protected int status;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the deviceBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceBasicInfo }
     *     
     */
    public DeviceBasicInfo getDeviceBasicInfo() {
        return deviceBasicInfo;
    }

    /**
     * Sets the value of the deviceBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceBasicInfo }
     *     
     */
    public void setDeviceBasicInfo(DeviceBasicInfo value) {
        this.deviceBasicInfo = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the loginType property.
     * 
     */
    public int getLoginType() {
        return loginType;
    }

    /**
     * Sets the value of the loginType property.
     * 
     */
    public void setLoginType(int value) {
        this.loginType = value;
    }

    /**
     * Gets the value of the enableSchedule property.
     * 
     */
    public int getEnableSchedule() {
        return enableSchedule;
    }

    /**
     * Sets the value of the enableSchedule property.
     * 
     */
    public void setEnableSchedule(int value) {
        this.enableSchedule = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
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

}
