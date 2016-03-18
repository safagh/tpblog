package fr.treeptik.exception;

public class AuteurAlreadyExistsException extends Exception {

		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public AuteurAlreadyExistsException(String message) {
			super(message);
		}

		public AuteurAlreadyExistsException(String message, Throwable cause) {
			super(message, cause);
		}
		
	}

