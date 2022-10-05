/**
 * 
 */
package com.upkart.main;

import java.util.Scanner;
import com.upkart.model.Admin;
import com.upkart.model.User;
import com.upkart.model.UserLogin;
import com.upkart.service.AdminServiceImpl;
import com.upkart.service.IAdminService;
import com.upkart.service.IUserService;
import com.upkart.service.UserServiceImpl;

/**
 * @author AshishKumar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("\t\t\t-WELCOME-TO-UPKART-\t\t\t");
		System.out.println("\n");

		int repeat = 0;

		do {
			System.out.println("PLEASE SELECT:-\n");
			System.out.println("1. ADMIN");
			System.out.println("2. USER");
			int choice = sc.nextInt();

			sc.nextLine();

			if (choice == 1) {

				IAdminService adminRef = new AdminServiceImpl();

				System.out.println("\n");
				System.out.println("---->WELCOME---->ADMIN\t\t\t");
				System.out.println("\n");
				System.out.println("PLEASE SELECT:-\n");
				System.out.println("1. ADD PRODUCT");
				System.out.println("2. REMOVE PRODUCT");
				System.out.println("3. UPDATE PRODUCT");
				System.out.println("4. SHOW ALL PRODUCTS");

				int adminChoice = sc.nextInt();

				sc.nextLine();

				switch (adminChoice) {
				case 1:
					System.out.println("ENTER PRODUCT NAME");
					String productName = sc.nextLine();

					System.out.println("ENTER PRODUCT ID");
					int productId = sc.nextInt();
					sc.nextLine();

					System.out.println("ENTER CATEGORY");
					String category = sc.nextLine();

					System.out.println("ENTER BRAND");
					String brand = sc.nextLine();

					System.out.println("ENTER RETAILER");
					String retailer = sc.nextLine();

					System.out.println("ENTER PAYMENT OPTION");
					String paymentOption = sc.nextLine();

					System.out.println("ENTER DELIVERY DAYS EXPECTED");
					int deliveryDays = sc.nextInt();
					sc.nextLine();

					System.out.println("ENTER ITEM STOCK");
					int itemStock = sc.nextInt();
					sc.nextLine();

					System.out.println("ENTER PRICE");
					double price = sc.nextDouble();
					sc.nextLine();

					Admin admin = new Admin(productName, productId, category, brand, retailer, paymentOption,
							deliveryDays, itemStock, price);
					adminRef.addProduct(admin);

					break;

				case 2:
					System.out.println("ENTER PRODUCT ID");
					int deleteProduct = sc.nextInt();

					adminRef.deleteProduct(deleteProduct);

					break;

				case 3:
					System.out.println("ENTER PRODUCT ID");
					int updateProductId = sc.nextInt();
					sc.nextLine();

					System.out.println("SELECT WHAT TO UPDATE\n");
					System.out.println("1. PAYMENT OPTION");
					System.out.println("2. ITEM STOCK");
					System.out.println("3. PRICE");
					int updateOption = sc.nextInt();

					switch (updateOption) {
					case 1:
						System.out.println("ENTER PRODUCT PAYMENT OPTION");
						String updatedPaymentOption = sc.nextLine();

						adminRef.updateProduct(updateProductId, updatedPaymentOption, 0, 0);
						break;

					case 2:
						System.out.println("ENTER PRODUCT ITEM STOCK");
						int updatedStock = sc.nextInt();

						adminRef.updateProduct(updateProductId, null, updatedStock, 0);
						break;

					case 3:
						System.out.println("ENTER PRODUCT PRICE");
						double updatedPrice = sc.nextDouble();

						adminRef.updateProduct(updateProductId, null, 0, updatedPrice);
						break;

					}
					break;

				case 4:
					System.out.println(adminRef.getProductsInfo());
					break;

				default:
					System.out.println("\t\t\t-Invalid-Input-");
					break;
				}

			} else if (choice == 2) {
				IUserService userRef = new UserServiceImpl();

				System.out.println("\n");
				System.out.println("---->WELCOME---->USER");
				System.out.println("\n");
				System.out.println("PLEASE SELECT\n");
				System.out.println("1. LOGIN");
				System.out.println("2. REGISER");
				System.out.println("3. CHANGE PASSWORD");
				System.out.println("4. DELETE ACCOUNT");
				System.out.println("\n\n");

				int userChoice = sc.nextInt();
				sc.nextLine();

				if (userChoice == 1) {
					System.out.println("ENTER USERNAME");
					String username = sc.nextLine();
					System.out.println("ENTER PASSWORD");
					String password = sc.nextLine();

					UserLogin check = userRef.login(username, password);

					if (check != null) {
						System.out.println("\n");
						System.out.println("1. BUY ITEMS");
						System.out.println("2. VIEW CART");
						System.out.println("3. EMPTY CART");

						int choice1 = sc.nextInt();
						sc.nextLine();

						switch (choice1) {
						case 1:
							System.out.println("SELECT CATEGORY");
							System.out.println("1. ELECTRONICS");
							System.out.println("2. GROCERY");
							System.out.println("3. FASHION");

							int productCategory = sc.nextInt();

							if (productCategory == 1) {
								System.out.println("SELECT BRAND");
								System.out.println("1. APPLE");
								System.out.println("2. ASUS");
								System.out.println("3. ALIEN WARE");
								System.out.println("4. MSI");
								System.out.println("5. HP");
								System.out.println("6. LEGION");

								int productBrand = sc.nextInt();

								System.out.println("SELECT DEVICE");
								System.out.println("1. LAPTOP");
								System.out.println("2. MOBILE");

								int productName = sc.nextInt();

								System.out.println("SELECT PAYMENT OPTION");
								System.out.println("1. CREDIT CARD");
								System.out.println("2. DEBIT CARD");
								System.out.println("3. CASH ON DELIVERY");

								int deliveryOption = sc.nextInt();

								System.out.println("ENTER QUANTITY");
								int quantity = sc.nextInt();
							}
							
							User addToCart = new User();
							userRef.addToCart(addToCart);
							
							break;

						case 2:
							
							break;
							
						case 3:
							break;

						}

					}

				}

				else if (userChoice == 2) {
					System.out.println("ENTER YOUR NAME");
					String name = sc.nextLine();
					System.out.println("ENTER YOUR MOBILE NUMBER");
					long mobile = sc.nextLong();
					sc.nextLine();
					System.out.println("ENTER YOUR E-MAIL");
					String email = sc.nextLine();
					System.out.println("ENTER YOUR USER NAME");
					String userName = sc.nextLine();
					System.out.println("ENTER YOUR PASSWORD");
					String password = sc.nextLine();

					UserLogin login = new UserLogin(name, mobile, email, userName, password);

					userRef.registerUser(login);

				}

				else if (userChoice == 3) {
					System.out.println("ENTER USER NAME");
					String userNamePassword = sc.nextLine();

					System.out.println("ENTER OLD PASSWORD");
					String userOldPassword = sc.nextLine();

					System.out.println("ENTER NEW PASSWORD");
					String userNewPassword = sc.nextLine();

					userRef.changePassword(userNamePassword, userOldPassword, userNewPassword);

				}

				else if (userChoice == 4) {
					System.out.println("ENTER CATEGORY");
					String itemCategory = sc.nextLine();
					System.out.println("ENTER BRAND");
					String itemBrand = sc.nextLine();
					System.out.println("ENTER PRODUCT NAME");
					String itemName = sc.nextLine();
					System.out.println("ENTER PAYMENT OPTION");
					String itemPaymentOption = sc.nextLine();
					System.out.println("ENTER NO OF ITEMS");
					int noOfItems = sc.nextInt();
					sc.nextLine();

					User addToCart = new User(itemCategory, itemBrand, itemName, itemPaymentOption, noOfItems);
					userRef.addToCart(addToCart);
				}


				else
					System.out.println("\t\t\t-Invalid-Chocie\t\t\t");

			}

			System.out.println("PRESS 1: CONTINUE");
			System.out.println("PRESS 2: EXIT");
			repeat = sc.nextInt();

		} while (repeat == 1);

		System.out.println("------------------THANK YOU!!------------------");
		sc.close();
	}

}
