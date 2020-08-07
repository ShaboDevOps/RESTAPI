package com.KayaTech.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {

	@Id
	private Long rolNo;
	private String names;
	private String postion;
	private int age;
	private Double slary;
	private String sex;
	private Boolean marriage;
	
	
	public Employee() {
		super();
	}
	public Employee(Long rolNo, String names, String postion, int age, Double slary, String sex, Boolean marriage) {
		super();
		this.rolNo = rolNo;
		this.names = names;
		this.postion = postion;
		this.age = age;
		this.slary = slary;
		this.sex = sex;
		this.marriage = marriage;
	}
	public Long getRolNo() {
		return rolNo;
	}
	public void setRolNo(Long rolNo) {
		this.rolNo = rolNo;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSlary() {
		return slary;
	}
	public void setSlary(Double slary) {
		this.slary = slary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Boolean getMarriage() {
		return marriage;
	}
	public void setMarriage(Boolean marriage) {
		this.marriage = marriage;
	}
	
	
	
}
