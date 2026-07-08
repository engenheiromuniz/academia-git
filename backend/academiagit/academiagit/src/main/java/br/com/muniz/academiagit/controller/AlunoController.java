package br.com.muniz.academiagit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.muniz.academiagit.model.AlunoModel;
import br.com.muniz.academiagit.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@PostMapping
	public AlunoModel inserirAluno(@RequestBody AlunoModel aluno) {
		return service.inserirAluno(aluno);		
	}
	
	@GetMapping
	public List<AlunoModel> listarAluno(){
		return service.listarAlunos();
	}

}
