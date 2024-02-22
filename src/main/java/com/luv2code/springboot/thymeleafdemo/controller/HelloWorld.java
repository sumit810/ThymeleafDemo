package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloUI";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){
        //fetch studentName from the HTML form
        String studentName = request.getParameter("studentName");
        String theStudent = studentName.toLowerCase();
        String result = "Hello!"  +theStudent;
        model.addAttribute("message", result);
        return "helloworld";
    }
}
