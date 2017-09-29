package com.idreamon.mymoney.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idreamon.mymoney.web.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}
