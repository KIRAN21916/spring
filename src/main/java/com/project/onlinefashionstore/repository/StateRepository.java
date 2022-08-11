package com.project.onlinefashionstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefashionstore.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
