/**
 * 
 */
package com.upkart.service;

import java.util.List;
import com.upkart.dao.AdminDaoImpl;
import com.upkart.dao.IAdminDao;
import com.upkart.exceptions.ProductNotAvailableException;
import com.upkart.model.Admin;

/**
 * @author AshishKumar
 *
 */
public class AdminServiceImpl implements IAdminService{
	
	IAdminDao adminRef = new AdminDaoImpl();
	/**
	 * @param admin
	 */
	public void addProduct(Admin admin) {
		adminRef.addProduct(admin);
	}

	/**
	 * @param productId
	 */
	public void deleteProduct(int productId) {
		adminRef.deleteProduct(productId);
	}

	/**
	 * @param productId
	 * @param paymentOption
	 * @param itemStock
	 * @param price
	 */
	public void updateProduct(int productId, String paymentOption, int itemStock, double price) {
		adminRef.updateProduct(productId, paymentOption, itemStock, price);
	}

	/**
	 * @return
	 */
	public List<Admin> getProductsInfo() {
		List<Admin> products = adminRef.getProductsInfo();
		
		if(products==null) {
			throw new ProductNotAvailableException("No Products Added!! Add Products");
		}
		else
			return products;
	}

	/**
	 * @param category
	 * @param brand
	 * @return
	 */
	public List<Admin> getByCategory(String category, String brand) {
		List<Admin> products = adminRef.getByCategory(category, brand);
		
		if(products.isEmpty()) {
			throw new ProductNotAvailableException("No Products Added!!");
		}
		else
			return products;
	}

	/**
	 * @param category
	 * @param brand
	 * @param retailer
	 * @return
	 */
	public List<Admin> getByRetailer(String category, String brand, String retailer) {
		List<Admin> products = adminRef.getByRetailer(category, brand, retailer);
		
		if(products.isEmpty()) {
			throw new ProductNotAvailableException("No Products Added!!");
		}
		else
			return products;
	}

	/**
	 * @param productName
	 * @return
	 */
	public List<Admin> getByProductName(String productName) {
		List<Admin> products = adminRef.getByProductName(productName);
		
		if(products.isEmpty()) {
			throw new ProductNotAvailableException("No Products Found By Product Name!!");
		}
		else
			return products;
	}

	/**
	 * @param brand
	 * @return
	 */
	public List<Admin> getByBrand(String brand) {
		List<Admin> products = adminRef.getByBrand(brand);
		
		if(products.isEmpty()) {
			throw new ProductNotAvailableException("No Products Found By Brand!!");
		}
		else
			return products;
	}

}
