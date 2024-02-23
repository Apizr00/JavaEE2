package com.Spring.SpringBootMysql.repository;

import com.Spring.SpringBootMysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
