package com.globallogic.manager.repository;

import com.globallogic.manager.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT t FROM UserEntity t WHERE t.email = ?1 ")
    UserEntity findByEmail(String email);
}
