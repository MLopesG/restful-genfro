package com.app.entity;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="produtos")
public class Produto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoria", nullable = true)
	private String categoria;

	@Column(name = "quantidade_restante", nullable = true)
	private Integer quantidade_restante;
	
	@Column(name = "descricao", nullable = true)
    private String descricao;

    @Column(name = "valor", nullable = true)
    private DecimalFormat valor;

    @Column(name = "created", insertable = false, updatable = false, nullable = true, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime created;   
	                             
    @Column(name = "modified",  insertable = false, updatable = false, nullable = true, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime modified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade_restante() {
		return this.quantidade_restante;
	}

	public void setQuantidade_restante(Integer quantidade_restante) {
		this.quantidade_restante = quantidade_restante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public DecimalFormat getValor() {
		return valor;
	}

	public void setValor(DecimalFormat valor) {
		this.valor = valor;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getModified() {
		return modified;
	}

	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}