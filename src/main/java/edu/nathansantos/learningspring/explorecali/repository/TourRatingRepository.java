package edu.nathansantos.learningspring.explorecali.repository;

import edu.nathansantos.learningspring.explorecali.domain.TourRating;
import edu.nathansantos.learningspring.explorecali.domain.TourRatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {
    List<TourRating> findByPkTourId(Integer tourId);
    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);
    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);
}
