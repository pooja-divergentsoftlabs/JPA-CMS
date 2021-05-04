package com.divergentsl.cmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`labtest`")
public class Labtest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="`test-name`")
	private String testName;
	
	@Column(name="`patient-id`")
	private String patientId;
	
	@Column(name="`test-fee`")
	private String testFee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getTestFee() {
		return testFee;
	}

	public void setTestFee(String testFee) {
		this.testFee = testFee;
	}

	@Override
	public String toString() {
		return "Labtest [id=" + id + ", testName=" + testName + ", patientId=" + patientId + ", testFee=" + testFee
				+ "]";
	}
	
	
	

}
