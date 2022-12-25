package com.portfolio.crud.repository;
import com.portfolio.crud.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {
    Optional<Proyectos> findByNombre (String nombre);
    boolean existsByNombre(String nombre);
}