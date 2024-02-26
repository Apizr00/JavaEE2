package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Spring.SpringBootMysql.Service.PermissionService;
import com.Spring.SpringBootMysql.model.Permission;
import com.Spring.SpringBootMysql.repository.PermissionRepo;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionRepo permissionRepo;

    @Override
    public Permission addPermission(Permission permission) {
        return permissionRepo.save(permission);
    }

    @Override
    public Iterable<Permission> getAllPermissions() {
        return permissionRepo.findAll();
    }

    @Override
    public Optional<Permission> getPermissionById(Long id) {
        return permissionRepo.findById(id);
    }

    @Override
    public Permission updateNameById(Long id, String name) {
        Optional<Permission> permissionToUpdateOptional = permissionRepo.findById(id);
        if (permissionToUpdateOptional.isPresent()) {
            Permission permissionToUpdate = permissionToUpdateOptional.get();
            permissionToUpdate.setName(name);
            return permissionRepo.save(permissionToUpdate);
        }
        return null;
    }

    @Override
    public String deletePermissionById(Long id) {
        Optional<Permission> permissionToDeleteOptional = permissionRepo.findById(id);
        if (permissionToDeleteOptional.isPresent()) {
            Permission permissionToDelete = permissionToDeleteOptional.get();
            permissionRepo.delete(permissionToDelete);
            return String.format("Permission with id %d successfully deleted!", permissionToDelete.getId());
        }
        return String.format("Permission not found!");
    }

}