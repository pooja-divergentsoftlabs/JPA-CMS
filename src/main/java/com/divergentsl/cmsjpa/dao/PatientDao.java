package com.divergentsl.cmsjpa.dao;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Patient;

public interface PatientDao {
	
	void add(Patient patient);
	
	List<Patient> list();
	
	void remove(Patient patient);
	
	void update(Patient patient);
	
	Patient findById(Long id);
	

}
