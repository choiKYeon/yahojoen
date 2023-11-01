package org.example.review.service;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.Container;
import org.example.member.entity.Member;
import org.example.review.entity.Review;
import org.example.review.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ReviewService {
    ReviewRepository reviewRepository = new ReviewRepository();

    public void writeService(long id, String title, String content, String userId){
        reviewRepository.writeRepository(id, title, content, userId);
    }
    public void listService(){
        reviewRepository.listRepository();

    }
    public void modifyService(Review review, String modifyTitle, String modifyContent){
        reviewRepository.modifyRepository(review, modifyTitle, modifyContent);

    }
    public void removeService(Review review){
        reviewRepository.removeRepository(review);

    }

    public Review getfindByIdService(int id) {
        return reviewRepository.getfindByIdRepository(id);
    }
    public void myReviewListService(){
        reviewRepository.myReviewListRepository();
    }
}