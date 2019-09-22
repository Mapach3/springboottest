package com.dogui.springboottest.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="degree")

public class Degree {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="institution")
	private String institution;
	
	@Column(name="year")
	private int year;

	@Column(name="createdat")
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDate updatedAt;
	
	
	public Degree() {
	} // empty constructor


	public Degree(int id, String name, String institution, int year) {
		this.id=id;
		this.name = name;
		this.institution = institution;
		this.year = year;
	}


	public int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInstitution() {
		return institution;
	}


	public void setInstitution(String institution) {
		this.institution = institution;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public LocalDate getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDate getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	



}
