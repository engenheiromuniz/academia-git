package br.com.muniz.academiagit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.muniz.academiagit.model.ProfessorModel;
import br.com.muniz.academiagit.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;
	
	public ProfessorModel inserirProfessor(ProfessorModel professor) {
		return repository.save(professor);		
	}
	
	public List<ProfessorModel> listarProfessor(){
		return repository.findAll();
	}
	


}
