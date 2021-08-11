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
 *         &lt;element name="GRIDNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GRIDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AREAID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "gridname", "gridstatus", "areaid" })
@XmlRootElement(name = "NewGridForCMS_Input")
public class NewGridForCMSInput {

	@XmlElement(name = "GRIDNAME", required = true)
	protected String gridname;
	@XmlElement(name = "GRIDSTATUS", required = true)
	protected String gridstatus;
	@XmlElement(name = "AREAID", required = true)
	protected String areaid;

	/**
	 * Gets the value of the gridname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGRIDNAME() {
		return gridname;
	}

	/**
	 * Sets the value of the gridname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGRIDNAME(String value) {
		this.gridname = value;
	}

	/**
	 * Gets the value of the gridstatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGRIDSTATUS() {
		return gridstatus;
	}

	/**
	 * Sets the value of the gridstatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGRIDSTATUS(String value) {
		this.gridstatus = value;
	}

	/**
	 * Gets the value of the areaid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAREAID() {
		return areaid;
	}

	/**
	 * Sets the value of the areaid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAREAID(String value) {
		this.areaid = value;
	}

}
