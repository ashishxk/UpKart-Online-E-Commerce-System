/**
 * 
 */
package com.upkart.dao;

import java.util.List;

import com.upkart.model.User;
import com.upkart.model.UserLogin;

/**
 * @author AshishKumar
 *
 */
public interface IUserDao {
	/**
	 * @param userLogin
	 * @return
	 */
	String registerUser(UserLogin userLogin);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	UserLogin login(String userName, String password);

	/**
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	String changePassword(String userName, String oldPassword, String newPassword);
	
	/**
	 * @param user
	 */
	void addToCart(User userCart);
	
	/**
	 * 
	 */
	void emptyCart(String category);
	
	/**
	 * @return
	 */
	List<User> viewCartItems();
	
	/**
	 * @param brand
	 * @return
	 */
	List<User> viewByBrand(String brand);
	
	/**
	 * @param productName
	 * @return
	 */
	List<User> viewByProductName(String productName);
	
	/**
	 * @param category
	 * @param productName
	 * @param brand
	 * @return
	 */
	List<User> viewByCategory(String category, String productName, String brand);
}
