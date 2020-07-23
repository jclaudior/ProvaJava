package br.com.rd.rdevs.model;

public abstract class Documento {
	private int numeroRegistro;
	private String dataEmissao;
	private String tabeliao;
	private String nomeCartorio;
	
	
	
	public Documento() {
		
	}



	public Documento(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		this.numeroRegistro = numeroRegistro;
		this.dataEmissao = dataEmissao;
		this.tabeliao = tabeliao;
		this.nomeCartorio = nomeCartorio;
	}
	
	
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getTabeliao() {
		return tabeliao;
	}
	public void setTabeliao(String tabeliao) {
		this.tabeliao = tabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
}
