package br.com.muniz.academiagit.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ProfessorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String     nome;
	private String     telefone;
	private BigDecimal salario;
	
	
	@ManyToOne
	@JoinColumn(name = "modalidade_id")
	private ModalidadeModel modalidade;
	
	public ProfessorModel() {}

	public ProfessorModel(Long id, String nome, String telefone, BigDecimal salario, ModalidadeModel modalidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.salario = salario;
		this.modalidade = modalidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public ModalidadeModel getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeModel modalidade) {
		this.modalidade = modalidade;
	}
	
	

}
