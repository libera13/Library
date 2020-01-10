package com.example.bootmvc.thymeleaf.devtools.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	private String itemName;
	private long quantityInStock;
	private String Author;
	private long publicationDate;
	private long pages;
	// numer sygnatury, np. NS8290
	private String referenceNumber;
	// lokalizacja dwie opcje: 1. w bibliotece 2. wypozyczona data zwrotu:xxxś
	private long location;
	
	
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
	public long getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public long getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(long publicationDate) {
		this.publicationDate = publicationDate;
	}
	public long getPages() {
		return pages;
	}
	public void setPages(long pages) {
		this.pages = pages;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public long getLocation() {
		return location;
	}
	public void setLocation(long location) {
		this.location = location;
	}
	public Item() {
		 
	}
	
}