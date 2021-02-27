package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
