package com.mentor.hibernate.service;


public interface LoginService {
	
	 public void signUp(String username,String password,String role);
     public boolean signIn(String username,String password);

}
