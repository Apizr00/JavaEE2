package com.Spring.SpringBootMysql.repository;

import com.Spring.SpringBootMysql.model.UserProfiles;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepo extends CrudRepository<UserProfiles, Long> {

}
