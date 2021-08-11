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
 *         &lt;element name="GRID_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GRID_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actionflag", "gridcode", "gridid", "message" })
@XmlRootElement(name = "NewGridForCMS_Output")
public class NewGridForCMSOutput {

	@XmlElement(name = "ACTION_FLAG", required = true)
	protected String actionflag;
	@XmlElement(name = "GRID_CODE", required = true)
	protected String gridcode;
	@XmlElement(name = "GRID_ID", required = true)
	protected String gridid;
	@XmlElement(name = "MESSAGE", required = true)
	protected String message;

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
	 * Gets the value of the gridcode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGRIDCODE() {
		return gridcode;
	}

	/**
	 * Sets the value of the gridcode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGRIDCODE(String value) {
		this.gridcode = value;
	}

	/**
	 * Gets the value of the gridid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGRIDID() {
		return gridid;
	}

	/**
	 * Sets the value of the gridid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGRIDID(String value) {
		this.gridid = value;
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

}
