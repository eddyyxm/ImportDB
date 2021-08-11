package com.dbt.entity;

import java.math.BigDecimal;

public class TerminalEntity {
	private String terminalkey;
	private String routekey;
	private String terminalcode;
	private String terminalname;
	private String province;
	private String city;
	private String county;
	private String address;
	private String contact;
	private String mobile;
	private String tlevel;
	private String sequence;
	private String cycle;
	private String hvolume;
	private String mvolume;
	private String lvolume;
	private String status;
	private String sellchannel;
	private String mainchannel;
	private String minorchannel;
	private String areatype;
	private String sisconsistent;
	private String scondate;
	private String padisconsistent;
	private String padcondate;
	private String comid;
	private String remarks;
	private String orderbyno;
	private String deleteflag;
	private String version;
	private String credate;
	private String creuser;
	private String updatetime;
	private String updateuser;
	private String pvolume;
	public String getTerminalkey() {
		return terminalkey;
	}
	public void setTerminalkey(String terminalkey) {
		this.terminalkey = terminalkey;
	}
	public String getRoutekey() {
		return routekey;
	}
	public void setRoutekey(String routekey) {
		this.routekey = routekey;
	}
	public String getTerminalcode() {
		return terminalcode;
	}
	public void setTerminalcode(String terminalcode) {
		this.terminalcode = terminalcode;
	}
	public String getTerminalname() {
		return terminalname;
	}
	public void setTerminalname(String terminalname) {
		this.terminalname = terminalname;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTlevel() {
		return tlevel;
	}
	public void setTlevel(String tlevel) {
		this.tlevel = tlevel;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getHvolume() {
		return hvolume;
	}
	public void setHvolume(String hvolume) {
		this.hvolume = hvolume;
	}
	public String getMvolume() {
		return mvolume;
	}
	public void setMvolume(String mvolume) {
		this.mvolume = mvolume;
	}
	public String getLvolume() {
		return lvolume;
	}
	public void setLvolume(String lvolume) {
		this.lvolume = lvolume;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSellchannel() {
		return sellchannel;
	}
	public void setSellchannel(String sellchannel) {
		this.sellchannel = sellchannel;
	}
	public String getMainchannel() {
		return mainchannel;
	}
	public void setMainchannel(String mainchannel) {
		this.mainchannel = mainchannel;
	}
	public String getMinorchannel() {
		return minorchannel;
	}
	public void setMinorchannel(String minorchannel) {
		this.minorchannel = minorchannel;
	}
	public String getAreatype() {
		return areatype;
	}
	public void setAreatype(String areatype) {
		this.areatype = areatype;
	}
	public String getSisconsistent() {
		return sisconsistent;
	}
	public void setSisconsistent(String sisconsistent) {
		this.sisconsistent = sisconsistent;
	}
	public String getScondate() {
		return scondate;
	}
	public void setScondate(String scondate) {
		this.scondate = scondate;
	}
	public String getPadisconsistent() {
		return padisconsistent;
	}
	public void setPadisconsistent(String padisconsistent) {
		this.padisconsistent = padisconsistent;
	}
	public String getPadcondate() {
		return padcondate;
	}
	public void setPadcondate(String padcondate) {
		this.padcondate = padcondate;
	}
	public String getComid() {
		return comid;
	}
	public void setComid(String comid) {
		this.comid = comid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getOrderbyno() {
		return orderbyno;
	}
	public void setOrderbyno(String orderbyno) {
		this.orderbyno = orderbyno;
	}
	public String getDeleteflag() {
		return deleteflag;
	}
	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCredate() {
		return credate;
	}
	public void setCredate(String credate) {
		this.credate = credate;
	}
	public String getCreuser() {
		return creuser;
	}
	public void setCreuser(String creuser) {
		this.creuser = creuser;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}
	public String getPvolume() {
		return pvolume;
	}
	public void setPvolume(String pvolume) {
		this.pvolume = pvolume;
	}
	
	public static void main(String[] args) {
		long phTotal = 1;
		long selectterms = 32;
		double s = (double)phTotal/selectterms *100;
		System.out.println(roundDouble(s,2));
	}
	public static Double roundDouble(double val, int precision)  
	{  
	 Double ret = null;  
	 try  
	 {  
	  double factor = Math.pow(10, precision);  
	  ret = Math.floor(val * factor + 0.5) / factor;  
	 }  
	 catch (Exception e)  
	 {  
	  e.printStackTrace();  
	 }  
	 return ret;  
	} 
}
