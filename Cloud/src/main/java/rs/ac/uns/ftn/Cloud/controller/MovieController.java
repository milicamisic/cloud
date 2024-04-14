package rs.ac.uns.ftn.Cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ac.uns.ftn.Cloud.entity.Movie;
import rs.ac.uns.ftn.Cloud.service.MovieService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/movie")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getAll() { return ResponseEntity.ok(service.getAll()); }

    @PostMapping
    public ResponseEntity<Movie> createMovie (@RequestBody Movie movie){
        movie = service.save(movie);
        return ResponseEntity.ok(movie);
    }
}
