package com.mentor.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository ("loginServiceDao")
public class LoginServiceDaoImpl implements LoginServiceDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void signUp(String username, String password, String role) {
		// TODO Auto-generated method stub
		
	}

	public boolean signIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
