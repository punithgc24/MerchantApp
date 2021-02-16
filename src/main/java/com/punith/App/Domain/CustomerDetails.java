package com.punith.App.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="CUSTOMERDETAILS")
public class CustomerDetails {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private long id;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="MOBILENUMBER")
	private int phoneNumber;
	
	@Column(name="ADDRESS")
	private String address;
	
}
