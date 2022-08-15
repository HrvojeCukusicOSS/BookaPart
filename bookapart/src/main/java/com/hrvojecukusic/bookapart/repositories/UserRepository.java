package com.hrvojecukusic.bookapart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrvojecukusic.bookapart.models.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	public List<UserEntity> findByRole(String role);
}
