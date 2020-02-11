package com.example.bootmvc.thymeleaf.devtools.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	@NotBlank(message = "Podaj tytuł")
	private String itemName;
	
	@NotBlank(message = "Podaj autora")
	private String author;
	
	@Min(value = 0L)
	@Digits(fraction = 0, integer = 10)
	@NotNull(message = "Podaj ilość egzemplarzy")
	private Long quantityInStock;
	
	@Min(value = 0L)
	@Digits(fraction = 0, integer = 4)
	@NotNull(message = "Podaj datę wydania")
	private Long publicationDate;
	
	@Min(value = 0L)
	@Digits(fraction = 0, integer = 10)
	@NotNull(message = "Podaj ilość stron")
	private Long pages;
	
	
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
	public Long getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(Long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Long publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
	public Item() {
		 
	}
	
}