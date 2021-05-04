package com.divergentsl.cmsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsjpa.dao.PatientDao;

import com.divergentsl.cmsjpa.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDao patientDao;

	@Override
	@Transactional
	public void add(long pid, String pname, String address, String pcontactnumber, String age,String weight) {
		Patient patient = new Patient();
		patient.setPid(pid);
		patient.setPname(pname);
		patient.setAddress(address);
		patient.setPcontactnumber(pcontactnumber);
		patient.setPage(age);
		patient.setPweight(weight);
		
		patientDao.add(patient);
		
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patientDao.list();
	}

	@Override
	@Transactional
	public boolean remove(long id) {
		Patient patient = this.findById(id);
		if (patient != null) {
			this.patientDao.remove(patient);
			return true;
		}
		return false;

		
	}

	@Override
	@Transactional
	public void update(Patient patient) {
		patientDao.update(patient);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Patient findById(Long id) {
		// TODO Auto-generated method stub
		return patientDao.findById(id);
	}
	
	

}
