package com.chuykov.web.repositories;


import com.chuykov.web.models.Post;
import com.chuykov.web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByAuthorId(Long id);
}
