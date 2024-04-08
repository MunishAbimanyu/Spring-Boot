package com.example.demo.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class FibonaOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String name;
	@NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid email address")
	private String email;
	private String mobile;
	private String address;
	private String product;
	private int quantity;

}
