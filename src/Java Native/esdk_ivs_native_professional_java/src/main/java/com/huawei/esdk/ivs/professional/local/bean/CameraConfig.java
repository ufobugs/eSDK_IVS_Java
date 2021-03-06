/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.esdk.ivs.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.ivs.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for CameraConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cameraCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cameraName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cameraPosition" type="{esdk_ivs_professional_server}CameraPosition"/>
 *         &lt;element name="isSupportBroadcast" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="broadcastInfo" type="{esdk_ivs_professional_server}BroadcastInfo"/>
 *         &lt;element name="enableVoice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="voiceOutCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nvrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cameraType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cameraStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "CameraConfig", propOrder = {
    "videoChannel",
    "cameraCode",
    "cameraName",
    "cameraPosition",
    "isSupportBroadcast",
    "broadcastInfo",
    "enableVoice",
    "voiceOutCode",
    "parentCode",
    "nvrCode",
    "cameraType",
    "cameraStatus",
    "reserve"
})
public class CameraConfig {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer videoChannel;
    @XmlElement(required = true)
    protected String cameraCode;
    @XmlElement(required = true)
    protected String cameraName;
    @XmlElement(required = true)
    protected CameraPosition cameraPosition;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isSupportBroadcast;
    @XmlElement(required = true)
    protected BroadcastInfo broadcastInfo;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer enableVoice;
    @XmlElement(required = true)
    protected String voiceOutCode;
    @XmlElement(required = true)
    protected String parentCode;
    @XmlElement(required = true)
    protected String nvrCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer cameraType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer cameraStatus;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the videoChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getVideoChannel() {
        return videoChannel;
    }

    /**
     * Sets the value of the videoChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoChannel(Integer value) {
        this.videoChannel = value;
    }

    /**
     * Gets the value of the cameraCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraCode() {
        return cameraCode;
    }

    /**
     * Sets the value of the cameraCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraCode(String value) {
        this.cameraCode = value;
    }

    /**
     * Gets the value of the cameraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraName() {
        return cameraName;
    }

    /**
     * Sets the value of the cameraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraName(String value) {
        this.cameraName = value;
    }

    /**
     * Gets the value of the cameraPosition property.
     * 
     * @return
     *     possible object is
     *     {@link CameraPosition }
     *     
     */
    public CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    /**
     * Sets the value of the cameraPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraPosition }
     *     
     */
    public void setCameraPosition(CameraPosition value) {
        this.cameraPosition = value;
    }

    /**
     * Gets the value of the isSupportBroadcast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIsSupportBroadcast() {
        return isSupportBroadcast;
    }

    /**
     * Sets the value of the isSupportBroadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSupportBroadcast(Integer value) {
        this.isSupportBroadcast = value;
    }

    /**
     * Gets the value of the broadcastInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BroadcastInfo }
     *     
     */
    public BroadcastInfo getBroadcastInfo() {
        return broadcastInfo;
    }

    /**
     * Sets the value of the broadcastInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadcastInfo }
     *     
     */
    public void setBroadcastInfo(BroadcastInfo value) {
        this.broadcastInfo = value;
    }

    /**
     * Gets the value of the enableVoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getEnableVoice() {
        return enableVoice;
    }

    /**
     * Sets the value of the enableVoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableVoice(Integer value) {
        this.enableVoice = value;
    }

    /**
     * Gets the value of the voiceOutCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceOutCode() {
        return voiceOutCode;
    }

    /**
     * Sets the value of the voiceOutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceOutCode(String value) {
        this.voiceOutCode = value;
    }

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCode(String value) {
        this.parentCode = value;
    }

    /**
     * Gets the value of the nvrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNvrCode() {
        return nvrCode;
    }

    /**
     * Sets the value of the nvrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNvrCode(String value) {
        this.nvrCode = value;
    }

    /**
     * Gets the value of the cameraType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCameraType() {
        return cameraType;
    }

    /**
     * Sets the value of the cameraType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraType(Integer value) {
        this.cameraType = value;
    }

    /**
     * Gets the value of the cameraStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCameraStatus() {
        return cameraStatus;
    }

    /**
     * Sets the value of the cameraStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraStatus(Integer value) {
        this.cameraStatus = value;
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
