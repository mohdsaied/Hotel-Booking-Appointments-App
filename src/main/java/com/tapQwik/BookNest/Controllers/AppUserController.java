package com.tapQwik.BookNest.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/AppUser")
public class AppUserController {


    @RequestMapping("/getControl")
    public String HelloController(){
        return "Hello Saied This Code is Proper Working......";
    }
}
