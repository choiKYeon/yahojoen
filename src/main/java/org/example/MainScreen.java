package org.example;

import org.example.member.controller.MemberController;

public class MainScreen {
    MemberController memberController = new MemberController();
    Area area = new Area();
    public void mainSelect(){
        while (true) {
            System.out.println("\n○●○● YAHO의 메인화면 입니다. ●○●○");
            System.out.println("\n 1.지역선택 / 2.로그아웃");
            System.out.print("입력 :");
            String command2 = Container.getSc().nextLine().trim();

            switch (command2) {
                case "지역선택":
                    area.areaSelcet();
                    break;
                case "로그아웃":
                    memberController.getlogout();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}
