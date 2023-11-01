package org.example.screenselect;

import org.example.entity.Container;
import org.example.entity.DefaultCommand;
import org.example.review.controller.ReviewController;

public class Answer {

    ReviewController reviewController = new ReviewController();
    public void review() {
        MainScreen mainScreen = new MainScreen();

        while (true) {
            System.out.println("\n리뷰를 작성하시겠습니까?");
            System.out.println("\n1.네 2.아니요");
            System.out.print("입력 :");
            String commandAnswer = Container.getSc().nextLine().trim();

            switch (commandAnswer){
                case "네":
                    reviewController.write();
                    break;
                case "아니요":
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
