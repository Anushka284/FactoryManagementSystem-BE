package com.itp.factory.management.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import lombok.Data;
/**
 * DeliveryInfo Domain
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
@Table(name = "deliveryinfo")
public class DeliveryInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "common_generator")
	@SequenceGenerator(name = "common_generator", sequenceName = "common_seq", allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false)
	protected Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "vehicleNo")
	private String vehicleNo;
	
	@Column(name = "loadingPlace")
	private String loadingPlace;
	
	@Column(name = "deliveryDate")
	private Timestamp deliveryDate;
	
	@Column(name = "materials")
	private String materials;
	
	@Column(name = "qty")
	private String qty;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "rate")
	private String rate;
	
	@Column(name = "remarks")
	private String remarks;
	
	

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

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getLoadingPlace() {
		return loadingPlace;
	}

	public void setLoadingPlace(String loadingPlace) {
		this.loadingPlace = loadingPlace;
	}

	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	
	
	
	
	


	
	
	
	
	
	
}
