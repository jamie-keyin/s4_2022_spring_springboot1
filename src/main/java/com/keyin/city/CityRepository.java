package com.keyin.city;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository
        extends CrudRepository<City, Long> {
}