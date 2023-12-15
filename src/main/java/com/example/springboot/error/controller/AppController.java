package com.example.springboot.error.controller;

import com.example.springboot.error.domain.User;
import com.example.springboot.error.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        // Integer value = 100/0;
        Integer value = Integer.parseInt("10xxaaas");
        return "index";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable("id")Integer id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "Detail user ".concat(user.getName()));
        return "ver";
    }
}
