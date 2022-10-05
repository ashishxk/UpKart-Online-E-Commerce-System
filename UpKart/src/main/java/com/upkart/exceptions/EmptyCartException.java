/**
 * 
 */
package com.upkart.exceptions;

/**
 * @author AshishKumar
 *
 */
public class EmptyCartException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public EmptyCartException() {
		super();
	}

	public EmptyCartException(String message) {
		super(message);
	}

}
