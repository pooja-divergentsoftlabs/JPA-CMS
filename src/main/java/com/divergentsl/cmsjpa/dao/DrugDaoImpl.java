package com.divergentsl.cmsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergentsl.cmsjpa.entity.Drug;


@Repository
public class DrugDaoImpl implements DrugDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Drug drug) {
		em.persist(drug);
		
	}

	@Override
	public List<Drug> list() {
		CriteriaQuery<Drug> criteriaQuery = em.getCriteriaBuilder().createQuery(Drug.class);
		@SuppressWarnings("unused")
		Root<Drug> root = criteriaQuery.from(Drug.class);
		return em.createQuery(criteriaQuery).getResultList();
		
		
	}

	@Override
	public void remove(Drug drug) {
		em.remove(drug);
		
	}

	@Override
	public void update(Drug drug) {
		em.persist(drug);
		
	}

	@Override
	public Drug findById(Long id) {
		
		return em.find(Drug.class, id);
	}

}
