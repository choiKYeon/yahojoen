package org.example.member.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Member {
    private long id;
    private String userId;
    private String password;
    public  Member(long id, String userId, String password){
        this.id = id;
        this.userId = userId;
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
