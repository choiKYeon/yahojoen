package org.example.member.entity;

import jdk.jshell.execution.Util;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter

public class Member {
    private int id;
    private String userId;
    private String password;
    private String gender;
    private String nowDateTime;

    public Member(int id, String userId, String password, String gender, String nowDateTime) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.gender = gender;
    }
    public Member(Map<String, Object> row){
        this.id = (int)row.get("id");
        this.userId = (String)row.get("userId");
        this.password = (String)row.get("password");
        this.nowDateTime = (String)row.get("nowDateTime");
    }
}
