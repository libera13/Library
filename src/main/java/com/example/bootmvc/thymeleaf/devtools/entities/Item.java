package com.example.bootmvc.thymeleaf.devtools.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private long id;
	private String itemName;
	private String quantityInStock;
	private String unitOfMeasure;
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(String quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Item() {
		 
	}
	
}