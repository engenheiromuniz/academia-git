package br.com.muniz.academiagit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.muniz.academiagit.model.ProfessorModel;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long>{

}
