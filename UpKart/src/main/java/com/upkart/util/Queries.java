/**
 * 
 */
package com.upkart.util;

/**
 * @author AshishKumar
 *
 */
public class Queries {
	public static final String INSERTQUERY = "INSERT INTO admin(productName,productId,category,brand,retailer,paymentOption,deliveryDays,itemStock,price) VALUES(?,?,?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY = "UPDATE admin SET paymentOption = ? AND itemStock = ? AND price = ? WHERE productId = ?";
	public static final String DELETEQUERY = "DELETE FROM admin WHERE productId = ?";
	
	public static final String ADDTOCARTQUERY = "INSERT INTO user(category,brand,productName,paymentOption,itemStock) VALUES(?,?,?,?,?)";
	//public static final String ADDTOCARTQUERY = "INSERT INTO USER(category,brand,productName,paymentOption,itemStock) SELECT category,brand,productName,paymentOption,itemStock FROM admin";
	public static final String DELETECARTQUERY = "DELETE FROM user WHERE category = ?";
	
	public static final String QUERYFORALL = "SELECT * FROM admin";
	public static final String QUERYBYCATEGORY = "SELECT * FROM admin WHERE category = ? AND brand = ?";
	public static final String 	QUERYBYRETAILER = "SELECT * FROM admin WHERE category = ? AND brand = ? AND retailer = ?";
	
	public static final String LOGINQUERY = "SELECT * FROM userlogin WHERE UserName = ? AND Password = ?";
	public static final String REGISTERQUERY = "INSERT INTO userlogin(name,mobileNumber,email,userName,password) VALUES(?,?,?,?,?)";
	public static final String CHANGEPASSWORDQUERY = "UPDATE userlogin SET password = ? WHERE password = ? AND userName = ?";
}
