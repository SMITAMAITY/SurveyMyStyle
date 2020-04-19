package com.lti.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="form_details")
public class FormDetails {


	@Id
	private int formId;


	private Date createdDate;


	private Time createdTime;

	private String formDescription;


	private String isActive;


	private Date updatedDate;


	private Time updatedTime;

	//bi-directional many-to-one association to UserFeedbackDetail
//	@OneToMany(mappedBy="formDetail")
//	private List<UserFeedbackDetail> userFeedbackDetails;

	@OneToMany(targetEntity=UserFeedbackDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="form_id",referencedColumnName="formId")
	private List<UserFeedbackDetails> userFeedbackDetails;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
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

	public String getFormDescription() {
		return formDescription;
	}

	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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

	public List<UserFeedbackDetails> getUserFeedbackDetails() {
		return userFeedbackDetails;
	}

	public void setUserFeedbackDetails(List<UserFeedbackDetails> userFeedbackDetails) {
		this.userFeedbackDetails = userFeedbackDetails;
	}

	public FormDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormDetails(int formId, Date createdDate, Time createdTime, String formDescription, String isActive,
			Date updatedDate, Time updatedTime, List<UserFeedbackDetails> userFeedbackDetails) {
		super();
		this.formId = formId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.formDescription = formDescription;
		this.isActive = isActive;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.userFeedbackDetails = userFeedbackDetails;
	}

	@Override
	public String toString() {
		return "FormDetails [formId=" + formId + ", createdDate=" + createdDate + ", createdTime=" + createdTime
				+ ", formDescription=" + formDescription + ", isActive=" + isActive + ", updatedDate=" + updatedDate
				+ ", updatedTime=" + updatedTime + ", userFeedbackDetails=" + userFeedbackDetails + "]";
	}

	
	
}