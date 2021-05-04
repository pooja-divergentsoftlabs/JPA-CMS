package com.divergentsl.cmsjpa.service;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Patient;

public interface PatientService {
	
	void add(long pid, String dname, String address, String pcontactnumber, String age,String weight); 

	List<Patient> list();

	boolean remove(long id);

	void update(Patient patient);

	Patient findById(Long id);


}
