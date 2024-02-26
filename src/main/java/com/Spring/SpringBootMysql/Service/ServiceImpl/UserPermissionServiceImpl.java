package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Spring.SpringBootMysql.Service.UserPermissionService;
import com.Spring.SpringBootMysql.model.UserPermission;
import com.Spring.SpringBootMysql.repository.UserPermissionRepo;

@Service
@Transactional
public class UserPermissionServiceImpl implements UserPermissionService {

    @Autowired
    UserPermissionRepo userPermissionRepo;

    @Override
    public Optional<UserPermission> getUserPermissionByUserId(Long id) {
        return userPermissionRepo.findByUserId(id);
    }

}
