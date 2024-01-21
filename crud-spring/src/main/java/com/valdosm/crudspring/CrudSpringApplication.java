package com.valdosm.crudspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdosm.crudspring.entities.Curso;
import com.valdosm.crudspring.repository.CursosRepository;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner{
	@Autowired
	private CursosRepository cursosRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Curso curso = new Curso(null, "Java","backend");
		Curso curso2 = new Curso(null, "Angular","frontend");
		Curso curso3 = new Curso(null, "node","backend");
		Curso curso4 = new Curso(null, "vue","frontend");

		cursosRepository.saveAll(Arrays.asList(curso, curso2, curso3, curso4));
	}

}
