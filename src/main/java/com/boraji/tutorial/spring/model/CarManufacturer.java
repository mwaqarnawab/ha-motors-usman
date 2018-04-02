package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "carmanufacturer")
public class CarManufacturer {

   @Id
   @GeneratedValue
   @Column(name = "carManufacturerId")
   private Long carManufacturerId;

   @Column(name = "companyName")
   @Size(max = 499, min = 0, message = "{compoany.name.invalid}")
   private String companyName;

public Long getCarManufacturerId() {
	return carManufacturerId;
}

public void setCarManufacturerId(Long carManufacturerId) {
	this.carManufacturerId = carManufacturerId;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

  

}
