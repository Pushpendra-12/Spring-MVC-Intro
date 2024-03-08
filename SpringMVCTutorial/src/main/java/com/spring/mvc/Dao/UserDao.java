package com.spring.mvc.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UserDao {
	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
	
	@Autowired
    private EntityManager entityManager;
	
	 @Transactional
	public int saveUser(User user) {
//		int res = (Integer)this.hibernateTemplate.save(user);
//		return res;
		entityManager.persist(user);
		return user.getId();
	}

}