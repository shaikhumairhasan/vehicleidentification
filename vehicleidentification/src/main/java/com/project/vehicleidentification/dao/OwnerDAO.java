package com.project.vehicleidentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.vehicleidentification.entity.Owner;

public interface OwnerDAO extends JpaRepository<Owner, String>{

}
