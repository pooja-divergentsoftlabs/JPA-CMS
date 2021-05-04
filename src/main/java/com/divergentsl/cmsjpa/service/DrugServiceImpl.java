package com.divergentsl.cmsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsjpa.dao.DrugDao;

import com.divergentsl.cmsjpa.entity.Drug;



@Service
public class DrugServiceImpl implements DrugService {
	
	@Autowired
	DrugDao drugDao;

	@Override
	@Transactional
	public void add(long drugid, String drugname, String description, String quantity, String price) {
		Drug drug = new Drug();
		drug.setDrugid(drugid);
		drug.setDrugname(drugname);
		drug.setDescription(description);
		drug.setQuantity(quantity);
		drug.setQuantity(quantity);
		
		drugDao.add(drug);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Drug> list() {
		
		return drugDao.list();
	}

	@Override
	@Transactional
	public boolean remove(long id) {
		Drug drug = this.findById(id);
		if (drug != null) {
			this.drugDao.remove(drug);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void update(Drug drug) {
		drugDao.update(drug);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Drug findById(Long id) {
	
		return drugDao.findById(id);
	}

}
