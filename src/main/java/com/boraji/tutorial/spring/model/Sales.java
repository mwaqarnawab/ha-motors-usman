package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name="sales")


public class Sales {
	
	@Id
	@GeneratedValue
	@Column (name="salesId")
	private Long salesId;
	
	@OneToMany
	@JoinColumn (name="userId")
	private String userID;
	
	@OneToOne
	@JoinColumn (name="carId")
	private String carId;
	
	   @Column(name = "soldPrice")
	   @Size(max = 499, min = 0, message = "{soldprice.number.invalid}")
	   private String soldPrice;
	   
	   @Column(name = "soldOn")
	   @Size(max = 499, min = 0, message = "{soldOn.number.invalid}")
	   private String soldOn;

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(String soldPrice) {
		this.soldPrice = soldPrice;
	}

	public String getSoldOn() {
		return soldOn;
	}

	public void setSoldOn(String soldOn) {
		this.soldOn = soldOn;
	}
	   
	
	
	
}
