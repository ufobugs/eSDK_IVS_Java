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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isAscend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCondition", propOrder = {
    "enableOrder",
    "fieldType",
    "isAscend"
})
public class OrderCondition {

    protected int enableOrder;
    protected int fieldType;
    protected int isAscend;

    /**
     * Gets the value of the enableOrder property.
     * 
     */
    public int getEnableOrder() {
        return enableOrder;
    }

    /**
     * Sets the value of the enableOrder property.
     * 
     */
    public void setEnableOrder(int value) {
        this.enableOrder = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     */
    public int getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     */
    public void setFieldType(int value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the isAscend property.
     * 
     */
    public int getIsAscend() {
        return isAscend;
    }

    /**
     * Sets the value of the isAscend property.
     * 
     */
    public void setIsAscend(int value) {
        this.isAscend = value;
    }

}
