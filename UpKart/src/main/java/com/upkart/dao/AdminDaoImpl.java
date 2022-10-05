/**
 * 
 */
package com.upkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.upkart.model.Admin;
import com.upkart.util.CartMapper;
import com.upkart.util.DbConnection;
import com.upkart.util.IRowMapper;
import com.upkart.util.Queries;

/**
 * @author AshishKumar
 *
 */
public class AdminDaoImpl implements IAdminDao {
	PreparedStatement statement = null;
	ResultSet resultset = null;
	IRowMapper mapper = new CartMapper();

	/**
	 * @param admin
	 */
	public void addProduct(Admin admin) {
		Connection connection = DbConnection.openConnection();

		try {
			statement = connection.prepareStatement(Queries.INSERTQUERY);
			statement.setString(1, admin.getProductName());
			statement.setInt(2, admin.getProductId());
			statement.setString(3, admin.getCategory());
			statement.setString(4, admin.getBrand());
			statement.setString(5, admin.getRetailer());
			statement.setString(6, admin.getPaymentOption());
			statement.setInt(7, admin.getDeliveryDays());
			statement.setInt(8, admin.getItemStock());
			statement.setDouble(9, admin.getPrice());
			statement.execute();

			System.out.println("\n");
			System.out.println("Product Details Saved Successfully!!");
			System.out.println("\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			DbConnection.closeConnection();
		}
	}

	/**
	 * @param productId
	 */
	public void deleteProduct(int productId) {
		Connection connection = DbConnection.openConnection();

		try {
			PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);

			statement.setInt(1, productId);
			statement.execute();

			System.out.println("\n");
			System.out.println("Product Deleted Successfully");
			System.out.println("\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			DbConnection.closeConnection();
		}

	}

	/**
	 * @param productId
	 * @param paymentOption
	 * @param itemStock
	 * @param price
	 */
	public void updateProduct(int productId, String paymentOption, int itemStock, double price) {
		Connection connection = DbConnection.openConnection();

		try {
			PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);

			statement.setInt(1, productId);
			statement.setString(2, paymentOption);
			statement.setInt(3, itemStock);
			statement.setDouble(4, price);
			statement.execute();

			System.out.println("\n");
			System.out.println("Product Updated Successfully!!");
			System.out.println("\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			DbConnection.closeConnection();
		}
	}

	/**
	 * @return
	 */
	public List<Admin> getProductsInfo() {
		Connection connection = DbConnection.openConnection();

		List<Admin> products = new ArrayList<>();
		
		try {
			PreparedStatement statement = connection.prepareStatement(Queries.QUERYFORALL);
			ResultSet resultset = statement.executeQuery();
			
			products = mapper.rowMap(resultset);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null && resultset != null) {

				try {
					resultset.close();
					statement.close();

				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			DbConnection.closeConnection();
		}
		return products;
	}

	/**
	 * @param category
	 * @param brand
	 * @return
	 */
	public List<Admin> getByCategory(String category, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param category
	 * @param brand
	 * @param retailer
	 * @return
	 */
	public List<Admin> getByRetailer(String category, String brand, String retailer) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param productName
	 * @return
	 */
	public List<Admin> getByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param brand
	 * @return
	 */
	public List<Admin> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
