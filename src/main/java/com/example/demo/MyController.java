package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MyController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/{place}")
    public static String welcome(HttpServletRequest request, Model model, @PathVariable(value = "place") String place) {
        String demo="asasasaa";
        model.addAttribute("user", demo);
        return place;
    }
}
