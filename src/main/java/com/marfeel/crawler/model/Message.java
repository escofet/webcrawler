package com.marfeel.crawler.model;

public class Message {
	private String message;
	String username;
	
	public Message(String message, String username) {
		this.message = message;
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
