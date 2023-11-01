package org.example.screenselect;

import org.example.entity.Container;
import org.example.entity.DefaultCommand;
import org.example.member.controller.MemberController;
import org.example.review.controller.ReviewController;

public class MainScreen {
    MemberController memberController = new MemberController();
    ReviewController reviewController = new ReviewController();
    ReviewList reviewList = new ReviewList();
    Area area = new Area();
    public void mainSelect(){
        while (true) {

            System.out.println("\n○●○● YAHO의 메인화면 입니다. ●○●○");
            System.out.println("\n 1.지역선택 / 2.로그아웃 / 3.리뷰목록");
            System.out.print("입력 :");
            String command2 = Container.getSc().nextLine().trim();

            switch (command2) {
                case "지역선택":
                    area.areaSelcet();
                    break;
                case "로그아웃":
                    memberController.getlogout();
                    break;
                case "리뷰목록":
                    reviewList.reviewSelect();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}
