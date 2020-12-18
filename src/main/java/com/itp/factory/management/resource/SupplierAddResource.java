package com.itp.factory.management.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Supplier Add Resource
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   05-09-2020                            Anushka        Created
 *    
 ********************************************************************************************************
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SupplierAddResource {
	
	@NotBlank(message = "{common.not-null}")
	@Size(max = 90, message = "{common-name.size}")
	private String name;
	

	private String address;
	
	@NotBlank(message = "{common.not-null}")
	@Size(max = 90, message = "{common-name.size}")
	private String contact;
	
	@NotBlank(message = "{common.not-null}")
	@Size(max = 90, message = "{common-email.size}")
	private String email;
	
	private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}



	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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
	
	
	
}
