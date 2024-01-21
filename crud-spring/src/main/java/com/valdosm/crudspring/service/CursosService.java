package com.valdosm.crudspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.crudspring.entities.Curso;
import com.valdosm.crudspring.repository.CursosRepository;

@Service
public class CursosService {
    @Autowired
    private CursosRepository cursosRepository;
    public List<Curso> findAll(){
        return  cursosRepository.findAll();
    }
    
}
