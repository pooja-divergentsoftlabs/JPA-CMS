package com.divergentsl.cmsjpa.dao;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Doctor;

public interface DoctorDao {
	
	void add(Doctor doctor);
	
	List<Doctor> list();
	
	void remove(Doctor doctor);
	
	void update(Doctor doctor);
	
	Doctor findById(Long id);

}
