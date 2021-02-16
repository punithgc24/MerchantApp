package com.punith.App.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="CUSTOMERORDER")
public class CustomerOrder implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToMany
	@JoinColumn
	private List<ListOfItems> items=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn
	private CustomerDetails user;
	
	public void addUser(CustomerDetails user) {
		this.user=user;
	}
}
