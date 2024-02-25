package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.UserProfiles;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface UserProfilesService {

    Iterable<UserProfiles> getAllUsers();

    Optional<UserProfiles> getUserById(Long id);

    UserProfiles addUser(UserProfiles userProfile);

    void deleteUser(Long id);

    void updatedUser(Long id, UserProfiles updatedUserProfile);

}
