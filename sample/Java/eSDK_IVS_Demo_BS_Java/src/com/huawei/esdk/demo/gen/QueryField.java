
package com.huawei.esdk.demo.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exactQuery" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryField", propOrder = {
    "fieldType",
    "value",
    "exactQuery"
})
public class QueryField {

    protected int fieldType;
    @XmlElement(required = true)
    protected String value;
    protected int exactQuery;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the exactQuery property.
     * 
     */
    public int getExactQuery() {
        return exactQuery;
    }

    /**
     * Sets the value of the exactQuery property.
     * 
     */
    public void setExactQuery(int value) {
        this.exactQuery = value;
    }

}
