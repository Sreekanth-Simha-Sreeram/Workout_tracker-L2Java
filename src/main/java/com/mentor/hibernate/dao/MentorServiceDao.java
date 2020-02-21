package com.mentor.hibernate.dao;

import java.util.List;

import com.mentor.hibernate.model.Mentor;

public interface MentorServiceDao {
	
	Mentor createProfile(int mentorId);
	Mentor viewMyProfile(List <Mentor> Mentor);
	Mentor updateProfile(int mentorId);
	Mentor deactivateProfile(int mentorId);
	public void viewProposal();
    boolean acceptProposal();


}
