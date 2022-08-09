package com.hrvojecukusic.bookapart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;

@Repository
public interface ApartmentRepository extends JpaRepository<ApartmentEntity, Integer> {

}
