package com.jtongay.kitchenmanager.controller;

import com.jtongay.kitchenmanager.model.UserModel;
import com.jtongay.kitchenmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
//    @Autowired
//    private UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/")
    @ResponseBody
    public Object getUsers() {
        return "1";
    }
}
