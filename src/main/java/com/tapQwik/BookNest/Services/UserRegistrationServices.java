package com.tapQwik.BookNest.Services;


import com.tapQwik.BookNest.DTOs.UserRegistrationDTO;
import com.tapQwik.BookNest.EntityClasses.UserRegistration;
import com.tapQwik.BookNest.Repository.UserRegistrationRepository;
import com.tapQwik.BookNest.ServiceImpl.UserRegistrationImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserRegistrationServices implements UserRegistrationImpl {


    private UserRegistrationRepository repository;

    public UserRegistrationServices(UserRegistrationRepository repository) {
        this.repository = repository;
    }


    @Override
    public UserRegistration registrationUser(@RequestBody UserRegistrationDTO dto){

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setName(dto.getName());
        userRegistration.setUserName(dto.getUserName());
        userRegistration.setEmailId(dto.getEmailId());
        userRegistration.setPassword(dto.getPassword());
        userRegistration.setUserRole(dto.getUserRole());
        UserRegistration save = repository.save(userRegistration);
        return save;
    }

}
