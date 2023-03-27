package com.keyin.city;

import com.keyin.rest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city_repo", path = "city_repo")
public interface CityRestRepository extends JpaRepository<City, Long> {
    public List<City> findByName(@Param("name")String name);

    public List<City> findByAirports_code(@Param("code")String code);
}