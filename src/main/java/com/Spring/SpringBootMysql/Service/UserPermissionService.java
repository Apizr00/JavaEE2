package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.UserPermission;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service()
public interface UserPermissionService {

    Optional<UserPermission> getUserPermissionByUserId(Long id);

}
