package org.example.member.entity;

import jdk.jshell.execution.Util;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Member {
    private int id;
    private String userId;
    private String password;
    private String gender;
    private Util nowDateTime;

    public Member(int id, String userId, String password, String gender, String nowDateTime) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.gender = gender;
    }

//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
}
