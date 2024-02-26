package com.Spring.SpringBootMysql.Service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.Spring.SpringBootMysql.model.Permission;

@Service()
public interface PermissionService {

    Permission addPermission(Permission permission);

    Iterable<Permission> getAllPermissions();

    Optional<Permission> getPermissionById(Long id);

    Permission updateNameById(Long id, String name);

    String deletePermissionById(Long id);

}