package com.mentor.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mentor.hibernate.model.Mentor;

@Component
@Repository ("mentorServiceDao")
public class MentorServiceDaoImpl implements MentorServiceDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Mentor createProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mentor viewMyProfile(List<Mentor> Mentor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mentor updateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mentor deactivateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void viewProposal() {
		// TODO Auto-generated method stub

	}

	public boolean acceptProposal() {
		// TODO Auto-generated method stub
		return false;
	}

}
