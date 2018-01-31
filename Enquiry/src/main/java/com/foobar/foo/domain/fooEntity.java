package com.foobar.foo.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tableinfo")
public class fooEntity 
{
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="city_name")
	private String city_name;
	@Column(name="created_date")
	private Timestamp created_date;
	@Column(name="lead_sale_type")
	private String lead_sale_type;
	public fooEntity(Integer id, String city_name, Timestamp created_date, String lead_type_type) {
		super();
		this.id = id;
		this.city_name = city_name;
		this.created_date = created_date;
		this.lead_sale_type = lead_sale_type;
	}
	public fooEntity(String lead_sale_type) {
		super();
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
	public fooEntity() {
		// TODO Auto-generated constructor stub
	}
}
