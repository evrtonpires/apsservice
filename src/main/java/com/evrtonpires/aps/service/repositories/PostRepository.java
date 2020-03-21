package com.evrtonpires.aps.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evrtonpires.aps.service.domain.PostDomain;

@Repository
public interface PostRepository extends JpaRepository<PostDomain, Integer>{

}
