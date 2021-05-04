package com.divergentsl.cmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`doctor`")
public class Doctor {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="`doctor-name`")
	private String dname;
	
	@Column(name="`speciality`")
	private String dspeciality;
	
	@Column(name="`contact-number`")
	private String dcontactnumber;
	
	@Column(name="`fees`")
	private String dfees;

	public long getDid() {
		return id;
	}

	public void setDid(long did) {
		this.id = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDspeciality() {
		return dspeciality;
	}

	public void setDspeciality(String dspeciality) {
		this.dspeciality = dspeciality;
	}

	public String getDcontactnumber() {
		return dcontactnumber;
	}

	public void setDcontactnumber(String dcontactnumber) {
		this.dcontactnumber = dcontactnumber;
	}

	public String getDfees() {
		return dfees;
	}

	public void setDfees(String dfees) {
		this.dfees = dfees;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + id + ", dname=" + dname + ", dspeciality=" + dspeciality + ", dcontactnumber="
				+ dcontactnumber + ", dfees=" + dfees + "]";
	}
	
	
	
	

}
