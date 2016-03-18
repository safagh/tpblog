package fr.treeptik.notify.impl;

import fr.treeptik.notify.impl.Message;

public class StringMessage implements Message {
	
	private String message;

	public StringMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return message;
	}
}

