package org.example.member.repository;

import org.example.DB.DBConnection;
import org.example.Util.Util;
import org.example.entity.Container;
import org.example.member.entity.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MemberRepository {
    List<Member> members = new ArrayList<>();
    private DBConnection dbConnection;
    public MemberRepository(){
        dbConnection = Container.getDBconnection();
//        Member member1 = new Member(1, "경현잉", "11","남자",  Util.nowDateTime());
//        members.add(member1);
//        Member member2 = new Member(2, "병근잉", "11","남자",  Util.nowDateTime());
//        members.add(member2);
//        Member member3 = new Member(3, "조은잉", "11","여자",  Util.nowDateTime());
//        members.add(member3);

    }
    public String signRepository(String userId, String password, String gender){

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("INSERT INTO `member`"));
        sb.append(String.format("SET nowDateTime = NOW(), "));
        sb.append(String.format("userId = '%s', ", userId));
        sb.append(String.format("`password` = '%s', ", password));
        sb.append(String.format("gender = '%s' ", gender));
        int id = dbConnection.insert(sb.toString());

        Member member = new Member(id, userId, password, gender, Util.nowDateTime());
        members.add(member);

        return member.getUserId();
    }
    public Member findByUserIdRepository(String userId){

        String sql = "SELECT * FROM `member`";
        List<Map<String, Object>> rows = dbConnection.selectRows(sql);

        for (Map<String, Object> row : rows){
            members.add(new Member(row));
        }

        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            if (member.getUserId().equals(userId)) {
                return member;
            }
        }
        return null;
    }
}