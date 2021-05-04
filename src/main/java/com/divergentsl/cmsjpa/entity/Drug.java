package com.divergentsl.cmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`drug`")
public class Drug {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="`drug-name`")
	private String drugname;
	
	@Column(name="`description`")
	private String description;
	
	@Column(name="`quantity`")
	private String quantity;
	
	@Column(name="`price`")
	private String price;

	public long getDrugid() {
		return id;
	}

	public void setDrugid(long drugid) {
		this.id = drugid;
	}

	public String getDrugname() {
		return drugname;
	}

	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drug [drugid=" + id + ", drugname=" + drugname + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	

}
