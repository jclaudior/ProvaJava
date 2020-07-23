package br.com.rd.rdevs.model;

public class CertidaoNascimento extends Certidao{

	public CertidaoNascimento() {
		super();
		this.tipo = "Certidao de Nascimento";
	}

	public CertidaoNascimento(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.tipo = "Certidao de Nascimento";
	}



	
	
}
