package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "carimage")

public class CarImage {
	
	@Id
	@GeneratedValue
	@Column (name= "imageId")
	@Size(max= 11, min= 3, message = "{imageid.number=invalid}")
	private Long imageId;
	
	@OneToMany
	@JoinColumn (name= "carId")
	@Size(max= 11, min= 3, message = "{carid.number=invalid}")
	private Long carId;
	
	
	@Column (name= "carImage")
	private String carImage;


	public Long getImageId() {
		return imageId;
	}


	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}


	public Long getCarId() {
		return carId;
	}


	public void setCarId(Long carId) {
		this.carId = carId;
	}


	public String getCarImage() {
		return carImage;
	}


	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}
	
	

}
