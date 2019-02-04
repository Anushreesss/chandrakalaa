package com.mccoy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private String rollnum;
	private String name;
	private String phonenum;
	
	public Student()
	{
		
	}
	
	public Student(String rollnum,String name,String phonenum)
	{
		this.rollnum=rollnum;
		this.name=name;
		this.phonenum=phonenum;
	}

	public String getRollnum() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
	
}
