package eshopping.eshopping.request.model;

import java.math.BigDecimal;

public class ProductUpdateRequest {
	private BigDecimal retail_price;
	private BigDecimal discount_price;
	private int availability;
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
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}

}
