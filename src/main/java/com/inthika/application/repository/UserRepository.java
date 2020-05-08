package com.inthika.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inthika.application.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
