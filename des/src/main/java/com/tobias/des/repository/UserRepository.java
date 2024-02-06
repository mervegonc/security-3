package com.tobias.des.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobias.des.entitiy.User;

public interface UserRepository extends JpaRepository<User, Long> {

//	Object findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail2);
	Optional<User> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail2);

	// Optional<User> findByUsernameOrEmail(String usernameOrEmail);

}
