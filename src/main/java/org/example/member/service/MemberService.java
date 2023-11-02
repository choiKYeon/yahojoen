package org.example.member.service;

import org.example.member.entity.Member;
import org.example.member.repository.MemberRepository;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    public void signService(String userId, String password, String gender){

        memberRepository.signRepository(userId, password, gender);
    }
    public Member findByUserId(String userId){

        return memberRepository.findByUserIdRepository(userId);
    }
}
