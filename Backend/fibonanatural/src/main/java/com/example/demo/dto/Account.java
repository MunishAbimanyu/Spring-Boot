package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accId;
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	@Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "Invalid email format")
	private String email;
	 @Pattern(regexp = "\\d{10,}", message = "Invalid mobile number format")
	private String mobile;
	 @NotEmpty(message = "password Cannot be empty")
	 private String password;
	 @NotEmpty(message = "password cannot be empty")
	 private String repassword;
	 
	 
	
}
