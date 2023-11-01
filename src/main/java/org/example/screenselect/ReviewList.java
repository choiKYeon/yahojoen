package org.example.screenselect;

import org.example.entity.Container;
import org.example.entity.DefaultCommand;
import org.example.review.controller.ReviewController;

public class ReviewList {
    ReviewController reviewController = new ReviewController();
    public void reviewSelect(){
        MainScreen mainScreen = new MainScreen();

        while (true){
            System.out.println("\n == 리뷰 창 입니다. ==");
            System.out.println("\n 1.전체리뷰 / 2.나의리뷰 / 3.리뷰수정 / 4.리뷰삭제 / 5.메인화면");
            System.out.print("입력 :");
            String commandReview = Container.getSc().nextLine().trim();

            switch (commandReview){
                case "전체리뷰":
                    reviewController.fullReview();
                    break;
                case "나의리뷰":
                    reviewController.myReview();
                    break;
                case "리뷰수정":
                    reviewController.modify();
                    break;
                case "리뷰삭제":
                    reviewController.remove();
                    break;
                case "메인화면":
                    mainScreen.mainSelect();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}
