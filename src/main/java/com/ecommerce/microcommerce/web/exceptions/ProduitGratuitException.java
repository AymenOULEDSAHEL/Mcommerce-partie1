/**
 * 
 */
package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author utente : Aymen OULED SAHEL
 * @Email: ouled.sahel.aymen@gmail.com
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7025316198531108322L;

	/**
	 * 
	 */
	public ProduitGratuitException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ProduitGratuitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ProduitGratuitException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ProduitGratuitException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ProduitGratuitException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
