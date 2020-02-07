package org.personal.yk.MyBlog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("login")
    public Map<String,Object> login(String username, String password){
        Map<String,Object> result = new HashMap<>();
        result.put("status","ok");
        return result;
    }

}
