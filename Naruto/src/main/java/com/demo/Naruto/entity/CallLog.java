package com.demo.Naruto.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "callsinfo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class CallLog 
{
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="status")
	private String callStatus;
	@Column(name="duration")
	private Time callDuration;
	@Column(name="createdat")
	private Date createdAt;
	public Time getCallDuration() {
		return callDuration;
	}


	public void setCallDuration(Time callDuration) {
		this.callDuration = callDuration;
	}


	

	public CallLog() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCallStatus() {
		return callStatus;
	}


	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}



	public java.util.Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}
}
