package org.example;

import org.example.member.controller.MemberController;

public class App {
    MemberController memberController = new MemberController();
    public void run(){

        while (true){
            System.out.println("\n○●○● YAHO에 오신걸 환영합니다. ●○●○");
            System.out.println("\n== 로그인을 진행해주세요. (계정이 없다면 회원가입을 진행해주세요.) ==");
            System.out.println("\n1.로그인 / 2.회원가입 / 3.종료");
            System.out.print("입력 :");
            String command = Container.getSc().nextLine().trim();

            switch (command){
                case "종료":
                    System.out.println("== 프로그램을 종료합니다. ==");
                    return;
                case "로그인":
                    memberController.login();
                    break;
                case "회원가입":
                    memberController.sign();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    break;
            }
        }
    }
}
