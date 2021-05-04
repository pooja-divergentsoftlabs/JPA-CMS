package com.divergentsl.cmsjpa.dao;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Drug;

public interface DrugDao {
	
	void add(Drug drug);
	
	List<Drug> list();
	
	void remove(Drug drug);
	
	void update (Drug drug);
	
	Drug findById(Long id);

}
