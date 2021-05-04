package com.divergentsl.cmsjpa.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergentsl.cmsjpa.entity.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Patient patient) {
		em.persist(patient);
		
	}

	@Override
	public List<Patient> list() {
		CriteriaQuery<Patient> criteriaQuery = em.getCriteriaBuilder().createQuery(Patient.class);
		@SuppressWarnings("unused")
		Root<Patient> root = criteriaQuery.from(Patient.class);
		return em.createQuery(criteriaQuery).getResultList();
		
		
	}

	@Override
	public void remove(Patient patient) {
		em.remove(patient);
		
	}

	@Override
	public void update(Patient patient) {
		em.persist(patient);
		
	}

	@Override
	public Patient findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Patient.class, id);
	}

}
