/**
 * 
 */
package com.upkart.service;

import java.util.List;

import com.upkart.model.Admin;

/**
 * @author AshishKumar
 *
 */
public interface IAdminService {
	/**
	 * @param admin
	 */
	void addProduct(Admin admin);

	/**
	 * @param productId
	 */
	void deleteProduct(int productId);

	/**
	 * @param productId
	 * @param paymentOption
	 * @param itemStock
	 * @param price
	 */
	void updateProduct(int productId, String paymentOption, int itemStock, double price);

	/**
	 * @param brand
	 * @return
	 */
	List<Admin> getByBrand(String brand);

	/**
	 * @param category
	 * @param brand
	 * @return
	 */
	List<Admin> getByCategory(String category, String brand);

	/**
	 * @param category
	 * @param brand
	 * @param retailer
	 * @return
	 */
	List<Admin> getByRetailer(String category, String brand, String retailer);

	/**
	 * @return
	 */
	List<Admin> getProductsInfo();

	/**
	 * @param productName
	 * @return
	 */
	List<Admin> getByProductName(String productName);
}
