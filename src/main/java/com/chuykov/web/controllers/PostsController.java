package com.chuykov.web.controllers;

import com.chuykov.web.models.Post;
import com.chuykov.web.models.User;
import com.chuykov.web.security.details.UsersDetailsImpl;
import com.chuykov.web.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts")
    public String getPostsPage(@AuthenticationPrincipal UsersDetailsImpl usersDetails, Model model){
        User user = usersDetails.getUser();
        System.out.println(user);
        List<Post> posts = postsService.findAllPosts();
        model.addAttribute("posts", posts);
        return "posts_page";
    }

    @PostMapping("/addPosts")
    public String addPost(@RequestParam("text") String text){
        Post post = new Post(text);
        postsService.addPost(post);
        return "redirect:/posts";
    }
}
