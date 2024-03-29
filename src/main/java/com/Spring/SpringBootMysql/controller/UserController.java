package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add_user")
    public User addUser(@RequestBody User user) {
        if (user == null)
            throw new NullPointerException();
        return userService.addUser(user);
    }

    @PutMapping("/update_user/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/delete_user")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }

}
