package com.hans.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Log {
	private int id;
	private String message;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
