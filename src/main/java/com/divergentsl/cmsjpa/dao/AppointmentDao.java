package com.divergentsl.cmsjpa.dao;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Appointment;

public interface AppointmentDao {
	
	void add(Appointment appointment);
	
	List<Appointment> list();
	
	void remove(Appointment appointment);
	
	void update(Appointment appointment);
	
	Appointment findById(Long id);
	
	

}
