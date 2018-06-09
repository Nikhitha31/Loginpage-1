package com.login.loginpage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.login.loginpage.controller.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findById(int id);
	

}
