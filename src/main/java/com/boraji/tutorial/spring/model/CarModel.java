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
@Table(name = "carmodel")

public class CarModel {
	@Id
	@GeneratedValue
	@Column(name = "modelId")
	private Long modelId;
	
	@Column(name = "ModelName")
	@Size(max = 499, min = 0, message="{model.name=invalid}")
	private String ModelName;
	
	@OneToMany
	@JoinColumn(name = "carManufacturerId")
	private Long carManufacturerId;

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

	public Long getCarManufacturerId() {
		return carManufacturerId;
	}

	public void setCarManufacturerId(Long carManufacturerId) {
		this.carManufacturerId = carManufacturerId;
	}
	
	

}
