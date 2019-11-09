package com.heima.leyou.web.controller;

import com.heima.leyou.mapper.UserMapper;
import com.heima.leyou.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("findAll")
    public String findAll(ModelMap modelMap){
        List<User> users = userMapper.selectAll();
        modelMap.addAttribute("users", users);
        return "users";
    }
}
