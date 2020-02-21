package com.mentor.hibernate.dao;

public interface LoginServiceDao {

	 public void signUp(String username,String password,String role);
     public boolean signIn(String username,String password);

  
}
