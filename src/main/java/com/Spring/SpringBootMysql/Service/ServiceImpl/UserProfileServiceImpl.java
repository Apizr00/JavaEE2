package com.Spring.SpringBootMysql.Service.ServiceImpl;

import com.Spring.SpringBootMysql.Service.UserProfilesService;
import com.Spring.SpringBootMysql.model.UserProfiles;
import com.Spring.SpringBootMysql.repository.UserProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserProfileServiceImpl implements UserProfilesService {

    @Autowired
    private UserProfileRepo userProfileRepo;

    @Override
    public Iterable<UserProfiles> getAllUsers() {
        return userProfileRepo.findAll();
    }

    @Override
    public Optional<UserProfiles> getUserById(Long id) {
        return userProfileRepo.findById(id);
    }

    @Override
    public UserProfiles addUser(UserProfiles userProfile) {
        return userProfileRepo.save(userProfile);
    }

    @Override
    public void updatedUser(Long id, UserProfiles updatedUserProfile) {
        Optional<UserProfiles> userToUpdateOptional = userProfileRepo.findById(id);

        if (userToUpdateOptional.isPresent()) {
            UserProfiles userToUpdate = userToUpdateOptional.get();
            userToUpdate.setFirst_Name(updatedUserProfile.getFirst_Name());
            userToUpdate.setLast_Name(updatedUserProfile.getLast_Name());
            userProfileRepo.save(userToUpdate);
        }
    }

    @Override
    public void deleteUser(Long id) {
        Optional<UserProfiles> userProfileToDeleteOptional = userProfileRepo.findById(id);

        if (userProfileToDeleteOptional.isPresent()) {
            UserProfiles userToDelete = userProfileToDeleteOptional.get();
            userProfileRepo.delete(userToDelete);
        }
    }

}
