package com.demo.Naruto.entity;

public class ApiDisplay 
{
	int duration;
	Long totalCount;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public ApiDisplay(int duration, Long totalCount) {
		super();
		this.duration = duration;
		this.totalCount = totalCount;
	}
	
	public ApiDisplay() {
		// TODO Auto-generated constructor stub
	}

}
