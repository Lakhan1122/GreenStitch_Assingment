package com.lakhan.payload.request;

public class SignupRequest {
	private String username;
    private String password;
    
    
    
    
	public SignupRequest() {
	
		// TODO Auto-generated constructor stub
	}
	public SignupRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
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
    
    

}
