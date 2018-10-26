package com.zxelec.springboot_listener_filter_interceptor.controller;

import com.zxelec.springboot_listener_filter_interceptor.exceptor.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class LoginController {

    Map<String,Object> mapResult = new HashMap<>();

    @RequestMapping("login")
    public Object login(@RequestParam(value = "name")String name,
                        @RequestParam(value = "password")String password){

        mapResult.put("name",name);
        mapResult.put("password",password);

        System.out.println("process -----------> loginController");

        //throw new MyException(100,"MyException",mapResult);
        return mapResult;
    }
}