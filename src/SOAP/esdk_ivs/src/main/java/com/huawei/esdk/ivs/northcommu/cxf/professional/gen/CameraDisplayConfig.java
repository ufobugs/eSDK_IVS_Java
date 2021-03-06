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
 * <p>Java class for CameraDisplayConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraDisplayConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brightness" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contrast" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="saturation" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "CameraDisplayConfig", propOrder = {
    "brightness",
    "contrast",
    "hue",
    "saturation",
    "reserve"
})
public class CameraDisplayConfig {

    protected int brightness;
    protected int contrast;
    protected int hue;
    protected int saturation;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the brightness property.
     * 
     */
    public int getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     */
    public void setBrightness(int value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the contrast property.
     * 
     */
    public int getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     */
    public void setContrast(int value) {
        this.contrast = value;
    }

    /**
     * Gets the value of the hue property.
     * 
     */
    public int getHue() {
        return hue;
    }

    /**
     * Sets the value of the hue property.
     * 
     */
    public void setHue(int value) {
        this.hue = value;
    }

    /**
     * Gets the value of the saturation property.
     * 
     */
    public int getSaturation() {
        return saturation;
    }

    /**
     * Sets the value of the saturation property.
     * 
     */
    public void setSaturation(int value) {
        this.saturation = value;
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
