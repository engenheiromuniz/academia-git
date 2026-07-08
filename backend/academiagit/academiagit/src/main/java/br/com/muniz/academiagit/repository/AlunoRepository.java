package br.com.muniz.academiagit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.muniz.academiagit.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{
	

}
