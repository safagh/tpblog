package fr.treeptik.exception;

public class ServiceExeption extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceExeption(String message) {
		super(message);
	}

	public ServiceExeption(String message, Throwable cause) {
		super(message, cause);
	}
	
}
