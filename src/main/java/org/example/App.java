package org.example;

import org.example.DB.DBConnection;
import org.example.entity.Container;
import org.example.entity.DefaultCommand;
import org.example.member.controller.MemberController;

public class App {
    public App() {
        DBConnection.DB_NAME = "proj1";
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";
        DBConnection.DB_PORT = 3306;

        Container.getDBconnection().connect();
    }

    MemberController memberController = new MemberController();

    public void run() {

        while (true) {
            System.out.println("\n○●○● YAHO에 오신걸 환영합니다. ●○●○");
            System.out.println("\n== 로그인을 진행해주세요. (계정이 없다면 회원가입을 진행해주세요.) ==");
            System.out.println("\n1.로그인 / 2.회원가입 / 3.로그아웃 / 4.종료");
            System.out.print("입력 :");
            String command = Container.getSc().nextLine().trim();

            switch (command) {
                case "종료":
                    System.out.println("== 프로그램을 종료합니다. ==");
                    return;
                case "로그인":
                    memberController.login();
                    break;
                case "회원가입":
                    memberController.sign();
                    break;
                case "로그아웃":
                    memberController.getlogout();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    break;
            }
        }
    }
}
