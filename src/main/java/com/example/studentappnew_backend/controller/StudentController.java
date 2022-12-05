package com.example.studentappnew_backend.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Spring App";
    }

    @GetMapping("/contact")
    public String ContactPage(){
        return "Welcome to contact page";
    }

    @GetMapping("/gallery")
    public String GalleryPage(){
        return "Welcome to Gallery Page";
    }
}
