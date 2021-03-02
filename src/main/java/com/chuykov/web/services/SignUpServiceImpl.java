package com.chuykov.web.services;

import com.chuykov.web.forms.UserForm;
import com.chuykov.web.models.Authority;
import com.chuykov.web.models.User;
import com.chuykov.web.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void signUp(UserForm userForm) {
        User user = User.builder()
                .email(userForm.getEmail())
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(passwordEncoder.encode(userForm.getPassword()))
                .authority(Authority.USER)
                .build();
        usersRepository.save(user);
    }
}