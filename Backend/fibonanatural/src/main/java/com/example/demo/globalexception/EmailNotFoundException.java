package com.example.demo.globalexception;

public class EmailNotFoundException  extends RuntimeException{

	@Override
	public String getMessage()
	{
		return "Wrong PassWord";
	}
}
