package com.example.demo.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Fibona {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	@Email
	private String email;
	private String passWord;
	private String rePassWord;
	
}
