package com.mentor.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mentor.hibernate.dao.MentorServiceDao;
import com.mentor.hibernate.model.Mentor;

@Component
@Service ("mentorService")
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	MentorServiceDao mentorServiceDao;
	@Transactional

	public Mentor createProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Mentor viewMyProfile(List<Mentor> Mentor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Mentor updateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Mentor deactivateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void viewProposal() {
		// TODO Auto-generated method stub

	}

	@Transactional
	public boolean acceptProposal() {
		// TODO Auto-generated method stub
		return false;
	}

}
