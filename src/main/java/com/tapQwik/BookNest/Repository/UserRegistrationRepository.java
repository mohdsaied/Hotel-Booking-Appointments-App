package com.tapQwik.BookNest.Repository;

import com.tapQwik.BookNest.EntityClasses.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {
}