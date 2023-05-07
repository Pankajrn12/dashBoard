package com.Blackcoffer.blackcoffer.repositories;

import com.Blackcoffer.blackcoffer.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
