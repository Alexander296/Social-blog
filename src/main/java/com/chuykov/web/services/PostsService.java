package ru.web.services;

import ru.web.models.Post;

import java.util.List;

public interface PostsService {
    void addPost(Post post);
    List<Post> findAllPosts();
}
