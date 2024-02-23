package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.User;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service()
public interface UserService {

    Iterable<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User addUser(User user);

    void deleteUser(Long id);

}
