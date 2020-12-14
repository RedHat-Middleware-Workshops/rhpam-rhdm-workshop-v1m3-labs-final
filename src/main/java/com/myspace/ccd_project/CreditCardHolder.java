package com.myspace.ccd_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditCardHolder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;

	@org.kie.api.definition.type.Label(value = "StateCode")
	private java.lang.String state;

	public CreditCardHolder() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public CreditCardHolder(java.lang.Integer age, java.lang.String status,
			java.lang.String state) {
		this.age = age;
		this.status = status;
		this.state = state;
	}

}