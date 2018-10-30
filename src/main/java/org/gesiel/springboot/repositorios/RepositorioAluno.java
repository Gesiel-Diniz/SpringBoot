package org.gesiel.springboot.repositorios;

import java.util.List;

import org.gesiel.springboot.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAluno  extends JpaRepository<Aluno, Long>{
	
	List<Aluno> findByNomeContaining(String nome);

}
