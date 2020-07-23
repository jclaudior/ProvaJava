package br.com.rd.rdevs.model;

import br.com.rd.rdevs.exception.TestemunhaException;

public abstract class Contrato extends Documento{
	private Pessoa[] testemunhas;
	private String objetoContrato;
	private String dataRegistro;
	static int contador = 0;
	
	
	
	public Contrato() {
		super();
		this.contador ++;
	}
	
	public Contrato(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.contador ++;
	}
	
	public Pessoa[] getTestemunhas() {
		return testemunhas;
	}
	public void setTestemunhas(Pessoa[] testemunhas) {
		try {
			if(testemunhas.length<2) {
				throw new TestemunhaException("Nessecita pelo menos 2 Testemunhas!");
			}else {
				this.testemunhas = testemunhas;
			}
		}catch(RuntimeException e) {
			System.out.println("Erro ao adicionar Testemunhas! "+e.getMessage());
		}
		
	}
	public String getObjetoContrato() {
		return objetoContrato;
	}
	public void setObjetoContrato(String objetoContrato) {
		this.objetoContrato = objetoContrato;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public int getContador() {
		return contador;
	}
	
	
}
