package br.com.muniz.academiagit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private Boolean pago;
    
    
    @ManyToMany
    @JoinTable(
    		name = "aluno_modalidade", 
    		joinColumns = @JoinColumn(name = "aluno_id"),
    		inverseJoinColumns = @JoinColumn(name = "modalidade_id")    		
    		)
    private List<ModalidadeModel> modalidades;
    
    public AlunoModel() {}

	public AlunoModel(Long id, String nome, String telefone, Boolean pago, List<ModalidadeModel> modalidades) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.pago = pago;
		this.modalidades = modalidades;
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

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public List<ModalidadeModel> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<ModalidadeModel> modalidades) {
		this.modalidades = modalidades;
	}
    
    
}
