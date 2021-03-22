package com.testpackage;

public class User {

	private String username;

	private String pwd;

	private boolean maritalstatus;

	private String[] qualification;

	private String gender;

	private String location;

	private String skillset;

	private String[] hobbies;

	private String profession;

	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setMaritalstatus(boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public boolean getMaritalstatus() {
		return maritalstatus;
	}

	public String[] getQualification() {
		return qualification;
	}

	public void setQualification(String[] qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
