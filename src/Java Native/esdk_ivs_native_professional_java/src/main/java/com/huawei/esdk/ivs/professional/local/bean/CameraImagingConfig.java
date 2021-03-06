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
 * <p>Java class for CameraImagingConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraImagingConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backlight" type="{esdk_ivs_professional_server}Backlight"/>
 *         &lt;element name="exposure" type="{esdk_ivs_professional_server}Exposure"/>
 *         &lt;element name="focus" type="{esdk_ivs_professional_server}Focus"/>
 *         &lt;element name="wideDynamic" type="{esdk_ivs_professional_server}WideDynamic"/>
 *         &lt;element name="whiteBalance" type="{esdk_ivs_professional_server}WhiteBalance"/>
 *         &lt;element name="stabilization" type="{esdk_ivs_professional_server}Stabilization"/>
 *         &lt;element name="irCutFilter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sharpness" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "CameraImagingConfig", propOrder = {
    "backlight",
    "exposure",
    "focus",
    "wideDynamic",
    "whiteBalance",
    "stabilization",
    "irCutFilter",
    "sharpness",
    "reserve"
})
public class CameraImagingConfig {

    @XmlElement(required = true)
    protected Backlight backlight;
    @XmlElement(required = true)
    protected Exposure exposure;
    @XmlElement(required = true)
    protected Focus focus;
    @XmlElement(required = true)
    protected WideDynamic wideDynamic;
    @XmlElement(required = true)
    protected WhiteBalance whiteBalance;
    @XmlElement(required = true)
    protected Stabilization stabilization;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer irCutFilter;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer sharpness;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the backlight property.
     * 
     * @return
     *     possible object is
     *     {@link Backlight }
     *     
     */
    public Backlight getBacklight() {
        return backlight;
    }

    /**
     * Sets the value of the backlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Backlight }
     *     
     */
    public void setBacklight(Backlight value) {
        this.backlight = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Exposure }
     *     
     */
    public Exposure getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exposure }
     *     
     */
    public void setExposure(Exposure value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link Focus }
     *     
     */
    public Focus getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Focus }
     *     
     */
    public void setFocus(Focus value) {
        this.focus = value;
    }

    /**
     * Gets the value of the wideDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamic }
     *     
     */
    public WideDynamic getWideDynamic() {
        return wideDynamic;
    }

    /**
     * Sets the value of the wideDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamic }
     *     
     */
    public void setWideDynamic(WideDynamic value) {
        this.wideDynamic = value;
    }

    /**
     * Gets the value of the whiteBalance property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance }
     *     
     */
    public WhiteBalance getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Sets the value of the whiteBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance }
     *     
     */
    public void setWhiteBalance(WhiteBalance value) {
        this.whiteBalance = value;
    }

    /**
     * Gets the value of the stabilization property.
     * 
     * @return
     *     possible object is
     *     {@link Stabilization }
     *     
     */
    public Stabilization getStabilization() {
        return stabilization;
    }

    /**
     * Sets the value of the stabilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stabilization }
     *     
     */
    public void setStabilization(Stabilization value) {
        this.stabilization = value;
    }

    /**
     * Gets the value of the irCutFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIrCutFilter() {
        return irCutFilter;
    }

    /**
     * Sets the value of the irCutFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrCutFilter(Integer value) {
        this.irCutFilter = value;
    }

    /**
     * Gets the value of the sharpness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getSharpness() {
        return sharpness;
    }

    /**
     * Sets the value of the sharpness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharpness(Integer value) {
        this.sharpness = value;
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
