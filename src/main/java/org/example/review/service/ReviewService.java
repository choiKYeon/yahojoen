package org.example.review.service;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.Container;
import org.example.member.entity.Member;
import org.example.review.entity.Review;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ReviewService {
    private static List<Review> reviews = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public static List<Review> getReviews() {
        return reviews;
    }
    public static void setReviews(List<Review> reviews) {
        ReviewService.reviews = reviews;
    }

    public void writeService(long id, String title, String content, String userId){

        Review review = new Review(id, title, content, userId);
        reviews.add(review);

    }
    public void listService(){

        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
        }
    }
    public void modifyService(Review review, String modifyTitle, String modifyContent){
        review.setTitle(modifyTitle);
        review.setContent(modifyContent);
    }
    public void removeService(Review review){
        reviews.remove(review);
    }

    public Review getfindByIdService(int id) {
        for (Review review : reviews) {
            if (review.getId() == id) {
                return review;
            }
        }
        return null;
    }
}