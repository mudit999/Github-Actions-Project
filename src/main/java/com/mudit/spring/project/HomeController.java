package com.mudit.spring.project;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@Service
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String home(){
        return "Home.html";
    }

    @GetMapping(value = {"/world"})
    public String world(){
        return "World";
    }

    @GetMapping(value = {"/hello"})
//    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @PostMapping("/sample")
    public String samplePost(){
        return "Sample Post";
    }

    @PutMapping("/sample")
    public String samplePost2(){
        return "Sample Post";
    }

}
