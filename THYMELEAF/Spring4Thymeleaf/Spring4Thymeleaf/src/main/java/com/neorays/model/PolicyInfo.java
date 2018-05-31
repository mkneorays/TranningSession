package com.neorays.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class PolicyInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@NotNull
	private String policyType;
	@NotNull
	private Double sumAssured;
	@NotNull
	private Integer policyTerm;
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(Double sumAssured) {
		this.sumAssured = sumAssured;
	}
	public Integer getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(Integer policyTerm) {
		this.policyTerm = policyTerm;
	}

	
}
