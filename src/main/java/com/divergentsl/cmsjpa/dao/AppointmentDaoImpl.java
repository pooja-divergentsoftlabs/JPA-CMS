package com.divergentsl.cmsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergentsl.cmsjpa.entity.Appointment;


@Repository
public class AppointmentDaoImpl implements AppointmentDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Appointment appointment) {
		em.persist(appointment);
		
	}

	@Override
	public List<Appointment> list() {
		CriteriaQuery<Appointment> criteriaQuery = em.getCriteriaBuilder().createQuery(Appointment.class);
		@SuppressWarnings("unused")
		Root<Appointment> root = criteriaQuery.from(Appointment.class);
		return em.createQuery(criteriaQuery).getResultList();
		
		
	}

	@Override
	public void remove(Appointment appointment) {
		em.remove(appointment);
		
	}

	@Override
	public void update(Appointment appointment) {
		em.persist(appointment);
		
	}

	@Override
	public Appointment findById(Long id) {
		
		return em.find(Appointment.class, id);
	}

}
