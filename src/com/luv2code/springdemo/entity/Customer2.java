package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="customer2")
public class Customer2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;
	
	@Column(name="date_time")
	private String dateTime;
	
	@Column(name="asset_type")
	private String assetType;
	
	@Column(name="type")
	private String type;
	

	@Column(name="quantity")
	private String quantity;

	
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="period")
	private String period;
	
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getDateTime() {
		return dateTime;
	}



	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}



	public String getAssetType() {
		return assetType;
	}



	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getQuantity() {
		return quantity;
	}



	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getPeriod() {
		return period;
	}



	public void setPeriod(String period) {
		this.period = period;
	}



	public Customer2() {
		
	}

	
	
	@Override
	public String toString() {
		return "Customer2 [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", dateTime=" + dateTime
				+ ", assetType=" + assetType + ", type=" + type + ", quantity=" + quantity + ", grade=" + grade
				+ ", period=" + period + "]";
	}
	
	

	}

	
		







	

