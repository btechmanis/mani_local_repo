package com.ecommerce.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer categoryId;
	  
	  @Column(name="categoryName")
	  private  String categoryName;
	  
	  private String categoryDescription;

	public Category() {
		super();
		
	}

	public Category(Integer categoryId, String categoryName, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryName, categoryDescription, categoryId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(categoryName, other.categoryName) && Objects.equals(categoryDescription, other.categoryDescription)
				&& Objects.equals(categoryId, other.categoryId);
	}
	  
	  
	  
}