package com.divergentsl.cmsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsjpa.dao.AppointmentDao;
import com.divergentsl.cmsjpa.entity.Appointment;


@Component
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;

	@Override
	@Transactional
	public void add(long id, String ptId, String ptName, String appdate) {
		Appointment appointment = new Appointment();
		appointment.setAid(id);
		appointment.setPid(ptId);
		appointment.setPname(ptName);
		appointment.setAppdate(appdate);
		
		
		appointmentDao.add(appointment);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Appointment> list() {
		
		return appointmentDao.list();
	}

	@Override
	@Transactional
	public boolean remove(long id) {
		Appointment appointment = this.findById(id);
		if (appointment != null) {
			this.appointmentDao.remove(appointment);
			return true;
		}
		return false;

	}

	@Override
	@Transactional
	public void update(Appointment appointment) {
		appointmentDao.update(appointment);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Appointment findById(Long id) {
		
		return appointmentDao.findById(id);
	}

}
