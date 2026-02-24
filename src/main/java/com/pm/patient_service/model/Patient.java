package com.pm.patient_service.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patient {

	@Id
	@GeneratedValue()
	private UUID id;
	
	@NotNull(message = "Patient name cannot be null.")
	private String name;
	
	@NotNull(message = "Patient email cannot be null.")
	@Email
	@Column(unique = true)
	private String email;
	
	@NotNull(message = "Patient address cannot be null.")
	private String address;

	@NotNull(message = "Patient date of birth cannot be null.")
	private LocalDate dateOfBirth;

	@NotNull(message = "Patient registration date cannot be null.")
	private LocalDate registeredDate;
}
