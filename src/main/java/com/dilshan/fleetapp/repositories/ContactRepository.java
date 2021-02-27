package com.dilshan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.fleetapp.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
