package com.tapQwik.BookNest.ServiceImpl;

import com.tapQwik.BookNest.DTOs.UserRegistrationDTO;
import com.tapQwik.BookNest.EntityClasses.UserRegistration;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRegistrationImpl {

    public UserRegistration registrationUser(UserRegistrationDTO dto);

}
