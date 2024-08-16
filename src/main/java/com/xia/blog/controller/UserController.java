package com.xia.blog.controller;

import com.xia.blog.entity.User;
import com.xia.blog.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Resource
    private UserService userService;
    
    @GetMapping("/userinfo")
    public User findById(int id){
        
        return userService.getById(id);
        
    }
}