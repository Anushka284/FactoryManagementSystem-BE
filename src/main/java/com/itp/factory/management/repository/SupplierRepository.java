package com.itp.factory.management.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.itp.factory.management.domain.Supplier;

/**
 * Supplier Repository
 * 
 ********************************************************************************************************
 *  ###   Date         Story Point   Task No    Author       Description
 *-------------------------------------------------------------------------------------------------------
 *    1   06-09-2020                            Anushka        Created
 *    
 ********************************************************************************************************
 */

@Repository
public interface SupplierRepository extends JpaRepository<Supplier ,Long> {
		

	Optional<Supplier> findByName(String name);
	
	Optional<Supplier> findById(Long id);

	Optional <Supplier> findByNameAndId(String name, Long id);

	Optional<Supplier> findByContact(String contact);
	
	Optional<Supplier> findByEmail(String email);
	

}
