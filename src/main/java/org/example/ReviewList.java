package org.example;

import org.example.member.controller.ReviewController;

public class ReviewList {
    ReviewController reviewController = new ReviewController();
    public void reviewSelect(){
        while (true){
            System.out.println("\n == 리뷰 창 입니다. ==");
            System.out.println("\n 1.전체리뷰 / 2.나의리뷰 / 3.리뷰수정 / 4.리뷰삭제");
            System.out.print("입력 :");
            String commandReview = Container.getSc().nextLine().trim();
            Request request = new Request(commandReview);
            switch (commandReview){
                case "전체리뷰":
                    reviewController.fullReview();
                    break;
                case "나의리뷰":
                    reviewController.myReview();
                    break;
                case "리뷰수정":
                    reviewController.modify(request);
                    break;
                case "리뷰삭제":
                    reviewController.remove(request);
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}