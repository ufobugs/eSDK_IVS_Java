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
package com.huawei.esdk.ivs.northcommu.cxf.professional.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraOSDConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraOSDConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableOSD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="osdTime" type="{esdk_ivs_professional_server}OSDTime"/>
 *         &lt;element name="osdName" type="{esdk_ivs_professional_server}OSDName"/>
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
@XmlType(name = "CameraOSDConfig", propOrder = {
    "enableOSD",
    "osdTime",
    "osdName",
    "reserve"
})
public class CameraOSDConfig {

    protected int enableOSD;
    @XmlElement(required = true)
    protected OSDTime osdTime;
    @XmlElement(required = true)
    protected OSDName osdName;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the enableOSD property.
     * 
     */
    public int getEnableOSD() {
        return enableOSD;
    }

    /**
     * Sets the value of the enableOSD property.
     * 
     */
    public void setEnableOSD(int value) {
        this.enableOSD = value;
    }

    /**
     * Gets the value of the osdTime property.
     * 
     * @return
     *     possible object is
     *     {@link OSDTime }
     *     
     */
    public OSDTime getOsdTime() {
        return osdTime;
    }

    /**
     * Sets the value of the osdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTime }
     *     
     */
    public void setOsdTime(OSDTime value) {
        this.osdTime = value;
    }

    /**
     * Gets the value of the osdName property.
     * 
     * @return
     *     possible object is
     *     {@link OSDName }
     *     
     */
    public OSDName getOsdName() {
        return osdName;
    }

    /**
     * Sets the value of the osdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDName }
     *     
     */
    public void setOsdName(OSDName value) {
        this.osdName = value;
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
