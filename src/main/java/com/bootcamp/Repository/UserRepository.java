package com.bootcamp.Repository;

import com.bootcamp.Model.Customer;
import com.bootcamp.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository {
    private static List<User> userList = new ArrayList<>();
    public List<User> findAll() {
        return userList;
    }

    public String save(User user) {
        userList.add(user);
        return user + " kaydedildi.";
    }

    public User findById(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElseThrow();
    }

    public String update(User user) {
        User oldUser = findById(user.getId());
        oldUser.setName(user.getName());
        oldUser.setSurname(user.getSurname());
        oldUser.setEmail(user.getEmail());
        oldUser.setAddress(user.getAddress());
        oldUser.setPassword(user.getPassword());
        oldUser.setFirmType(user.getFirmType());
        return user.getId() + " ID li user'a ait bilgiler güncellendi.";
    }

    public String delete(int id) {
        userList.remove(findById(id));
        return id + " ID li customer silindi";
    }

}
