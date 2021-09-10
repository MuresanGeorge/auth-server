//package com.gekko.amsboauth.controller;
//
//import com.gekko.amsboauth.model.User;
//import com.gekko.amsboauth.service.UserService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    private UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping
//    public ResponseEntity<User> add(@RequestBody User user) {
//        User userToBeCreated = userService.add(user);
//        return new ResponseEntity<>(userToBeCreated, HttpStatus.CREATED);
//    }
//}
