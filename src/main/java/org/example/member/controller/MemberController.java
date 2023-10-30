package org.example.member.controller;

import org.example.Container;
import org.example.MainScreen;
import org.example.member.entity.Member;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.Container.*;

public class MemberController {

    public MemberController() {
        if (getCheckedmembers() == null) {
            Member member1 = new Member(1, "홍길동", "1234");
            members.add(member1);
            Member member2 = new Member(2, "홍길순", "12345");
            members.add(member2);
            Member member3 = new Member(3, "임꺽정", "123456");
            members.add(member3);
        }
    }
    List<Member> members = new ArrayList<>();

    // 로그인
    public void login() {

        if (getCheckedmembers() != null) {
            System.out.println("이미 로그인 되어있습니다.");
            return;
        }

        MainScreen mainScreen = new MainScreen();
        boolean userIdcheked = false;
        Member member = null;

        System.out.print("아이디 :");
        String userId = Container.getSc().nextLine().trim();
        System.out.print("비밀번호 :");
        String password = Container.getSc().nextLine().trim();

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getUserId().equals(userId)) {
                member = members.get(i);
                userIdcheked = true;
            }
        }
        if (userIdcheked == false) {
            System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요.");
            return;
        }
        if (member.getPassword().equals(password) == false) {
            System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요.");
            return;
        }

        setCheckedmembers(member);

        System.out.println("로그인 되었습니다." + userId + "님 환영합니다.");
        // MainScreen을 실행하기 위한 코드
        mainScreen.mainSelect();
    }

    // 회원가입
    public void sign() {

        long id = 1;
        String userId;
        String password;
        // 로그인 및 중복된 계정인지 확인하는 구문
        while (true) {
            System.out.print("새로운 아이디 :");
            userId = Container.getSc().nextLine().trim();
            boolean loginchecked = false;

            for (int i = 0; i < members.size(); i++) {
                if (members.get(i).getUserId().equals(userId)) {
                    loginchecked = true;
                }
            }
            if (loginchecked != false) {
                System.out.println("이미 존재하는 아이디 입니다. 다시 입력해주세요.");
                continue;
            }
            break;
        }

        // 비밀번호를 중복되는지 확인하는 구문
        while (true) {
            System.out.print("새로운 비밀번호 :");
            password = Container.getSc().nextLine().trim();
            System.out.print("새로운 비밀번호 확인 :");
            String passwordchecked = Container.getSc().nextLine().trim();
            if (password.equals(passwordchecked)) {
                System.out.println("비밀번호가 입력되었습니다.");
            } else {
                System.out.println("비밀번호가 다릅니다. 다시 압력해주세요.");
                continue;
            }
            break;
        }
        Member member = new Member(id, userId, password);
        members.add(member);
        System.out.println("회원가입이 완료되었습니다. 로그인을 진행해주세요.");
    }

    public static Member getlogout() {
        if (getCheckedmembers() != null) {
            setCheckedmembers(null);
            System.out.println("로그아웃 되었습니다.");
        }
        return null;
    }
}