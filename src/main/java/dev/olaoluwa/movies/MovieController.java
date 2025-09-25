package dev.olaoluwa.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);

    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Movie> getSingleMovie(@PathVariable ObjectId id) {
//        return movieService.singleMovie(id)
//                .map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }


//    // ✅ Fix: return Movie instead of Optional<Movie>
//    @GetMapping("/{id}")
//    public ResponseEntity<Movie> getSingleMovie(@PathVariable ObjectId id) {
//        return movieService.singleMovie(id)
//                .map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }




}
