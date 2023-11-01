package org.example.review.repository;

import org.example.member.entity.Member;
import org.example.review.entity.Review;
import org.example.review.service.ReviewService;

import java.util.ArrayList;
import java.util.List;

public class ReviewRepository {
    public static List<Review> reviews = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public static List<Review> getReviews() {
        return reviews;
    }
    public static void setReviews(List<Review> reviews) {
        ReviewRepository.reviews = reviews;
    }
    public void writeRepository(long id, String title, String content, String userId){
        Review review = new Review(id, title, content, userId);
        reviews.add(review);
    }
    public void listRepository(){
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            System.out.printf("%d, %s, %s, %s\n", review.getId(), review.getTitle(), review.getContent(), review.getUserId());
        }
    }
    public void modifyRepository(Review review, String modifyTitle, String modifyContent){
        review.setTitle(modifyTitle);
        review.setContent(modifyContent);
    }
    public void removeRepository(Review review){
        reviews.remove(review);

    }
    public Review getfindByIdRepository(int id){
        for (Review review : reviews) {
            if (review.getId() == id) {
                return review;
            }
        }
        return null;
    }
}
