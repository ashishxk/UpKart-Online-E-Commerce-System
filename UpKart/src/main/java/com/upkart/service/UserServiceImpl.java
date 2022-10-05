/**
 * 
 */
package com.upkart.service;

import java.util.List;

import com.upkart.dao.IUserDao;
import com.upkart.dao.UserDaoImpl;
import com.upkart.exceptions.EmptyCartException;
import com.upkart.exceptions.ProductNotAvailableException;
import com.upkart.exceptions.UnknownBrandException;
import com.upkart.model.Admin;
import com.upkart.model.User;
import com.upkart.model.UserLogin;

/**
 * @author AshishKumar
 *
 */
public class UserServiceImpl implements IUserService {

	IUserDao user = new UserDaoImpl();

	/**
	 * @param userLogin
	 * @return
	 */
	public String registerUser(UserLogin userLogin) {
		return user.registerUser(userLogin);
	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public UserLogin login(String userName, String password) {
		UserLogin userLogin = user.login(userName, password);
		return userLogin;
	}

	/**
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return 
	 * @return
	 */
	public String changePassword(String userName, String oldPassword, String newPassword) {
		return user.changePassword(userName, oldPassword, newPassword);
	}

	/**
	 * @param user
	 */
	public void addToCart(User userCart) {
		user.addToCart(userCart);
	}

	/**
	 * 
	 */
	public void emptyCart(String category) {
		user.emptyCart(category);
	}

	/**
	 * @return
	 * @throws EmptyCartException
	 */
	public List<User> viewCart() throws EmptyCartException {
		List<User> cartItems = user.viewCartItems();

		if (cartItems == null) {
			throw new ProductNotAvailableException("No Items Added!! Add Items to the Cart");
		} else
			return cartItems;
	}

	/**
	 * @param brand
	 * @return
	 * @throws UnknownBrandException
	 */
	public List<User> viewByBrand(String brand) throws UnknownBrandException {
		List<User> viewCart = user.viewByBrand(brand);
		
		if(viewCart == null) {
			throw new UnknownBrandException("Brand Not Available!!");
		}
		else
			return viewCart;
	}

	/**
	 * @param productName
	 * @return
	 * @throws ProductNotAvailableException
	 */
	public List<User> viewByProductName(String productName) throws ProductNotAvailableException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param category
	 * @param productName
	 * @param brand
	 * @return
	 * @throws ProductNotAvailableException
	 */
	public List<User> viewByCategory(String category, String productName, String brand)
			throws ProductNotAvailableException {
		// TODO Auto-generated method stub
		return null;
	}

}
