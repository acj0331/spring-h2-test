package com.score.oss.conversions.middleware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.score.oss.conversions.middleware.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    @Query(nativeQuery = true, value = "select * from user where user_id='admin'")
    public User findAdmin();
}
