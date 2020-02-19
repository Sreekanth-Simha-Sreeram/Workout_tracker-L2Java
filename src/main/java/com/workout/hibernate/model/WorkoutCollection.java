package com.workout.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WorkoutCollection")
public class WorkoutCollection {
	
	@Column(name="workoutTitle")
	String workoutTitle;
	
	@Column(name="workoutNote")
	String workoutNote;
	
	@Column(name="caloriesBurntPerMinute")
	float caloriesBurntPerMinute;
	
	@Id
	@Column(name="categoryId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int categoryId;
	
	@Id
	@Column(name="workoutId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int workoutId;
	
	public String getWorkoutTitle() {
		return workoutTitle;
	}
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}
	public String getWorkoutNote() {
		return workoutNote;
	}
	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}
	public float getCaloriesBurntPerMinute() {
		return caloriesBurntPerMinute;
	}
	public void setCaloriesBurntPerMinute(float caloriesBurntPerMinute) {
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}
	
}
