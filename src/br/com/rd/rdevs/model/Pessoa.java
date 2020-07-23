package br.com.rd.rdevs.model;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String dataObito;
	private String dataCasamento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataObito() {
		return dataObito;
	}

	public void setDataObito(String dataObito) {
		this.dataObito = dataObito;
	}

	public String getDataCasamento() {
		return dataCasamento;
	}

	public void setDataCasamento(String dataCasamento) {
		this.dataCasamento = dataCasamento;
	}

	
	
	
	
}
