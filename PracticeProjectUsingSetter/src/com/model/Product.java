package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int productId;
	private String productName;
	private long productPrice;
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
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public List<Dealer> getLd() {
		return ld;
	}
	public void setLd(List<Dealer> ld) {
		this.ld = ld;
	}
	public Map<Integer, Supplier> getMs() {
		return ms;
	}
	public void setMs(Map<Integer, Supplier> ms) {
		this.ms = ms;
	}
	private List<Dealer> ld;
	private Map<Integer, Supplier> ms;
}
