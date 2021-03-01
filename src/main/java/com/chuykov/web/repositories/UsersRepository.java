package com.chuykov.web.repositories;


import com.chuykov.web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {

}
