package com.portfolio.crud.repository;

import com.portfolio.crud.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
    Optional<Experiencia> findByTitulo (String titulo);
    boolean existsByTitulo(String titulo);
}
