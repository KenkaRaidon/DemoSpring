package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView= new ModelAndView();
        String demo="asasasaa";
        modelAndView.addObject("demo", demo);
        return modelAndView;
    }
}
