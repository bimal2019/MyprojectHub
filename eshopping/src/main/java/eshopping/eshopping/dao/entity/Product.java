package eshopping.eshopping.dao.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "id", updatable = false,nullable = false)
	private long id;
	
	@Column(name = "name",nullable = false)
    private String name;
	
	@Column(name = "category",nullable = false)
    private String category;
	
	@Column(name="retail_price",nullable=false)
	private BigDecimal retail_price;
	
	@Column(name="discount_price",nullable=false)
	private BigDecimal discount_price;
	
	
	@Column(name="availability",nullable=false)
	private boolean availability;
	@Column(name="discount_percentage",nullable=false)
	private int discount_percentage;
	
	public int getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(BigDecimal retail_price) {
		this.retail_price = retail_price;
	}

	public BigDecimal getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(BigDecimal discount_price) {
		this.discount_price = discount_price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	
	
	
 
    
	
	
}
