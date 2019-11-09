package com.heima.leyou.web.controller;

import com.heima.leyou.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestController {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("test")
    public String test(){
        User user = new User();
        
        return "hello spring boot!";
    }
}
