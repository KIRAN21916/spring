package com.project.onlinefashionstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinefashionstore.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
