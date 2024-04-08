package com.example.demo.globalexception;

public class WrongPassWordException extends RuntimeException {

	@Override
	public String getMessage()
	{
		return "Invalid PassWord";
	}
}

