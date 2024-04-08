package com.example.demo.globalexception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.responsestructure.ResponseStructure;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = EmailNotFoundException.class)
	public ResponseEntity<ApiError> emailNotFound(EmailNotFoundException e)
	{
		ApiError api = new ApiError();
		api.setExceptionClass(e.getClass());
		api.setMessage(e.getMessage());
		api.setTime(LocalDateTime.now());
		
		return new ResponseEntity<>(api,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = WrongPassWordException.class)
	public ResponseEntity<ApiError> wrongPassWord(WrongPassWordException e)
	{
		ApiError api = new ApiError();
		api.setExceptionClass(e.getClass());
		api.setMessage(e.getMessage());
		api.setTime(LocalDateTime.now());
		return new ResponseEntity<> (api,HttpStatus.BAD_REQUEST);
	}
}
