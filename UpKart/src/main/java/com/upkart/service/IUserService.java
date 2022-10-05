/**
 * 
 */
package com.upkart.service;

import java.util.List;
import com.upkart.exceptions.EmptyCartException;
import com.upkart.exceptions.ProductNotAvailableException;
import com.upkart.exceptions.UnknownBrandException;
import com.upkart.model.User;
import com.upkart.model.UserLogin;

/**
 * @author AshishKumar
 *
 */
public interface IUserService {
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
	 * @param userCart
	 */
	void addToCart(User userCart);
	
	/**
	 * 
	 */
	void emptyCart(String category);
	
	/**
	 * @return
	 * @throws EmptyCartException
	 */
	List<User> viewCart() throws EmptyCartException;
	
	/**
	 * @param brand
	 * @return
	 * @throws UnknownBrandException
	 */
	List<User> viewByBrand(String brand) throws UnknownBrandException;
	
	/**
	 * @param productName
	 * @return
	 * @throws ProductNotAvailableException
	 */
	List<User> viewByProductName(String productName) throws ProductNotAvailableException;
	
	/**
	 * @param category
	 * @param productName
	 * @param brand
	 * @return
	 * @throws ProductNotAvailableException
	 */
	List<User> viewByCategory(String category, String productName, String brand) throws ProductNotAvailableException;
}
