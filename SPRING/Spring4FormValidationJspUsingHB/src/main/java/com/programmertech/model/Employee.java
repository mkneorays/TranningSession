package com.programmertech.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	@NotBlank(message="{NotBlank.employee.firstName}")
	@Size(min = 2, max = 255,message="{Size.employee.firstName}")
	private String firstName;
	@NotBlank(message="{NotBlank.employee.lastName}")
	@Size(min = 2, max = 255,message="{Size.employee.lastName}")
	private String lastName;
	@NotNull
	@Pattern(regexp = "^[M|F]{1}$",message="{Invalid.employee.gender}")
	private String gender;
	@NotNull(message="{NotNull.employee.dob}")
	@Past(message="{Past.employee.dob}")
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date dob;
	@NotBlank
	@Email(message="{Email.employee.email}")
	private String email;
	@NotNull(message="{NotNull.employee.hireDate}")
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date hireDate;
	@NotNull(message="{NotNull.employee.salary}")
	@DecimalMin("3000.00")
	@DecimalMax("999999999.00")
	private Double salary;
	@Size(min=1)
	private List<String> skillSet;
	@NotNull
	@Valid
	private List<Address> addresses;
	@NotNull
	private Department department;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
