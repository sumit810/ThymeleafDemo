package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;
    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> operatingSystems;

    @GetMapping("/showStudentForm")
    public String getStudentFormDetails(Model theModel){
        //create a student object
        Student theStudent = new Student();
        //add student object to the model
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("countries",countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("systems", operatingSystems);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) {
            return "student-form";
        } else {
            return "student-confirmation";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
}
