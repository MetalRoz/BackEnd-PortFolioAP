package com.portfolio.crud.repository;

import com.portfolio.crud.entity.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMe, Integer> {
    Optional<AboutMe> findByNombre (String nombre);
    boolean existsByNombre(String nombre);
}
