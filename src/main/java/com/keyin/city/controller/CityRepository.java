package com.keyin.city.controller;

import com.keyin.city.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository
        extends CrudRepository<City, Long> {

    public List<City> findByCitizens_Name(String citizenName);
}