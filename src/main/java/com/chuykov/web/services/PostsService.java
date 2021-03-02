package com.chuykov.web.services;

import com.chuykov.web.models.Post;

import java.util.List;

public interface PostsService {
    void addPost(Post post);
    List<Post> findAllPosts();
}
