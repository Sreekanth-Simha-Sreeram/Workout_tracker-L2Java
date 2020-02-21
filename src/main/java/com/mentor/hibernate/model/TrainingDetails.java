package com.mentor.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrainingDetails")
public class TrainingDetails {
	
	
	@Id
	@Column(name="trainingDetailsId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int trainingDetailsId;
	
	@Column(name="status")
	String status;
	
	@Column(name="progress")
	int progress;
	
	@Column(name="fees")
	float fees;
	
	@Column(name="commissionAmount")
	float commissionAmount;
	
	@Column(name="rating")
	int rating;
	
	@Column(name="startDate")
	String startDate;
	
	@Column(name="endDate")
	String endDate;
	
	@Column(name="startTime")
	String startTime;
	
	@Column(name="endTime")
	String endTime;
	
	@Column(name="amountReceived")
	float amountReceived;
	
	@Column(name="userId")
	int userId;
	
	@Column(name="mentorId")
	int mentorId;
	
	@Column(name="skillId")
	int skillId;

	public int getId() {
		return trainingDetailsId;
	}

	public void setId(int id) {
		this.trainingDetailsId = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	
	
	
	
	

}
