package org.example.review.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
    private long id;
    private String content;
    private String title;
    private String userId;
    public Review(long id, String content, String title, String userId){
        this.id = id;
        this.content = content;
        this.title = title;
        this.userId = userId;
    }
}