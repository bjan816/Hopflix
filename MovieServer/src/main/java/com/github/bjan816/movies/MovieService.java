package com.github.bjan816.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService { // this class includes the database access methods

    @Autowired // have the framework instantiate the class 'MovieRepository' for us; tells Spring to inject an instance of the MovieRepository bean into the MovieService class
    private MovieRepository movieRepository; // inside the service class, a reference of the repository is needed

    public List<Movie> allMovies() {
        return movieRepository.findAll(); // return a list of the data type (Movie)
    }

    public Optional<Movie> singleMovie(String imdbId) {
        // The findById method may not find a movie if the id passed doesn't exist. To handle such cases, let Java know it may return null by using Optional.
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
