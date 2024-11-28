package com.github.bjan816.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // let the framework know that this is a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // the repository comes with built-in methods for searching with ID, but not with ImdbId so requires implementation for that
    Optional<Movie> findMovieByImdbId(String imdbId);
}
