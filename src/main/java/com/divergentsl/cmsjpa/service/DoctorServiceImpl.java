package com.divergentsl.cmsjpa.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsjpa.dao.DoctorDao;
import com.divergentsl.cmsjpa.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorDao doctorDao;
	

	
	@Override
	@Transactional
	public void add(long did,String dname,String dspeciality, String dcontactnumber ,String dfees) {
		
		Doctor doctor = new Doctor();
		doctor.setDid(did);
		doctor.setDname(dname);
		doctor.setDspeciality(dspeciality);
		doctor.setDcontactnumber(dcontactnumber);
		doctor.setDfees(dfees);
		
		doctorDao.add(doctor);
				
		
	}

	@Override
	@Transactional
	public List<Doctor> list() {		
		return doctorDao.list();
	}

	@Override
	@Transactional
	public boolean remove(long id) {
		Doctor doctor = this.findById(id);
		if (doctor != null) {
			this.doctorDao.remove(doctor);
			return true;
		}
		return false;

				
	}

	@Override
	@Transactional
	public void update(Doctor doctor) {
		doctorDao.update(doctor);
		
	}

	
	@Override
	@Transactional(readOnly = true)
	public Doctor findById(Long id) {
		// TODO Auto-generated method stub
		return doctorDao.findById(id);
	}

	

	
	
	

}
