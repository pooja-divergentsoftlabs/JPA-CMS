package com.divergentsl.cmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`appointment`")
public class Appointment {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="`patient-id`")
	private String ptId;
	
	@Column(name="patient-name")
	private String ptName;
	
	@Column(name="appointment-date")
	private String appdate;

	public long getAid() {
		return id;
	}

	public void setAid(long aid) {
		this.id = aid;
	}

	public String getPid() {
		return ptId;
	}

	public void setPid(String pid) {
		this.ptId = pid;
	}

	public String getPname() {
		return ptName;
	}

	public void setPname(String pname) {
		this.ptName = pname;
	}

	public String getAppdate() {
		return appdate;
	}

	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}

	@Override
	public String toString() {
		return "Appointment [aid=" + id + ", pid=" + ptId + ", pname=" + ptName + ", appdate=" + appdate + "]";
	}
	
	

}
