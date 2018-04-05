package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name="carfeatures")

public class CarFeatures {

	@Id
	@GeneratedValue
	@Column (name = "featuresId")
	@Size(max = 11, min = 3, message = "{featureId.number=invalid}")
	private Long featuresId;
	
	
	@Column (name = "isAutomatic" )
	private boolean isAutomatic;
	
	@Column (name = "isSunRoof" )
	private boolean isSunRoof;
	
	@Column (name = "isHatchBack" )
	private boolean isHatchBack;
	
	@Column (name = "isPowerMirror" )
	private boolean isPowerMirror;
	
	@Column (name = "isPowerWindow" )
	private boolean isPowerWindow;
	
	@Column (name = "isPowerSteering" )
	private boolean isPowerSteering;
	
	@Column (name = "isABS" )
	private boolean isABS;
	
	@Column (name = "noOfAirBags")
	@Size(max = 11, min = 3, message = "{noOfAirbags.number=invalid}")
	private Long noOfAirBags;
	
	@Column (name = "noOfSeats")
	@Size(max = 11, min = 3, message = "{noOfseats.number=invalid}")
	private Long noOfSeats;
	
	@Column (name = "isBackCamera" )
	private boolean isBackCamera;

	public Long getFeaturesId() {
		return featuresId;
	}

	public void setFeaturesId(Long featuresId) {
		this.featuresId = featuresId;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public boolean isSunRoof() {
		return isSunRoof;
	}

	public void setSunRoof(boolean isSunRoof) {
		this.isSunRoof = isSunRoof;
	}

	public boolean isHatchBack() {
		return isHatchBack;
	}

	public void setHatchBack(boolean isHatchBack) {
		this.isHatchBack = isHatchBack;
	}

	public boolean isPowerMirror() {
		return isPowerMirror;
	}

	public void setPowerMirror(boolean isPowerMirror) {
		this.isPowerMirror = isPowerMirror;
	}

	public boolean isPowerWindow() {
		return isPowerWindow;
	}

	public void setPowerWindow(boolean isPowerWindow) {
		this.isPowerWindow = isPowerWindow;
	}

	public boolean isPowerSteering() {
		return isPowerSteering;
	}

	public void setPowerSteering(boolean isPowerSteering) {
		this.isPowerSteering = isPowerSteering;
	}

	public boolean isABS() {
		return isABS;
	}

	public void setABS(boolean isABS) {
		this.isABS = isABS;
	}

	public Long getNoOfAirBags() {
		return noOfAirBags;
	}

	public void setNoOfAirBags(Long noOfAirBags) {
		this.noOfAirBags = noOfAirBags;
	}

	public Long getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Long noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isBackCamera() {
		return isBackCamera;
	}

	public void setBackCamera(boolean isBackCamera) {
		this.isBackCamera = isBackCamera;
	}
	
}
