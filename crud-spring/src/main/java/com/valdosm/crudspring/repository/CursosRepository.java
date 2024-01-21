package com.valdosm.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.crudspring.entities.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {
    
}
