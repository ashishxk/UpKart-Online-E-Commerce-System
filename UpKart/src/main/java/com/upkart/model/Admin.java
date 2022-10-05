/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public class Admin {
	
	private String productName;
	private int productId;
	private String category;
	private String brand;
	private String retailer;
	private String paymentOption;
	private int deliveryDays;
	private int itemStock;
	private double price;
	
	
	/**
	 * 
	 */
	public Admin() {
		super();
	}


	/**
	 * @param productName
	 * @param productId
	 * @param category
	 * @param brand
	 * @param retailer
	 * @param paymentOption
	 * @param deliveryDays
	 * @param itemStock
	 * @param price
	 */
	public Admin(String productName, int productId, String category, String brand, String retailer,
			String paymentOption, int deliveryDays, int itemStock, double price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.category = category;
		this.brand = brand;
		this.retailer = retailer;
		this.paymentOption = paymentOption;
		this.deliveryDays = deliveryDays;
		this.itemStock = itemStock;
		this.price = price;
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
	public int getProductId() {
		return productId;
	}


	/**
	 * @param productId
	 */
	public void setProductId(int productId) {
		this.productId = productId;
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
	public String getRetailer() {
		return retailer;
	}


	/**
	 * @param retailer
	 */
	public void setRetailer(String retailer) {
		this.retailer = retailer;
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
	public int getDeliveryDays() {
		return deliveryDays;
	}


	/**
	 * @param deliveryDays
	 */
	public void setDeliveryDays(int deliveryDays) {
		this.deliveryDays = deliveryDays;
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
	public double getPrice() {
		return price;
	}


	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "\n\t\t\t-Products-Details-\t\t\t\n\nProduct Name = " + productName + "\nProduct Id = " + productId + "\nCategory = " + category + "\nBrand = "
				+ brand + "\nRetailer = " + retailer + "\nPayment Option = " + paymentOption + "\nDelivery Days = "
				+ deliveryDays + "\nItem Stock = " + itemStock + "\nPrice = " + price + "\n\n";
	}
}
