package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
