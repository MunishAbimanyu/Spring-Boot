package com.example.demo.dto;

import lombok.Data;

@Data
public class Email {

	private String toEmail;
	private String subject;
	private String body;
}
