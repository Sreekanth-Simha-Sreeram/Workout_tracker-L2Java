package com.mentor.hibernate.service;

import java.util.List;


import com.mentor.hibernate.model.Mentor;

public interface MentorService {
	Mentor createProfile(int mentorId);
	Mentor viewMyProfile(List <Mentor> Mentor);
	Mentor updateProfile(int mentorId);
	Mentor deactivateProfile(int mentorId);
	public void viewProposal();
    boolean acceptProposal();

}
