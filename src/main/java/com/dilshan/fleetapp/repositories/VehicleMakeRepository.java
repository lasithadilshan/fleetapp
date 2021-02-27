package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.VehicleMake;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
