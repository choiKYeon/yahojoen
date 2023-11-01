package org.example.member.service;

import jdk.jshell.execution.Util;
import org.example.Utill.Utill;
import org.example.member.entity.Member;
import org.example.member.repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;
public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    public void signService(String userId, String password){
        memberRepository.signRepository(userId, password);
    }
    public Member findByUserId(String userId){
        return memberRepository.findByUserIdRepository(userId);
    }
}
