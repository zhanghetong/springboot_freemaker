package com.example.springboot_freemaker.controller;

import com.example.springboot_freemaker.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hetong.zhang
 * @version 1.0
 * @date 2021/2/7
 */
@Controller
public class TestController {
    @RequestMapping("test")
    public String openUserList(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(User.builder().id(1).name("张三").age(15).build());
        userList.add(User.builder().id(2).name("李四").age(18).build());
        System.out.println(userList);
        model.addAttribute("userList", userList);
        return "test";
    }
}
