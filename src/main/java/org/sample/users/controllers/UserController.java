package org.sample.users.controllers;

import org.sample.users.entidades.User;
import org.sample.users.repository.UserRepository;
import org.sample.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> listUsers = userService.getAllUsers();
        return listUsers;
    }
}
