package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Environment environment;

    @RequestMapping("getName")
    public String getName(){
        return "你好！"+environment.getProperty("url");
    }
}
