package com.chuykov.web.services;

import com.chuykov.web.models.Post;
import com.chuykov.web.models.User;

import java.util.List;

public interface PostsService {
    void addPost(Post post);
    List<Post> findAllPosts();
    List<Post> findAllPostByUser(User user);
}
