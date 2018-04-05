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
	
}
