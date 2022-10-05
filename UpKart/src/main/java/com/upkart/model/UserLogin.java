/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public class UserLogin {
	private String name;
	private long mobileNumber;
	private String email;
	private String userName;
	private String password;

	/**
	 * 
	 */
	public UserLogin() {
		super();
	}

	/**
	 * @param name
	 * @param mobileNumber
	 * @param email
	 * @param userName
	 * @param password
	 */
	public UserLogin(String name, long mobileNumber, String email, String userName, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "\t\t\tUser Details\t\t\t\nName = " + name + "\nMobile Number = " + mobileNumber + "\nEmail = " + email
				+ "\nUser Name = " + userName + "\nPassword = " + password + "\n";
	}

}
