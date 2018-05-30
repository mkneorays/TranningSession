package com.programmertech.model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int addressId;
	@NotBlank(message = "{NotBlank.address.addressLine}")
	@Size(max = 1024,message="{Size.address.addressLine}")
	private String addressLine;
	@NotBlank(message="{NotBlank.address.city}")
	@Size(max = 255,message="{Size.address.city}")
	private String city;
	@NotBlank(message="{NotBlank.address.zip}")
	@Size(max = 9,message="{Size.address.zip}")
	private String zip;
	@NotBlank(message="{NotBlank.address.state}")
	@Size(max = 255,message="{Size.address.state}")
	private String state;
	@NotBlank(message="{NotBlank.address.country}")
	@Size(max = 255,message="{Size.address.country}")
	private String country;
	private String addressType;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
