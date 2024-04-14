package rs.ac.uns.ftn.Cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import rs.ac.uns.ftn.Cloud.entity.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @NonNull
    List<Movie> findAll();
}
