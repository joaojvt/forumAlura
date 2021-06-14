package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

public class CursoDto {
	private Long id;
	private String nome;
	private String categoria;
	
	public CursoDto(Long id, String nome, String categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
}
