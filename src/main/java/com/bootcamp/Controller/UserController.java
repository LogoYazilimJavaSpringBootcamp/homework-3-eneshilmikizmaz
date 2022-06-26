package com.bootcamp.Controller;

import com.bootcamp.Model.Customer;
import com.bootcamp.Model.User;
import com.bootcamp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getAllUser(){
        return userService.findAllUsers();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return  userService.deleteUser(id);
    }


}
