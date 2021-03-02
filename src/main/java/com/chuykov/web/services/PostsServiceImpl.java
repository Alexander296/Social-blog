package com.chuykov.web.services;


import com.chuykov.web.models.Post;
import com.chuykov.web.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Override
    public void addPost(Post post) {
        postsRepository.save(post);
    }

    @Override
    public List<Post> findAllPosts() {
        return postsRepository.findAll();
    }
}
