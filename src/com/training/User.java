package com.training;

public class User implements Comparable<User> {
	
	private String  username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int compareTo(User a) {
		// TODO Auto-generated method stub
		return this.username.compareTo(a.getUsername());
	}
	

}
