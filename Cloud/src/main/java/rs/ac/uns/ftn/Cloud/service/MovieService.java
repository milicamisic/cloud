package rs.ac.uns.ftn.Cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.Cloud.entity.Movie;
import rs.ac.uns.ftn.Cloud.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAll() { return movieRepository.findAll(); }
    public Movie save(Movie movie) { return movieRepository.save(movie); }
}
