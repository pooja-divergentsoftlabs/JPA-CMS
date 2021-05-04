package com.divergentsl.cmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`patient`")
public class Patient {
	
	@Id
	private long id;
	
	@Column(name="`patient-name`")
	private String pname;
	
	@Column(name="`address`")
	private String address;
	
	@Column(name="`contact-number`")
	private String pcontactnumber;
	
	@Column(name="`age`")
	private String page;
	
	@Column(name="`weight`")
	private String pweight;

	public long getPid() {
		return id;
	}

	public void setPid(long pid) {
		this.id = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPcontactnumber() {
		return pcontactnumber;
	}

	public void setPcontactnumber(String pcontactnumber) {
		this.pcontactnumber = pcontactnumber;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPweight() {
		return pweight;
	}

	public void setPweight(String pweight) {
		this.pweight = pweight;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + id + ", pname=" + pname + ", address=" + address + ", pcontactnumber="
				+ pcontactnumber + ", page=" + page + ", pweight=" + pweight + "]";
	}
	
	

}
