package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ ", ld=" + ld + ", ms=" + ms + "]";
	}
	private int ProductId;
	private String ProductName;
	private long ProductPrice;
	private List<Dealer> ld;
	private Map<Integer, Supplier> ms;
	public Product(int productId, String productName, long productPrice, List<Dealer> ld, Map<Integer, Supplier> ms) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		this.ld = ld;
		this.ms = ms;
	}
	
}
