package eshopping.eshopping.request.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

public class ProductsRequest {
	
	private int id;
	private String name;
    private String category;
    private BigDecimal retail_price;
    private BigDecimal discounted_price;
   
    private boolean availability;
    public int getId() {
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
		return discounted_price;
	}
	public void setDiscount_price(BigDecimal discount_price) {
		this.discounted_price = discount_price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
    

}
