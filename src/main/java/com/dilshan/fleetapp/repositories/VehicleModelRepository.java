package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
