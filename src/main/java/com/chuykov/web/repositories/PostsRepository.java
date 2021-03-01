package com.chuykov.web.repositories;


import com.chuykov.web.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Long> {
    
}
