package com.tapQwik.BookNest.Controllers;


import com.tapQwik.BookNest.DTOs.UserRegistrationDTO;
import com.tapQwik.BookNest.EntityClasses.UserRegistration;
import com.tapQwik.BookNest.ServiceImpl.UserRegistrationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/AppUser")
public class AppUserController {


    private UserRegistrationImpl userRegistrationImpl;

    public AppUserController(UserRegistrationImpl userRegistrationImpl) {
        this.userRegistrationImpl = userRegistrationImpl;
    }


    @PostMapping("/UserRegistration")
    public ResponseEntity<?> LoginAsUser(@RequestBody UserRegistrationDTO dto){
        UserRegistration userRegistration = userRegistrationImpl.registrationUser(dto);
        return new ResponseEntity<>(userRegistration, HttpStatus.OK);
    }
}
