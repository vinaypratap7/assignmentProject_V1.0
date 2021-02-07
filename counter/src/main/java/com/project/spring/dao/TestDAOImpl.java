package com.project.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.spring.model.Count;

@Repository
public class TestDAOImpl implements TestDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public Count getOldObject() {
		List<Count> list = list();
		Session session = sessionFactory.getCurrentSession();
		Count oldtest = session.get(Count.class,list.get(0).getId());
		return oldtest;
	}
	
	
	   public List<Count> list() {
	      Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Count> cq = cb.createQuery(Count.class);
	      Root<Count> root = cq.from(Count.class);
	      cq.select(root);
	      Query<Count> query = session.createQuery(cq);
	      return query.getResultList();
	   }
	
	@Override
	public void update() {
		
		Count oldtest = getOldObject();
		int id1=incrementId(oldtest);
		oldtest.setId(id1);
		
	}
	public int incrementId(Count count) {
		int id=count.getId();
		id++;
		return id;
	}

}
