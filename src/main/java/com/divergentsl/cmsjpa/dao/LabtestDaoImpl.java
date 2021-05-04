package com.divergentsl.cmsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergentsl.cmsjpa.entity.Labtest;


@Repository
public class LabtestDaoImpl implements LabtestDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void add(Labtest labtest) {
		em.persist(labtest);
		
	}

	@Override
	public List<Labtest> list() {
		CriteriaQuery<Labtest> criteriaQuery = em.getCriteriaBuilder().createQuery(Labtest.class);
		@SuppressWarnings("unused")
		Root<Labtest> root = criteriaQuery.from(Labtest.class);
		return em.createQuery(criteriaQuery).getResultList();
		
		
	}

	@Override
	public void remove(Labtest labtest) {
		em.remove(labtest);
		
	}

	@Override
	public void update(Labtest labtest) {
		em.persist(labtest);
		
	}

	@Override
	public Labtest findById(Long id) {
		
		return em.find(Labtest.class, id);
	}

}
