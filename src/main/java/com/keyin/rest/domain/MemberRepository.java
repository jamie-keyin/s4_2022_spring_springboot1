package com.keyin.rest.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {
    public List<Member> findByLastName(@Param("last_name")String lastName);
    public List<Member> findByFirstName(@Param("first_name")String firstName);
}
