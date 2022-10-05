/**
 * 
 */
package com.upkart.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.upkart.model.Admin;
import com.upkart.model.User;

/**
 * @author AshishKumar
 *
 */
public class CartMapper implements IRowMapper{
	
	/**
	 * @param resultSet
	 * @return
	 * @throws SQLException
	 */
	@Override
	public List<Admin> rowMap(ResultSet resultSet) throws SQLException {
		List<Admin> products = new ArrayList<>();

		while(resultSet.next()) {
			Admin product = new Admin();
			product.setProductName(resultSet.getString(1));
			product.setProductId(resultSet.getInt(2));
			product.setCategory(resultSet.getString(3));
			product.setBrand(resultSet.getString(4));
			product.setRetailer(resultSet.getString(5));
			product.setPaymentOption(resultSet.getString(6));
			product.setDeliveryDays(resultSet.getInt(7));
			product.setItemStock(resultSet.getInt(8));
			product.setPrice(resultSet.getDouble(9));
			
			products.add(product);
	}
	return products;
}

	/**
	 * @param resultSet
	 * @return
	 * @throws SQLException
	 */
	@Override
	public List<User> rowMapCart(ResultSet resultSet) throws SQLException {
		List<User> cartProducts = new ArrayList<>();
		
		while(resultSet.next()) {
			User cart = new User();{
				cart.setCategory(resultSet.getString(1));
				cart.setBrand(resultSet.getString(2));
				cart.setProductName(resultSet.getString(3));
				cart.setPaymentOption(resultSet.getString(4));
				cart.setItemStock(resultSet.getInt(5));
				
				cartProducts.add(cart);
			}
		}
		return cartProducts;
	}

}
