package co.gov.sic.prueba.security.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;

//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxNTY1NDM5NCwiaWF0IjoxNjE1MDQ5NTk0fQ.RSXLHzpJu3c8uQFdddjDLgCbPavxaJv-6c-Y0OkqxYQLRPHcCLmX5krHS5ovUbIcXgpW6eINHkXIeVpgGX5qBg"
//	}
//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxNTc0MDA4MSwiaWF0IjoxNjE1MTM1MjgxfQ.uRZpRP81r71qDYEQ0B3wkaCLUl46BRMV9-G-OOpBkQhR5BD5UMVlJlF8vG9WJbDEx3QaLzemLW_8xuAPrJiU0Q"
//	}
	
	/*
	 1
	{
	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0ZXJTSUMxIiwiZXhwIjoxNjE2MzQ4NzY5LCJpYXQiOjE2MTU3NDM5Njl9.2excL8znqSvISyk0W6YcYyc6KydtmBmqtTPZgWeUN2cfrfV-xKrgAkVUg-9mfeZDGdmawd31AyLWvu82qJfXnw"
	}
	
	2
	{
    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0ZXJTSUMyIiwiZXhwIjoxNjE2MzQ4OTk5LCJpYXQiOjE2MTU3NDQxOTl9.3R7zhfHu5nuvLCoWX1Nhx7jitnwFPmPNQQwhHAi4Y3EegdSvDrUFvcw8co8TUwyZYnG9VPFbbXfQHdlB3DpiQA"
	}
	
	3
	{
    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0ZXJTSUMzIiwiZXhwIjoxNjE2MzQ5MDMxLCJpYXQiOjE2MTU3NDQyMzF9.1vL6o_uhKnvroz697DSyrer6DqXL8gv3CEIQQtVXHKzYogr78HYU5c5ZpqsjeZBBt9EMaIj4GQ8WuktGH_rLog"
	}
	*/
		
	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
