/**
 * 
 */
package com.upkart.dao;

import java.util.List;

import com.upkart.model.Admin;

/**
 * @author AshishKumar
 *
 */

/**
 * @author AshishKumar
 *
 */
public interface IAdminDao {
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
	 * @return
	 */
	List<Admin> getProductsInfo();

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
	 * @param productName
	 * @return
	 */
	List<Admin> getByProductName(String productName);

	/**
	 * @param brand
	 * @return
	 */
	List<Admin> getByBrand(String brand);
}
