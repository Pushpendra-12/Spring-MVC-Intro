package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Dao.UserDao;
import com.spring.mvc.model.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		
		return this.userDao.saveUser(user);
	}

}
