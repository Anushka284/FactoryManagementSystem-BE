package com.itp.factory.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.itp.factory.management.domain.Supplier;
import com.itp.factory.management.resource.SupplierAddResource;
import com.itp.factory.management.resource.SupplierUpdateResource;

/**
 * Supplier Service
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   02-09-2020                            Anushka        Created
 *    
 ********************************************************************************************************
 */
@Service
public interface SupplierService {
	
	/**
	 * 
	 * Find all Suppliers
	 * @author Anushka
	 * @return -JSON array of all Category
	 * 
	 * */
	public List<Supplier> getAll();
	
	/**
	 * 
	 * Find Supplier by ID
	 * @author Anushka
	 * @return -JSON array of Category
	 * 
	 * */
	public Optional<Supplier> getById(Long id);
	/**
	 * 
	 * Find Supplier get by contact
	 * @author Anushaka
	 ** @return -JSON array of Supplier
	 * 
	 * */
	public Optional <Supplier> getByContact(String contact);
	
	/**
	 * 
	 * Find Supplier get by email
	 * @author Anushaka
	 ** @return -JSON array of Supplier
	 * 
	 * */
	public Optional<Supplier> getByEmail(String email);
	
	/**
	 * 
	 * Insert Supplier
	 * @author Anushka
	 * @param  - SupplierAddResource
	 * @return - Successfully saved
	 * 
	 * */
	
	public Supplier addSupplier(SupplierAddResource supplierAddResource );
	
	/**
	 * 
	 * Update Supplier
	 * @author Anushka
	 * @param  - SupplierUpdateResource
	 * @return - Successfully saved
	 * 
	 * */
	public Supplier updateSupplier(SupplierUpdateResource supplierUpdateRessource);
	

	/**
	 * 
	 * Delete Supplier
	 * @author MenukaJ
	 * 
	 * */
	public void deleteSupplier(long id);

	

	
	
}
