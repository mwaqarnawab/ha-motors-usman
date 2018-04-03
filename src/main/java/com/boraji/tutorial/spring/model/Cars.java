package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "cars")
public class Cars {
	
	@Id
	@GeneratedValue
	@Column (name="carId")
	private Long carId;
	
	@OneToMany
	@JoinColumn (name="modelId")
	private Long modelId;
	
	@Column (name="engineNo")
	@Size (max = 499 , min = 3, message="{engine.number=invalid}")
	private Long engineNo;
	
	@Column (name="chassisNo")
	@Size (max = 499 , min = 3, message="{chassis.number=invalid}")
	private Long chassisNo;
	
	@Column (name="color")
	@Size (max = 499 , min = 3, message="{color.name=invalid}")
	private String color;
	
	@Column (name="ImportYear")
	@Size (max = 499 , min = 3, message="{Importyear.name=invalid}")
	private String ImportYear;
	
	@Column (name="RegisteredYear")
	@Size (max = 499 , min = 3, message="{Registerdyear.name=invalid}")
	private String RegisteredYear;
	
	@Column (name="isRegistered")
	private boolean isRegistered;
	
	@Column (name="demand")
	@Size (max = 499 , min = 3, message="{demand.number=invalid}")
	private Long demand;
	
	@ManyToOne
	@JoinColumn (name="featureId")
	private Long featureId;
	
	@Column (name="isSold")
	private boolean isSold;
	
	@Column (name="addedBy")
	@Size (max = 499 , min = 3, message="{addedby.name=invalid}")
	private String addedBy;
	
	@Column (name="carTitle")
	@Size (max = 499 , min = 3, message="{CarTitle.name=invalid}")
	private String carTitle;
	
	@Column (name="carDescription")
	@Size (max = 499 , min = 3, message="{Cardescription.name=invalid}")
	private String carDescription;
	
	@Column (name="isCar")
	private boolean isCar;
	
	@Column (name="isApproved")
	private boolean isApproved;

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public Long getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(Long engineNo) {
		this.engineNo = engineNo;
	}

	public Long getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(Long chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImportYear() {
		return ImportYear;
	}

	public void setImportYear(String importYear) {
		ImportYear = importYear;
	}

	public String getRegisteredYear() {
		return RegisteredYear;
	}

	public void setRegisteredYear(String registeredYear) {
		RegisteredYear = registeredYear;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public Long getDemand() {
		return demand;
	}

	public void setDemand(Long demand) {
		this.demand = demand;
	}

	public Long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(Long featureId) {
		this.featureId = featureId;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getCarTitle() {
		return carTitle;
	}

	public void setCarTitle(String carTitle) {
		this.carTitle = carTitle;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

	public boolean isCar() {
		return isCar;
	}

	public void setCar(boolean isCar) {
		this.isCar = isCar;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
	
	
}