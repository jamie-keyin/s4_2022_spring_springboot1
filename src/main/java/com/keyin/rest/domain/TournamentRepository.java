package com.keyin.rest.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    public List<Tournament> findByMembers_LastName(@Param("member_last_name")String memberLastName);

}
