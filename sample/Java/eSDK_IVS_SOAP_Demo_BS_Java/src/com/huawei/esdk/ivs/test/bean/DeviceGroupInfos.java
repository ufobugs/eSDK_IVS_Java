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
package com.huawei.esdk.ivs.test.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.ivs.test.service.impl.autogen.Adapter3;

/**
 * <p>Java class for DeviceGroupInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceGroupInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indexRange" type="{esdk_ivs_professional_server}IndexRange"/>
 *         &lt;element name="deviceGroupList" type="{esdk_ivs_professional_server}DeviceGroupList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceGroupInfos", propOrder = {
    "total",
    "indexRange",
    "deviceGroupList"
})
public class DeviceGroupInfos {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer total;
    @XmlElement(required = true)
    protected IndexRange indexRange;
    @XmlElement(required = true)
    protected DeviceGroupList deviceGroupList;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(Integer value) {
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
     * Gets the value of the deviceGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceGroupList }
     *     
     */
    public DeviceGroupList getDeviceGroupList() {
        return deviceGroupList;
    }

    /**
     * Sets the value of the deviceGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceGroupList }
     *     
     */
    public void setDeviceGroupList(DeviceGroupList value) {
        this.deviceGroupList = value;
    }

}
