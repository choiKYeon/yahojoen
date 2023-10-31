package org.example.member.entity;

import jdk.jshell.execution.Util;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Member {
    private long id;
    private String userId;
    private String password;
    private Util nowDateTime;
    public  Member(long id, String userId, String password, String nowDateTime){
        this.id = id;
        this.userId = userId;
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
