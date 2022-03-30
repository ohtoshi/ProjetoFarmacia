package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // anotação, indica que vai virar tabela transformo em tabela
@Table(name = "tb_produto") // nomeia a tabela
public class Produto {

	@Id // informa que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long id; // Long maiúsculo pois é tipo primitivo, como String

	@NotNull // não pode ser vazio
	@Size(min = 5, max = 100) // validação de quantidade de caracteres
	private String nome;

	@Size(min = 5, max = 500)
	private String descricao;

	@NotNull
	private Double valor;
	
	@NotNull
	private Boolean estoque;
	
	@Size(min = 5, max = 70)
	private String fabricante;
	
	@Size(min = 5, max = 50)
	private String apresentacao; // se é comprimido, cápsula, em gotas, creme, etc.

	@ManyToOne //ligações entre as tabelas
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
