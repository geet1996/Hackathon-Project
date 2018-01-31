package com.foobar.foo.repo;

public class Display 
{
	public int time;
	Long Count;
	String City;
	String Lead_Sale_Type;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Long getCount() {
		return Count;
	}
	public void setCount(Long count) {
		Count = count;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getLead_Sale_Type() {
		return Lead_Sale_Type;
	}
	public void setLead_Sale_Type(String lead_Sale_Type) {
		Lead_Sale_Type = lead_Sale_Type;
	}
	public Display(int time, Long count, String city, String lead_Sale_Type) {
		super();
		this.time = time;
		Count = count;
		City = city;
		Lead_Sale_Type = lead_Sale_Type;
	}
	public Display() {
		// TODO Auto-generated constructor stub
	}
}
