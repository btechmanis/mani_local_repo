package com.ecommerce.dto;

public class ProductDTO {
	private int productId;
	  private String productName;
	  private String productBrand;
	  private String productDescription;
	  private int productPrice;
	  private String productSize;
	  private String productColor;
	  private String productDiscount;
	  private int productOnorder;
	  private int productAvalaible;
	  private String productImageurl;
	  private String productAvailableStatus;
	  private CategoryDTO category;
	  public ProductDTO() {
		  
	  }
	public ProductDTO(int productId, String productName, String productBrand, String productDescription,
			int productPrice, String productSize, String productColor, String productDiscount, int productOnorder,
			int productAvalaible, String productImageurl, String productAvailableStatus, CategoryDTO category) {
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
		this.productAvalaible = productAvalaible;
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
	public int getProductAvalaible() {
		return productAvalaible;
	}
	public void setProductAvalaible(int productAvalaible) {
		this.productAvalaible = productAvalaible;
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
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productSize="
				+ productSize + ", productColor=" + productColor + ", productDiscount=" + productDiscount
				+ ", productOnorder=" + productOnorder + ", productAvalaible=" + productAvalaible + ", productImageurl="
				+ productImageurl + ", productAvailableStatus=" + productAvailableStatus + ", category=" + category
				+ "]";
	}

	  
}