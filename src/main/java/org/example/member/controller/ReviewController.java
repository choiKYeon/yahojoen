package org.example.member.controller;

import org.example.Container;
import org.example.member.entity.Member;
import org.example.member.entity.Review;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReviewController {
    List<Review> reviews = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public void write(){

        long id = 0;

        System.out.println("\n== 리뷰를 작성해주세요. ==");
        System.out.print("제목 :");
        String title = Container.getSc().nextLine().trim();
        System.out.print("내용 :");
        String content = Container.getSc().nextLine().trim();

        Review review = new Review(id, title, content);
        reviews.add(review);


        System.out.println( "님의 리뷰가 작성되었습니다.");
    }
}
