package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "carmodel")

public class CarModel {
	@Id
	@GeneratedValue
	@Column(name = "modelId")
	private Long modelId;
	
	@Column(name = "ModelName")
	@Size(max = 499, min = 0, message="{model.name=invalid}")
	private String ModelName;
	
	@ManyToOne
	@JoinColumn(name = "carManufacturerId")
	private CarManufacturer carManufacturer;

	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public CarManufacturer getCarManufacturer() {
		return carManufacturer;
	}

	public void setCarManufacturer(CarManufacturer carManufacturer) {
		this.carManufacturer = carManufacturer;
	}
	
	

}
