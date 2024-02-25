package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.UserProfilesService;
import com.Spring.SpringBootMysql.model.UserProfiles;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Controller
public class UserProfileController {

    @Autowired
    UserProfilesService userProfilesService;

    @GetMapping("/userprofile")
    public Iterable<UserProfiles> getAllUsers() {
        return userProfilesService.getAllUsers();
    }

    @GetMapping("/userprofile/{id}")
    public Optional<UserProfiles> getUserById(@PathVariable Long id) {
        return userProfilesService.getUserById(id);
    }

    @PostMapping("/add_userprofile")
    public UserProfiles addUser(@RequestBody UserProfiles userProfile) {
        return userProfilesService.addUser(userProfile);
    }

    @PutMapping("/update_userprofile/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserProfiles updatedUserpProfiles) {
        userProfilesService.updatedUser(id, updatedUserpProfiles);
    }

    @DeleteMapping("/delete_userprofile")
    public void deleteUser(@RequestParam Long id) {
        userProfilesService.deleteUser(id);
    }

}
