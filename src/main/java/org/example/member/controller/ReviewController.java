package org.example.member.controller;

import org.example.entity.Container;
import org.example.MainScreen;
import org.example.entity.Request;
import org.example.member.entity.Member;
import org.example.member.entity.Review;

import java.util.ArrayList;
import java.util.List;


public class ReviewController {
    private static List<Review> reviews = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    private static long id = 1;
    private static MainScreen mainScreen = new MainScreen();

    public void write() {

        System.out.println("\n== 리뷰를 작성해주세요. ==");
        System.out.print("제목 :");
        String title = Container.getSc().nextLine().trim();
        System.out.print("내용 :");
        String content = Container.getSc().nextLine().trim();

        String userId = Container.getCheckedmembers().getUserId();
        Review review = new Review(id, title, content, userId);
        reviews.add(review);

        System.out.println(Container.getCheckedmembers().getUserId() + "님의 리뷰가 작성되었습니다.");
        id++;
        mainScreen.mainSelect();
    }

    public void fullReview() {
        System.out.println("리뷰 번호 / 제목 / 내용 / 작성자");
        System.out.println("-".repeat(29));
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
        }
        System.out.println("리뷰 목록이 출력되었습니다.");
        mainScreen.mainSelect();
    }

    public void myReview() {

        if (reviews.size() == 0) {
            System.out.println("작성한 리뷰가 없습니다.");
            mainScreen.mainSelect();
        }
        String userId = Container.getCheckedmembers().getUserId();
        System.out.println("리뷰 번호 / 제목 / 내용 / 작성자");
        System.out.println("-".repeat(29));
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            if (reviews.get(i).getUserId().equals(userId)) {
                System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
            }
            if (reviews.get(i).getUserId().equals(userId) == false){
                System.out.println("작성한 리뷰가 없습니다.");
                mainScreen.mainSelect();
            }
        }
        System.out.println("나의 리뷰 목록이 출력되었습니다.");
        mainScreen.mainSelect();
    }

    public void modify(Request request) {

        String userId = Container.getCheckedmembers().getUserId();

        if (reviews.size() == 0) {
            System.out.println("작성한 리뷰가 없습니다.");
            mainScreen.mainSelect();
        }

        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            if (reviews.get(i).getUserId().equals(userId)) {
                System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
            }
            if (reviews.get(i).getUserId().equals(userId) == false){
                System.out.println("작성한 리뷰가 없습니다.");
                mainScreen.mainSelect();
            }
        }
        System.out.println("나의 리뷰 목록이 출력되었습니다. 수정할 리뷰번호를 선택해주세요.");
        System.out.print("입력 :");
        int id = Container.getSc().nextInt();
        Container.getSc().nextLine().trim();
        Review review = findById(id);

        if (review == null) {
            System.out.println("다시 입력해주세요");
            return;
        }

        System.out.printf("기존 제목 : %s\n", review.getTitle());
        System.out.printf("제목 : ");

        String modifyTitle = Container.getSc().nextLine().trim();

        System.out.printf("기존 내용 : %s\n", review.getContent());
        System.out.printf("내용 : ");

        String modifyContent = Container.getSc().nextLine().trim();

        review.setTitle(modifyTitle);
        review.setContent(modifyContent);

        System.out.println(id + "번 리뷰가 수정되었습니다.");

        mainScreen.mainSelect();
    }

    public void remove(Request request) {
        String userId = Container.getCheckedmembers().getUserId();

        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            if (reviews.get(i).getUserId().equals(userId)) {
                System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
            }
            if (reviews.get(i).getUserId().equals(userId) == false){
                System.out.println("작성한 리뷰가 없습니다.");
                mainScreen.mainSelect();
            }
        }
        System.out.println("나의 리뷰 목록이 출력되었습니다. 삭제할 리뷰번호를 선택해주세요.");
        System.out.print("입력 :");
        int id = Container.getSc().nextInt();

        Review review = findById(id);

        if (review == null) {
            System.out.println("다시 입력해주세요");
            return;
        }

        reviews.remove(review);
        System.out.println(id + "번 리뷰가 삭제되었습니다.");

        Container.getSc().nextLine().trim();
        mainScreen.mainSelect();
    }

    public Review findById(int id) {
        for (Review review : reviews) {
            if (review.getId() == id) {
                return review;
            }
        }
        return null;
    }
}