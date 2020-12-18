package com.itp.factory.management.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.itp.factory.management.core.BaseEntity;

import lombok.Data;
/**
 * Supplier Domain
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   06-09-2020                            Anushka        Created
 *    
 ********************************************************************************************************
 */


@Entity
@Data
@Table(name = "supplier")
public class Supplier extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0000000000001;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date")
	private Timestamp date;
	
	

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	
		
}
