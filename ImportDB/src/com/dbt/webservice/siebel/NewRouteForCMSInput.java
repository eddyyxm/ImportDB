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
 *         &lt;element name="ROUTEDESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROUTENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROUTESTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GRIDKEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "routedesc", "routename", "routestatus",
		"gridkey" })
@XmlRootElement(name = "NewRouteForCMS_Input")
public class NewRouteForCMSInput {

	@XmlElement(name = "ROUTEDESC", required = true)
	protected String routedesc;
	@XmlElement(name = "ROUTENAME", required = true)
	protected String routename;
	@XmlElement(name = "ROUTESTATUS", required = true)
	protected String routestatus;
	@XmlElement(name = "GRIDKEY", required = true)
	protected String gridkey;

	/**
	 * Gets the value of the routedesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROUTEDESC() {
		return routedesc;
	}

	/**
	 * Sets the value of the routedesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setROUTEDESC(String value) {
		this.routedesc = value;
	}

	/**
	 * Gets the value of the routename property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROUTENAME() {
		return routename;
	}

	/**
	 * Sets the value of the routename property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setROUTENAME(String value) {
		this.routename = value;
	}

	/**
	 * Gets the value of the routestatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROUTESTATUS() {
		return routestatus;
	}

	/**
	 * Sets the value of the routestatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setROUTESTATUS(String value) {
		this.routestatus = value;
	}

	/**
	 * Gets the value of the gridkey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGRIDKEY() {
		return gridkey;
	}

	/**
	 * Sets the value of the gridkey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGRIDKEY(String value) {
		this.gridkey = value;
	}

}
