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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceBriefInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceBriefInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceBriefInfo" type="{esdk_ivs_professional_server}DeviceBriefInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceBriefInfoList", propOrder = {
    "deviceBriefInfo"
})
public class DeviceBriefInfoList {

    @XmlElement(required = true)
    protected List<DeviceBriefInfo> deviceBriefInfo;

    /**
     * Gets the value of the deviceBriefInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceBriefInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceBriefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceBriefInfo }
     * 
     * 
     */
    public List<DeviceBriefInfo> getDeviceBriefInfo() {
        if (deviceBriefInfo == null) {
            deviceBriefInfo = new ArrayList<DeviceBriefInfo>();
        }
        return this.deviceBriefInfo;
    }

}
