/**
 * 
 */
package com.upkart.exceptions;

/**
 * @author AshishKumar
 *
 */
public class UnknownBrandException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public UnknownBrandException() {
		super();
	}

	public UnknownBrandException(String message) {
		super(message);
	}

}
