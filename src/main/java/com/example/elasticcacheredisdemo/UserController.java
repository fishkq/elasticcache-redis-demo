package com.example.elasticcacheredisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/search")
    public String queryUser(Integer id) {
        redisUtil.set("aaa", "111");
        String user = redisUtil.get("aaa");
        redisUtil.delete("aaa");
        return user;
    }
}
