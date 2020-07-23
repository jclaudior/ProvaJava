package br.com.rd.rdevs.model;

public class CertidaoCasamento extends Certidao{

	public CertidaoCasamento() {
		super();
		this.tipo ="Certidao de Casamento";
	}

	public CertidaoCasamento(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.tipo ="Certidao de Casamento";
	}

	

	
}
