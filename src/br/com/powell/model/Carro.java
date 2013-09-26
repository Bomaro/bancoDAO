package br.com.powell.model;

public class Carro {
	
	private Long id;
	private String descricao;
	private String cor;
	
	public Carro(long id, String descricao, String cor) {
		setId(id);
		setDescricao(descricao);
		setCor(cor);
	}
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
