package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name= "customer")



public class Customer {

	
	@Id
	@GeneratedValue
	@Column (name="customerId")
	private Long customerId;
	
	
	@Column (name="customerName")
	@Size(max=499, min=3, message="{customername.name=invalid}")
	private String customerName;
	
	@Column(name="location")
	@Size (max= 499, min=3, message="{location.name=invalid}")
	private String location;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
