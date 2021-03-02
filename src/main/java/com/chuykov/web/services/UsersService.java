package ru.web.services;

import ru.web.models.User;

import java.util.Optional;

public interface UsersService {
    User findUser(String nickname);
}
