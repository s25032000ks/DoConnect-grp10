package com.grp10.doconnect.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
    @NotBlank(message = "Username is required")
	private String username;
	@Email
    @NotBlank(message = "Username is required")
	private String email;
    @NotBlank(message = "Password is required")
	private String password;
    @NotBlank(message = "Name is required")
	private String name;
}
