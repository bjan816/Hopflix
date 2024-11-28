package com.github.bjan816.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate; // use the template to form up a new dynamic query and do the job inside the database without using the repository (template is one way of accessing the database, other than using the repository)

    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody)); // insert() returns the data that has been pushed inside the database

        mongoTemplate.update(Movie.class) // Associate the review with one of the movies. Update the reviewIds array of the movie in the collection
                .matching(Criteria.where("imdbId").is(imdbId)) // updating the movie where the imdbId of the movie in the db matches imdbId we received from the user
                .apply(new Update().push("reviewIds").value(review)) // Update definition makes the change inside the database. We update the reviewIds array of the matching movie document. The review we have just created will be pushed into the reviewIds array
                .first(); // Executes the update operation and ensures only the first matching document is updated (even if multiple movies with the same imdbId exist)

        return review;
    }
}
