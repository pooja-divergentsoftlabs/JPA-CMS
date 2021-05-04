package com.divergentsl.cmsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsjpa.dao.LabtestDao;
import com.divergentsl.cmsjpa.entity.Labtest;

@Service
public class LabtestServiceImpl implements LabtestService {
	
	@Autowired
	LabtestDao labtestDao;

	@Override
	@Transactional
	public void add(long id, String testName, String patientId, String testFee) {
		Labtest labtest = new Labtest();
		labtest.setId(id);
		labtest.setTestName(testName);
		labtest.setPatientId(patientId);
		labtest.setTestFee(testFee);
		
		
		labtestDao.add(labtest);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Labtest> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean remove(long id) {
		Labtest labtest = this.findById(id);
		if (labtest != null) {
			this.labtestDao.remove(labtest);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void update(Labtest labtest) {
		labtestDao.update(labtest);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Labtest findById(Long id) {
		
		return labtestDao.findById(id);
	}

}
