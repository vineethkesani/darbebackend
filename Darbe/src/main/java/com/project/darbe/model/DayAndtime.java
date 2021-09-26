package com.project.darbe.model;

public class DayAndtime {
	
	private String day;
	private String starttime;
	private String endtime;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	@Override
	public String toString() {
		return "DayAndTime [day=" + day + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	
	
	

}
