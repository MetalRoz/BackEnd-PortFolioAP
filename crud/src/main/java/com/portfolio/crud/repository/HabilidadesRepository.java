package com.portfolio.crud.repository;

import com.portfolio.crud.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Integer> {
    Optional<Habilidades> findByNombre (String nombre);
    boolean existsByNombre(String nombre);
}