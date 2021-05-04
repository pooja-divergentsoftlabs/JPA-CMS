package com.divergentsl.cmsjpa.service;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Drug;

public interface DrugService {
	
	void add(long drugid, String drugname, String description, String quantity, String price); 

	List<Drug> list();

	boolean remove(long id);

	void update(Drug drug);


	Drug findById(Long id);

	

}
