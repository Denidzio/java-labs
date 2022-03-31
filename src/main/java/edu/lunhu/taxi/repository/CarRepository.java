package edu.lunhu.taxi.repository;

import edu.lunhu.taxi.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
    Page<Car> getCarsByModelContains(String model, Pageable pageable);
}
