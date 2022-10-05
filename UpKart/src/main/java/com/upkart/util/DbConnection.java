/**
 * 
 */
package com.upkart.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author AshishKumar
 *
 */
public class DbConnection {
	/**
	 * 
	 */
	static Connection connection;
	/**
	 * 
	 */
	static PreparedStatement statement;

	/**
	 * @return
	 */
	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/upkart";
		String username = "root";
		String password = "root";
		statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
