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
import com.upkart.model.User;
import com.upkart.model.UserLogin;
import com.upkart.util.CartMapper;
import com.upkart.util.DbConnection;
import com.upkart.util.IRowMapper;
import com.upkart.util.Queries;

/**
 * @author AshishKumar
 *
 */
public class UserDaoImpl implements IUserDao {
	IRowMapper mapper = new CartMapper();
	PreparedStatement statement = null;
	ResultSet resultset = null;

	/**
	 * @param userLogin
	 * @return
	 */
	public String registerUser(UserLogin userLogin) {
		Connection connection = DbConnection.openConnection();
		try {
			statement = connection.prepareStatement(Queries.REGISTERQUERY);
			statement.setString(1, userLogin.getName());
			statement.setLong(2, userLogin.getMobileNumber());
			statement.setString(3, userLogin.getEmail());
			statement.setString(4, userLogin.getUserName());
			statement.setString(5, userLogin.getPassword());
			statement.execute();

			System.out.println("\n");
			System.out.println("Registered Successfully!!");
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
		return "Registered";
	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public UserLogin login(String userName, String password) {
		Connection connection = DbConnection.openConnection();
		UserLogin user = new UserLogin();
		try {
			statement = connection.prepareStatement(Queries.LOGINQUERY);
			statement.setString(1, userName);
			statement.setString(2, password);
			
			resultset = statement.executeQuery();
			
			while(resultset.next()) {
				user.setName(resultset.getString(1));
				user.setMobileNumber(resultset.getLong(2));
				user.setEmail(resultset.getString(3));
				user.setUserName(resultset.getString(4));
				user.setPassword(resultset.getString(5));
			}
				
			System.out.println("\n");
			System.out.println("WELCOME---> " + userName);
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
		return user;
	}

	/**
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public String changePassword(String userName, String oldPassword, String newPassword) {
		Connection connection = DbConnection.openConnection();

		try {
			statement = connection.prepareStatement(Queries.CHANGEPASSWORDQUERY);
			statement.setString(1, userName);
			statement.setString(2, oldPassword);
			statement.setString(3, newPassword);
			statement.executeUpdate();

			System.out.println("\n");
			System.out.println("Password Changed Successfully!!");
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
		return "Password Changed!!";

	}

	/**
	 * @param user
	 */
	public void addToCart(User userCart) {
		Connection connection = DbConnection.openConnection();

		try {
			statement = connection.prepareStatement(Queries.ADDTOCARTQUERY);
			statement.setString(1, userCart.getCategory());
			statement.setString(2, userCart.getBrand());
			statement.setString(3, userCart.getProductName());
			statement.setString(4, userCart.getPaymentOption());
			statement.setInt(5, userCart.getItemStock());
			statement.execute();

			System.out.println("\n");
			System.out.println("Items Added TO The Cart Successfully!!");
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
	 * 
	 */
	public void emptyCart(String category) {
		Connection connection = DbConnection.openConnection();

		try {
			PreparedStatement statement = connection.prepareStatement(Queries.DELETECARTQUERY);
			statement.setString(1, category);
			statement.execute();

			System.out.println("\n");
			System.out.println("Items Removed from the Cart!!");
			System.out.println("\n");

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
	}

	/**
	 * @return
	 */
	public List<User> viewCartItems() {
		Connection connection = DbConnection.openConnection();

		List<User> cartItems = new ArrayList<>();

		try {
			PreparedStatement statement = connection.prepareStatement(Queries.QUERYFORALL);
			ResultSet resultset = statement.executeQuery();

			System.out.println("\n\n\t\t\t-ITEMS-IN-THE-CART-\t\t\t\n\n");
			cartItems = mapper.rowMapCart(resultset);

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
		return cartItems;
	}

	/**
	 * @param brand
	 * @return
	 */
	public List<User> viewByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param productName
	 * @return
	 */
	public List<User> viewByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param category
	 * @param productName
	 * @param brand
	 * @return
	 */
	public List<User> viewByCategory(String category, String productName, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
