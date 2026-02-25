package com.pm.patient_service.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
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

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDate getRegisteredDate() {
		return registeredDate;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}
	
}
