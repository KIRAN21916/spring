package com.project.onlinefashionstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefashionstore.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
