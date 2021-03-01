package com.chuykov.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 3000)
    private String text;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    public Post(String text, User user) {
        this.text = text;
        this.author = user;
    }

}
