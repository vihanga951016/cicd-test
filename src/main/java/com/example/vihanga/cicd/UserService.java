package com.example.vihanga.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public User addUser() {
        User newUser = User.builder()
                .name("Alex")
                .age(15)
                .build();

        return userRepo.save(newUser);
    }
}
