package com.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Guest {
	@Id
	@GeneratedValue
	@Column(name="guest_id")
	private long guestId;
	@Column(name="guest_first_name")
	private String guestFirstName;
	@Column(name="guest_last_name")
	private String guestLastName;
	@Column(name="guest_email_id")
	private String guestEmailId;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="city_of_guest")
	private String cityOfGuest;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	
	
	
	
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Guest(long guestId, String guestFirstName, String guestLastName, String guestrEmailId, Date dateOfBirth,
			String cityOfGuest, Date startDate, Date endDate) {
		super();
		this.guestId = guestId;
		this.guestFirstName = guestFirstName;
		this.guestLastName = guestLastName;
		this.guestEmailId = guestrEmailId;
		this.dateOfBirth = dateOfBirth;
		this.cityOfGuest = cityOfGuest;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public long getGuestId() {
		return guestId;
	}


	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}


	public String getGuestFirstName() {
		return guestFirstName;
	}


	public void setGuestFirstName(String guestFirstName) {
		this.guestFirstName = guestFirstName;
	}


	public String getGuestLastName() {
		return guestLastName;
	}


	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}


	public String getGuestrEmailId() {
		return guestEmailId;
	}


	public void setGuestrEmailId(String guestrEmailId) {
		this.guestEmailId = guestrEmailId;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getCityOfGuest() {
		return cityOfGuest;
	}


	public void setCityOfGuest(String cityOfGuest) {
		this.cityOfGuest = cityOfGuest;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	

}
