package com.divergentsl.cmsjpa.dao;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Labtest;

public interface LabtestDao {
	
	void add(Labtest labtest);
	
	List<Labtest> list();
	
	void remove(Labtest labtest);
	
	void update(Labtest labtest);
	
	Labtest findById(Long id);

}
