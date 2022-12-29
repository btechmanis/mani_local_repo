package com.ecommerce.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int productId;
	@Column(name="productname")
  private String productName;
  private String productBrand;
  private String productDescription;
  private int productPrice;
  private String productSize;
  private String productColor;
  private String productDiscount;
  private int productOnorder;
  private int productAvailable;
  private String productImageurl;
  private String productAvailableStatus;
  @ManyToOne
  private Category category;
public Product() {
	super();

}
public Product(int productId, String productName, String productBrand, String productDescription, int productPrice,
		String productSize, String productColor, String productDiscount, int productOnorder, int productAvailable,
		String productImageurl, String productAvailableStatus, Category category) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productBrand = productBrand;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.productSize = productSize;
	this.productColor = productColor;
	this.productDiscount = productDiscount;
	this.productOnorder = productOnorder;
	this.productAvailable = productAvailable;
	this.productImageurl = productImageurl;
	this.productAvailableStatus = productAvailableStatus;
	this.category = category;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductBrand() {
	return productBrand;
}
public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public String getProductSize() {
	return productSize;
}
public void setProductSize(String productSize) {
	this.productSize = productSize;
}
public String getProductColor() {
	return productColor;
}
public void setProductColor(String productColor) {
	this.productColor = productColor;
}
public String getProductDiscount() {
	return productDiscount;
}
public void setProductDiscount(String productDiscount) {
	this.productDiscount = productDiscount;
}
public int getProductOnorder() {
	return productOnorder;
}
public void setProductOnorder(int productOnorder) {
	this.productOnorder = productOnorder;
}
public int getProductAvailable() {
	return productAvailable;
}
public void setProductAvailable(int productAvailable) {
	this.productAvailable = productAvailable;
}
public String getProductImageurl() {
	return productImageurl;
}
public void setProductImageurl(String productImageurl) {
	this.productImageurl = productImageurl;
}
public String getProductAvailableStatus() {
	return productAvailableStatus;
}
public void setProductAvailableStatus(String productAvailableStatus) {
	this.productAvailableStatus = productAvailableStatus;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
			+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productSize="
			+ productSize + ", productColor=" + productColor + ", productDiscount=" + productDiscount
			+ ", productOnorder=" + productOnorder + ", productAvailable=" + productAvailable + ", productImageurl="
			+ productImageurl + ", productAvailableStatus=" + productAvailableStatus + ", category=" + category + "]";
}
@Override
public int hashCode() {
	return Objects.hash(category, productAvailable, productAvailableStatus, productBrand, productColor,
			productDescription, productDiscount, productId, productImageurl, productName, productOnorder, productPrice,
			productSize);
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
	return Objects.equals(category, other.category) && productAvailable == other.productAvailable
			&& Objects.equals(productAvailableStatus, other.productAvailableStatus)
			&& Objects.equals(productBrand, other.productBrand) && Objects.equals(productColor, other.productColor)
			&& Objects.equals(productDescription, other.productDescription)
			&& Objects.equals(productDiscount, other.productDiscount) && productId == other.productId
			&& Objects.equals(productImageurl, other.productImageurl) && Objects.equals(productName, other.productName)
			&& productOnorder == other.productOnorder && productPrice == other.productPrice
			&& Objects.equals(productSize, other.productSize);
}

}