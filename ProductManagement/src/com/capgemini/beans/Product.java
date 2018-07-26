package com.capgemini.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productID;
	@NotEmpty
	private String productName;
	@NotEmpty
	private String productDetails;
	private int price;
	
	
	
	
	public Product(int productID, String productName, String productDetails, int price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDetails = productDetails;
		this.price = price;
	}


	public Product() {
		//super();
	}


	public Product(String productName, String productDetails) {
		super();
		this.productName = productName;
		this.productDetails = productDetails;
	}
	
	


	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}


	

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productDetails=" + productDetails
				+ ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((productDetails == null) ? 0 : productDetails.hashCode());
		result = prime * result + productID;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		if (productDetails == null) {
			if (other.productDetails != null)
				return false;
		} else if (!productDetails.equals(other.productDetails))
			return false;
		if (productID != other.productID)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}


	
	
	
	
	

}
