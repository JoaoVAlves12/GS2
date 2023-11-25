package br.com.IncluStep.IS.model;

import br.com.IncluStep.IS.dto.RequisicaoNovoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String nivelGravidade;
	private String dataPostado;
	private String urlImagem;
	private String descricao;

	public Pessoa() {

	}

	public Pessoa(RequisicaoNovoPessoa requisicao) {
		this.nome = requisicao.nomePessoa1();
		this.nivelGravidade = requisicao.nivelGravidade1();
		this.dataPostado = requisicao.dataPostada1();
		this.urlImagem = requisicao.descricao1();

	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getNivelGravidade() {
		return nivelGravidade;
	}

	public final void setNivelGravidade(String nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}

	public final String getDataPostado() {
		return dataPostado;
	}

	public final void setDataPostado(String dataPostado) {
		this.dataPostado = dataPostado;
	}

	public final String getUrlImagem() {
		return urlImagem;
	}

	public final void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public final String getDescricao() {
		return descricao;
	}

	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

}
