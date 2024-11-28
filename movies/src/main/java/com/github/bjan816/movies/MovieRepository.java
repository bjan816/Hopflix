package com.github.bjan816.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // let the framework know that this is a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
