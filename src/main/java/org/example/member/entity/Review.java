package org.example.member.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
    private long id;
    private String content;
    private String title;
    public Review(long id, String content, String title){
        this.id = id;
        this.content = content;
        this.title = title;
    }
}