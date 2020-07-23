package br.com.rd.rdevs.model;

public class CertidaoObito extends Certidao{

	public CertidaoObito() {
		super();
		this.tipo ="Certidao de Obito";
	}

	public CertidaoObito(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.tipo ="Certidao de Obito";
	}
	
}
