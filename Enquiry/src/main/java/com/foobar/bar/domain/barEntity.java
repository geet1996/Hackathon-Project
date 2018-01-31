package com.foobar.bar.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENQUIRY")
public class barEntity 
{
	@Id
	@Column(name="ID")
	private Integer id;
	public barEntity(Integer id, String city_name, Timestamp created_date, String lead_sale_type) {
		super();
		this.id = id;
		this.city_name = city_name;
		this.created_date = created_date;
		this.lead_sale_type = lead_sale_type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public String getLead_sale_type() {
		return lead_sale_type;
	}
	public void setLead_sale_type(String lead_sale_type) {
		this.lead_sale_type = lead_sale_type;
	}
	@Column(name="CITY_NAME")
	private String city_name;
	@Column(name="CREATED_DATE")
	private Timestamp created_date;
	@Column(name="LEAD_SALE_TYPE")
	private String lead_sale_type;
	
	public barEntity() {
		// TODO Auto-generated constructor stub
	}

}
