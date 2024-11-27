package com.github.bjan816.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies") // let the framework know that this class presents each document in the movies collection
@Data // deals with getter and setter methods
@AllArgsConstructor // create a constructor that takes all the private fields as arguments
@NoArgsConstructor // another constructor that takes no arguments
public class Movie {
    @Id // let the framework no that this property should be treated as the unique identifier for each movie inside the database
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

}
