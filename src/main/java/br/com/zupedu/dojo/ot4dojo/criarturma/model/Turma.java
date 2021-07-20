package br.com.zupedu.dojo.ot4dojo.criarturma.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="turmas")
public class Turma {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(max=50)
	@Column(unique = true)
	private String nome;
	@Column(unique = true)
	private LocalDate iniciaEm;
	@Column(unique = true)
	private LocalDate terminaEm;
	
	@Deprecated
	public Turma() {
		
	}
	public Turma(@Size(max = 50) String nome, LocalDate iniciaEm, LocalDate terminaEm) {
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}

	public LocalDate getTerminaEm() {
		return terminaEm;
	}

	public Long getId() {
		return id;
	}

}
