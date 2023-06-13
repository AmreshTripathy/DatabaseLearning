package com.example.DatabaseLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Amresh Tripathy
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User saved successfully";
    }

    public User getUserById(Integer userId) {
        User user;
        try {
            user = userRepository.findById(userId).get();
            return user;
        } catch (Exception ex) {
            System.out.println("We got an exception." + ex.getMessage());
            return null;
        }
    }
}
