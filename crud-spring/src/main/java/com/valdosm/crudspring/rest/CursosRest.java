package com.valdosm.crudspring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdosm.crudspring.entities.Curso;
import com.valdosm.crudspring.service.CursosService;

@RestController
@RequestMapping(value = "cursos")
public class CursosRest {
    @Autowired
    private CursosService cursosService;
    @GetMapping
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> curso = cursosService.findAll();
            return ResponseEntity.ok().body(curso);
        }
}
