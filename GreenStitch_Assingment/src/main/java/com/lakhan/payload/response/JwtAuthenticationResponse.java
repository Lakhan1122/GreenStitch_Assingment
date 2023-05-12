package com.lakhan.payload.response;

public class JwtAuthenticationResponse {

	private String token;

	public JwtAuthenticationResponse() {
		
		// TODO Auto-generated constructor stub
	}

	public JwtAuthenticationResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
