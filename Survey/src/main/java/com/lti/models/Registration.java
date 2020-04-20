package com.lti.models;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String companyName;

	private String countryRegion;

	private Date createdDate;

	private Time createdTime;

	private String email;

	private String fullName;

	private String isActive;

	private String jobRole;

	private int totalUserOrg;

	private Date updatedDate;

	private Time updatedTime;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Time getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Time createdTime) {
		this.createdTime = createdTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public int getTotalUserOrg() {
		return totalUserOrg;
	}

	public void setTotalUserOrg(int totalUserOrg) {
		this.totalUserOrg = totalUserOrg;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Time getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Time updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Registration [userId=" + userId + ", companyName=" + companyName + ", countryRegion=" + countryRegion
				+ ", createdDate=" + createdDate + ", createdTime=" + createdTime + ", email=" + email + ", fullName="
				+ fullName + ", isActive=" + isActive + ", jobRole=" + jobRole + ", totalUserOrg=" + totalUserOrg
				+ ", updatedDate=" + updatedDate + ", updatedTime=" + updatedTime + "]";
	}

	public Registration(int userId, String companyName, String countryRegion, Date createdDate, Time createdTime,
			String email, String fullName, String isActive, String jobRole, int totalUserOrg, Date updatedDate,
			Time updatedTime) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.countryRegion = countryRegion;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.email = email;
		this.fullName = fullName;
		this.isActive = isActive;
		this.jobRole = jobRole;
		this.totalUserOrg = totalUserOrg;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
	}

//	
//	@OneToMany(targetEntity=UserFeedbackDetails.class, cascade=CascadeType.ALL)
//	@JoinColumn(name="user_id",referencedColumnName="userId")
//	private List<UserFeedbackDetails> userFeedbackDetails;

	


	
	
	
}
