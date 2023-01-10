package com.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo1.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
