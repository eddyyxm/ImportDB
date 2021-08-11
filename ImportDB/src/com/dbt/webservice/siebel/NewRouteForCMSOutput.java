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
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROUTE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROUTE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actionflag", "message", "routecode",
		"routeid" })
@XmlRootElement(name = "NewRouteForCMS_Output")
public class NewRouteForCMSOutput {

	@XmlElement(name = "ACTION_FLAG", required = true)
	protected String actionflag;
	@XmlElement(name = "MESSAGE", required = true)
	protected String message;
	@XmlElement(name = "ROUTE_CODE", required = true)
	protected String routecode;
	@XmlElement(name = "ROUTE_ID", required = true)
	protected String routeid;

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
	 * Gets the value of the routecode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROUTECODE() {
		return routecode;
	}

	/**
	 * Sets the value of the routecode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setROUTECODE(String value) {
		this.routecode = value;
	}

	/**
	 * Gets the value of the routeid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROUTEID() {
		return routeid;
	}

	/**
	 * Sets the value of the routeid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setROUTEID(String value) {
		this.routeid = value;
	}

}
