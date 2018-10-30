package org.gesiel.springboot.repositorios;

import java.util.List;

import org.gesiel.springboot.entidades.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioInstituicao extends JpaRepository<Instituicao, Long>{
	
	List<Instituicao> findByNomeContaining(String nome);
	
}
