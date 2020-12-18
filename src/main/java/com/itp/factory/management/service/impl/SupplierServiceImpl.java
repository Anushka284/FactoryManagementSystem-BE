package com.itp.factory.management.service.impl;

import java.util.Calendar;

/**
 * Supplier Service Implementation
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   07-09-2020                            Anushka        Created
 *    
 ********************************************************************************************************
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.itp.factory.management.base.MessagePropertyBase;
import com.itp.factory.management.core.LogginAuthentcation;
import com.itp.factory.management.domain.Supplier;
import com.itp.factory.management.exception.ValidateRecordException;
import com.itp.factory.management.repository.SupplierRepository;
import com.itp.factory.management.resource.SupplierAddResource;
import com.itp.factory.management.resource.SupplierUpdateResource;
import com.itp.factory.management.service.SupplierService;
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

@Component
@Transactional(rollbackFor=Exception.class)
public class SupplierServiceImpl extends MessagePropertyBase implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Override
	public List<Supplier> getAll() {
		return supplierRepository.findAll();
	}

	@Override
	public Optional<Supplier> getById(Long id) {
		
		Optional<Supplier> currentSupplier = supplierRepository.findById(id);
		if (currentSupplier.isPresent()) {
			return currentSupplier;
		}
		else {
			return Optional.empty();
		}
	}

	@Override
	public Optional<Supplier> getByContact(String contact) {
		
		Optional<Supplier> isSupplier = supplierRepository.findByContact(contact);
		if (isSupplier.isPresent()) {
			return Optional.ofNullable(isSupplier.get());
		}
		else {
			return Optional.empty();
		}
	}
	@Override
	public Optional<Supplier> getByEmail(String email) {
		
		Optional<Supplier> isSupplier = supplierRepository.findByContact(email);
		if (isSupplier.isPresent()) {
			return Optional.ofNullable(isSupplier.get());
		}
		else {
			return Optional.empty();
		}
	}

	@Override
	public Supplier addSupplier(SupplierAddResource supplierAddResource) {
		Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
      
        
        Optional<Supplier> isPresentSupplier = supplierRepository.findByContact(supplierAddResource.getContact());
        if (isPresentSupplier.isPresent()) {
        	throw new ValidateRecordException(environment.getProperty("common.unique"), "contact");
		}
        																														
        Supplier supplier = new Supplier();       
        supplier.setName(supplierAddResource.getName());   
        supplier.setContact(supplierAddResource.getContact());
        supplier.setEmail(supplierAddResource.getEmail());
        supplier.setAddress(supplierAddResource.getAddress());
        supplier.setDate(currentTimestamp);
        supplier = supplierRepository.save(supplier);
    	return supplier;
	}
	
	

	@Override
	public Supplier updateSupplier(SupplierUpdateResource supplierUpdateResource) {

		
		Optional<Supplier> isSupplier = supplierRepository.findById(Long.parseLong(supplierUpdateResource.getId()));
		if (!isSupplier.isPresent()) 
			throw new ValidateRecordException(getEnvironment().getProperty(RECORD_NOT_FOUND), "message");
		
		if(!isSupplier.get().getVersion().equals(Long.parseLong(supplierUpdateResource.getVersion())))
			throw new ValidateRecordException(environment.getProperty("common.invalid-value"), "version");
		
		Optional<Supplier> isSupplierName = supplierRepository.findByName(supplierUpdateResource.getName());
		if (isSupplierName.isPresent() && isSupplierName.get().getId() != isSupplierName.get().getId())			
			throw new ValidateRecordException(environment.getProperty("common.unique"), "name");
		
		Supplier supplier = isSupplier.get();
		supplier.setName(supplierUpdateResource.getName());
		supplier.setAddress(supplierUpdateResource.getAddress());
		supplier.setContact(supplierUpdateResource.getContact());
		supplier = supplierRepository.saveAndFlush(supplier);
		return supplier;
	}

	@Override
	public void deleteSupplier(long id) {
		Optional<Supplier> isSupplier = supplierRepository.findById(id);
		if (!isSupplier.isPresent()) 
			throw new ValidateRecordException(getEnvironment().getProperty(RECORD_NOT_FOUND), "message");
		else
			supplierRepository.deleteById(id);
		
	}

	
}
