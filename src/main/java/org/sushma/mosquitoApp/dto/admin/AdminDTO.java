package org.sushma.mosquitoApp.dto.admin;

import java.io.Serializable;

public class AdminDTO implements Serializable {
	private String userId;
	private String password;
	
	public AdminDTO() {
		System.out.println(this.getClass().getSimpleName() +" object created");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDTO [userId=" + userId + ", password=" + password + "]";
	}
	
}
