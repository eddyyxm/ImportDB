package com.dbt.webservice.siebel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEQUENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COUNTRY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="H_VOLUME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SELL_CHANNELS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TERM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MAIN_CHANNELS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="M_VOLUME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOBILEPHONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MINOR_CHANNELS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AREA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="L_VOLUME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROV_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contact", "sequence", "name", "countryid",
		"hvolume", "cycle", "sellchannels", "cityid", "termtype", "status",
		"mainchannels", "mvolume", "address", "mobilephone", "minorchannels",
		"area", "lvolume", "lineid", "provid" })
@XmlRootElement(name = "NewEndForCMS_Input")
public class NewEndForCMSInput {

	@XmlElement(name = "CONTACT", required = true)
	protected String contact;
	@XmlElement(name = "SEQUENCE", required = true)
	protected String sequence;
	@XmlElement(name = "NAME", required = true)
	protected String name;
	@XmlElement(name = "COUNTRY_ID", required = true)
	protected String countryid;
	@XmlElement(name = "H_VOLUME", required = true)
	protected String hvolume;
	@XmlElement(name = "CYCLE", required = true)
	protected String cycle;
	@XmlElement(name = "SELL_CHANNELS", required = true)
	protected String sellchannels;
	@XmlElement(name = "CITY_ID", required = true)
	protected String cityid;
	@XmlElement(name = "TERM_TYPE", required = true)
	protected String termtype;
	@XmlElement(name = "STATUS", required = true)
	protected String status;
	@XmlElement(name = "MAIN_CHANNELS", required = true)
	protected String mainchannels;
	@XmlElement(name = "M_VOLUME", required = true)
	protected String mvolume;
	@XmlElement(name = "ADDRESS", required = true)
	protected String address;
	@XmlElement(name = "MOBILEPHONE", required = true)
	protected String mobilephone;
	@XmlElement(name = "MINOR_CHANNELS", required = true)
	protected String minorchannels;
	@XmlElement(name = "AREA", required = true)
	protected String area;
	@XmlElement(name = "L_VOLUME", required = true)
	protected String lvolume;
	@XmlElement(name = "LINE_ID", required = true)
	protected String lineid;
	@XmlElement(name = "PROV_ID", required = true)
	protected String provid;

	/**
	 * Gets the value of the contact property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCONTACT() {
		return contact;
	}

	/**
	 * Sets the value of the contact property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCONTACT(String value) {
		this.contact = value;
	}

	/**
	 * Gets the value of the sequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSEQUENCE() {
		return sequence;
	}

	/**
	 * Sets the value of the sequence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSEQUENCE(String value) {
		this.sequence = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNAME() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNAME(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the countryid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCOUNTRYID() {
		return countryid;
	}

	/**
	 * Sets the value of the countryid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCOUNTRYID(String value) {
		this.countryid = value;
	}

	/**
	 * Gets the value of the hvolume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHVOLUME() {
		return hvolume;
	}

	/**
	 * Sets the value of the hvolume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHVOLUME(String value) {
		this.hvolume = value;
	}

	/**
	 * Gets the value of the cycle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCYCLE() {
		return cycle;
	}

	/**
	 * Sets the value of the cycle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCYCLE(String value) {
		this.cycle = value;
	}

	/**
	 * Gets the value of the sellchannels property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSELLCHANNELS() {
		return sellchannels;
	}

	/**
	 * Sets the value of the sellchannels property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSELLCHANNELS(String value) {
		this.sellchannels = value;
	}

	/**
	 * Gets the value of the cityid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCITYID() {
		return cityid;
	}

	/**
	 * Sets the value of the cityid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCITYID(String value) {
		this.cityid = value;
	}

	/**
	 * Gets the value of the termtype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTERMTYPE() {
		return termtype;
	}

	/**
	 * Sets the value of the termtype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTERMTYPE(String value) {
		this.termtype = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSTATUS() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSTATUS(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the mainchannels property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMAINCHANNELS() {
		return mainchannels;
	}

	/**
	 * Sets the value of the mainchannels property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMAINCHANNELS(String value) {
		this.mainchannels = value;
	}

	/**
	 * Gets the value of the mvolume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMVOLUME() {
		return mvolume;
	}

	/**
	 * Sets the value of the mvolume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMVOLUME(String value) {
		this.mvolume = value;
	}

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getADDRESS() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setADDRESS(String value) {
		this.address = value;
	}

	/**
	 * Gets the value of the mobilephone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMOBILEPHONE() {
		return mobilephone;
	}

	/**
	 * Sets the value of the mobilephone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMOBILEPHONE(String value) {
		this.mobilephone = value;
	}

	/**
	 * Gets the value of the minorchannels property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMINORCHANNELS() {
		return minorchannels;
	}

	/**
	 * Sets the value of the minorchannels property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMINORCHANNELS(String value) {
		this.minorchannels = value;
	}

	/**
	 * Gets the value of the area property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAREA() {
		return area;
	}

	/**
	 * Sets the value of the area property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAREA(String value) {
		this.area = value;
	}

	/**
	 * Gets the value of the lvolume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLVOLUME() {
		return lvolume;
	}

	/**
	 * Sets the value of the lvolume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLVOLUME(String value) {
		this.lvolume = value;
	}

	/**
	 * Gets the value of the lineid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLINEID() {
		return lineid;
	}

	/**
	 * Sets the value of the lineid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLINEID(String value) {
		this.lineid = value;
	}

	/**
	 * Gets the value of the provid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPROVID() {
		return provid;
	}

	/**
	 * Sets the value of the provid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPROVID(String value) {
		this.provid = value;
	}

}
