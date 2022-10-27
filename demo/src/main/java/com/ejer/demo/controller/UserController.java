package com.ejer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejer.demo.dto.UserDto;
import com.ejer.demo.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Userservice userService;

    @PostMapping
    public ResponseEntity<UserDto> newUser(@RequestBody UserDto userDto){
        UserDto uDto = userService.newUser(userDto);
        return ResponseEntity.ok(uDto);
    }
}
