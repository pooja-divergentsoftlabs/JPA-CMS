package com.divergentsl.cmsjpa.service;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Doctor;

public interface DoctorService {

	void add(long did, String dname, String dspeciality, String dcontactnumber, String dfees); 

	List<Doctor> list();

	boolean remove(long id);

	void update(Doctor doctor);


	Doctor findById(Long id);

	

}
