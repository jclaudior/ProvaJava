package br.com.rd.rdevs.model;

public class CertidaoPropriedade extends Certidao{

	public CertidaoPropriedade() {
		super();
		this.tipo ="Certidao de Propriedade";
	}

	public CertidaoPropriedade(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.tipo ="Certidao de Propriedade";
	}
	
}
