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
 *         &lt;element name="ACTION_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="END_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SIEBEL_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actionflag", "endcode", "message",
		"siebelid" })
@XmlRootElement(name = "NewEndForCMS_Output")
public class NewEndForCMSOutput {

	@XmlElement(name = "ACTION_FLAG", required = true)
	protected String actionflag;
	@XmlElement(name = "END_CODE", required = true)
	protected String endcode;
	@XmlElement(name = "MESSAGE", required = true)
	protected String message;
	@XmlElement(name = "SIEBEL_ID", required = true)
	protected String siebelid;

	/**
	 * Gets the value of the actionflag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getACTIONFLAG() {
		return actionflag;
	}

	/**
	 * Sets the value of the actionflag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setACTIONFLAG(String value) {
		this.actionflag = value;
	}

	/**
	 * Gets the value of the endcode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getENDCODE() {
		return endcode;
	}

	/**
	 * Sets the value of the endcode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setENDCODE(String value) {
		this.endcode = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMESSAGE() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMESSAGE(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the siebelid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSIEBELID() {
		return siebelid;
	}

	/**
	 * Sets the value of the siebelid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSIEBELID(String value) {
		this.siebelid = value;
	}

}
