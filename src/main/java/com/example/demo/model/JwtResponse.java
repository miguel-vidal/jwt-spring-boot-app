package com.example.demo.model;

public class JwtResponse {

	private String jwtToke;

	public JwtResponse(String jwtToke) {
		super();
		this.jwtToke = jwtToke;
	}
	
	public JwtResponse() {}
	public String getJwtToke() {
		return jwtToke;
	}

	public void setJwtToke(String jwtToke) {
		this.jwtToke = jwtToke;
	}


}
