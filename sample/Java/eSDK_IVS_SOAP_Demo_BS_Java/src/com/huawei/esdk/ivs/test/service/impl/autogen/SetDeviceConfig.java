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
package com.huawei.esdk.ivs.test.service.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.ivs.test.bean.ConfigItem;


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
 *         &lt;element name="deviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="configItem" type="{esdk_ivs_professional_server}ConfigItem"/>
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
    "deviceCode",
    "configType",
    "configItem"
})
@XmlRootElement(name = "setDeviceConfig")
public class SetDeviceConfig {

    @XmlElement(required = true)
    protected String deviceCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer configType;
    @XmlElement(required = true)
    protected ConfigItem configItem;

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the configType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getConfigType() {
        return configType;
    }

    /**
     * Sets the value of the configType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigType(Integer value) {
        this.configType = value;
    }

    /**
     * Gets the value of the configItem property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigItem }
     *     
     */
    public ConfigItem getConfigItem() {
        return configItem;
    }

    /**
     * Sets the value of the configItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigItem }
     *     
     */
    public void setConfigItem(ConfigItem value) {
        this.configItem = value;
    }

}
