package com.divergentsl.cmsjpa.service;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Labtest;

public interface LabtestService {
	
	void add(long id, String testName, String patientId,  String testFee); 

	List<Labtest> list();

	boolean remove(long id);

	void update(Labtest labtest);

	Labtest findById(Long id);


}
