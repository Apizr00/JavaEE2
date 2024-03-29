package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import com.Spring.SpringBootMysql.Service.UserPermissionService;
import com.Spring.SpringBootMysql.model.UserPermission;

@RestController
@RequestMapping("/user_permissions")
@Controller
public class UserPermissionController {

    @Autowired
    UserPermissionService userPermissionService;

    @GetMapping("/{id}")
    public Optional<UserPermission> getUserPermissionByUserId(@PathVariable Long id) {
        return userPermissionService.getUserPermissionByUserId(id);
    }

}
