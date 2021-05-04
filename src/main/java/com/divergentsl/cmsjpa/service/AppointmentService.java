package com.divergentsl.cmsjpa.service;

import java.util.List;

import com.divergentsl.cmsjpa.entity.Appointment;

public interface AppointmentService {
	
	void add(long id, String ptId, String ptName,  String appdate); 

	List<Appointment> list();

	boolean remove(long id);

	void update(Appointment appointment);

	Appointment findById(Long id);


}
