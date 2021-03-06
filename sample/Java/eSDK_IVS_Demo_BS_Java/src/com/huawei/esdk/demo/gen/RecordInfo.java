
package com.huawei.esdk.demo.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordMethod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nvrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mbuDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alarmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordTime" type="{esdk_ivs_professional_server}TimeSpan"/>
 *         &lt;element name="frameExtractionTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookmarkInfo" type="{esdk_ivs_professional_server}BookmarkInfo"/>
 *         &lt;element name="lockInfo" type="{esdk_ivs_professional_server}LockInfo"/>
 *         &lt;element name="ptzPresetInfo" type="{esdk_ivs_professional_server}PTZPresetInfo"/>
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
@XmlType(name = "RecordInfo", propOrder = {
    "recordFileName",
    "recordMethod",
    "nvrCode",
    "mbuDomain",
    "recordType",
    "alarmType",
    "recordTime",
    "frameExtractionTimes",
    "bookmarkInfo",
    "lockInfo",
    "ptzPresetInfo",
    "reserve"
})
public class RecordInfo {

    @XmlElement(required = true)
    protected String recordFileName;
    protected int recordMethod;
    @XmlElement(required = true)
    protected String nvrCode;
    @XmlElement(required = true)
    protected String mbuDomain;
    protected int recordType;
    @XmlElement(required = true)
    protected String alarmType;
    @XmlElement(required = true)
    protected TimeSpan recordTime;
    protected int frameExtractionTimes;
    @XmlElement(required = true)
    protected BookmarkInfo bookmarkInfo;
    @XmlElement(required = true)
    protected LockInfo lockInfo;
    @XmlElement(required = true)
    protected PTZPresetInfo ptzPresetInfo;
    @XmlElement(required = true)
    protected String reserve;

    /**
     * Gets the value of the recordFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordFileName() {
        return recordFileName;
    }

    /**
     * Sets the value of the recordFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordFileName(String value) {
        this.recordFileName = value;
    }

    /**
     * Gets the value of the recordMethod property.
     * 
     */
    public int getRecordMethod() {
        return recordMethod;
    }

    /**
     * Sets the value of the recordMethod property.
     * 
     */
    public void setRecordMethod(int value) {
        this.recordMethod = value;
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
     * Gets the value of the mbuDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbuDomain() {
        return mbuDomain;
    }

    /**
     * Sets the value of the mbuDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbuDomain(String value) {
        this.mbuDomain = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     */
    public int getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     */
    public void setRecordType(int value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the recordTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getRecordTime() {
        return recordTime;
    }

    /**
     * Sets the value of the recordTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setRecordTime(TimeSpan value) {
        this.recordTime = value;
    }

    /**
     * Gets the value of the frameExtractionTimes property.
     * 
     */
    public int getFrameExtractionTimes() {
        return frameExtractionTimes;
    }

    /**
     * Sets the value of the frameExtractionTimes property.
     * 
     */
    public void setFrameExtractionTimes(int value) {
        this.frameExtractionTimes = value;
    }

    /**
     * Gets the value of the bookmarkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkInfo }
     *     
     */
    public BookmarkInfo getBookmarkInfo() {
        return bookmarkInfo;
    }

    /**
     * Sets the value of the bookmarkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkInfo }
     *     
     */
    public void setBookmarkInfo(BookmarkInfo value) {
        this.bookmarkInfo = value;
    }

    /**
     * Gets the value of the lockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LockInfo }
     *     
     */
    public LockInfo getLockInfo() {
        return lockInfo;
    }

    /**
     * Sets the value of the lockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockInfo }
     *     
     */
    public void setLockInfo(LockInfo value) {
        this.lockInfo = value;
    }

    /**
     * Gets the value of the ptzPresetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetInfo }
     *     
     */
    public PTZPresetInfo getPtzPresetInfo() {
        return ptzPresetInfo;
    }

    /**
     * Sets the value of the ptzPresetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetInfo }
     *     
     */
    public void setPtzPresetInfo(PTZPresetInfo value) {
        this.ptzPresetInfo = value;
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
