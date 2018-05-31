package com.neorays.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


public class PolicyHolder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@NotNull
	@Size(min=2,max=255)
	private String firstName;
	@NotNull
	@Size(min=2,max=255)
	private String lastName;
	@NotNull
	@Past(message="{Past.policyHolder.dob}")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dob;
	@NotNull
	@Pattern(regexp = "^[M|F]{1}$",message="{Invalid.policyHolder.gender}")
	private String gender;
	private Long mobile;
	@NotNull
	@Valid
	private PolicyInfo policyInfo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public PolicyInfo getPolicyInfo() {
		return policyInfo;
	}

	public void setPolicyInfo(PolicyInfo policyInfo) {
		this.policyInfo = policyInfo;
	}
	
}
