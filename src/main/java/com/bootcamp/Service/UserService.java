package com.bootcamp.Service;

import com.bootcamp.Model.User;
import com.bootcamp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public String create(User user) {
        return userRepository.save(user);
    }

    public String updateUser(User user) {
        return userRepository.update(user);
    }

    public String deleteUser(int id) {
        return userRepository.delete(id);
    }
}
