package com.itp.factory.management.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.itp.factory.management.domain.DeliveryInfo;
import com.itp.factory.management.resource.DeliveryInfoAddResource;

import net.sf.jasperreports.engine.JRException;
/**
 * Delivery Info Service
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   05-09-2020          					Anushka     Created
 *    
 ********************************************************************************************************
 */
@Service
public interface DeliveryInfoService {

	/**
	 * 
	 * Find all Deliveries
	 * @author Anushka
	 * @return -JSON array of all Category
	 * 
	 * */
	
	public List<DeliveryInfo> getAll();
	
	/**
	 * 
	 * Find Deliveries by Id
	 * @author Anushka
	 * @return -JSON array of all Category
	 * 
	 * */
	public Optional<DeliveryInfo> getById(Long id);
	

	/**
	 * 
	 * Add Delivery Information
	 * @author Anushka
	 * @param  - DeliveryInfoAddResource
	 * @return - Successfully saved
	 * 
	 * */
	public DeliveryInfo addDelivery(DeliveryInfoAddResource deliveryInfoAddResource );
	
	

	
	/**
	 * 
	 * Delete Supplier
	 * @author MenukaJ
	 * 
	 * */
	public void deleteDelivery(long id);
	
	
	/**
	 * 
	 * Generate Delivery Report
	 * @author Anushka
	 * @param  - DeliveryInfoAddResource
	 * @return - reportFormat
	 * @throws FileNotFoundException 
	 * @throws JRException 
	 * 
	 * */
	
	
	public String exportReport(String reportFormat) throws FileNotFoundException, JRException;



	
	
	
}
