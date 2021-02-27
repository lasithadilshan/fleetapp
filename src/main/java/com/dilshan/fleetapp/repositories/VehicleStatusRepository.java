package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.VehicleStatus;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
