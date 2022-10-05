/**
 * 
 */
package com.upkart.exceptions;

/**
 * @author AshishKumar
 *
 */
public class ProductNotAvailableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ProductNotAvailableException() {
		super();
	}

	public ProductNotAvailableException(String message) {
		super(message);
	}

}
