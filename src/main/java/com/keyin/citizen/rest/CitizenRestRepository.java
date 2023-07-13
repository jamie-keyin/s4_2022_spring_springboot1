package com.keyin.citizen.rest;

import com.keyin.citizen.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "citizen_repo", path = "citizen_repo")
public interface CitizenRestRepository extends JpaRepository<Citizen, Long> {
}
