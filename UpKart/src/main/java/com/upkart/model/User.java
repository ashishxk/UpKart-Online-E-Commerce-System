/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public class User {
	private String category;
	private String brand;
	private String productName;
	private String paymentOption;
	private int itemStock;
	
	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @param category
	 * @param brand
	 * @param productName
	 * @param paymentOption
	 * @param itemStock
	 */
	public User(String category, String brand, String productName, String paymentOption, int itemStock) {
		super();
		this.category = category;
		this.brand = brand;
		this.productName = productName;
		this.paymentOption = paymentOption;
		this.itemStock = itemStock;
	}

	/**
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return
	 */
	public String getPaymentOption() {
		return paymentOption;
	}

	/**
	 * @param paymentOption
	 */
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	/**
	 * @return
	 */
	public int getItemStock() {
		return itemStock;
	}

	/**
	 * @param itemStock
	 */
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "User [category=" + category + ", brand=" + brand + ", productName=" + productName + ", paymentOption="
				+ paymentOption + ", itemStock=" + itemStock + "]";
	}
}
