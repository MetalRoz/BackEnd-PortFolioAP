package com.portfolio.crud.repository;

import com.portfolio.crud.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
    Optional<Educacion> findByTitulo (String titulo);
    boolean existsByTitulo(String titulo);
}
