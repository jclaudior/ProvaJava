package br.com.rd.rdevs.model;

public abstract class Certidao extends Documento{
	private Pessoa[] pessoaObjetos;
	private Pessoa[] declarantes;
	protected String tipo;
	static int contador = 0;
	

	public Certidao() {
		super();
		this.contador ++;
	}
	
	public Certidao(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio);
		this.contador ++;
	}
	
	
	public Pessoa[] getPessoaObjetos() {
		return pessoaObjetos;
	}
	public void setPessoaObjetos(Pessoa[] pessoaObjetos) {
		this.pessoaObjetos = pessoaObjetos;
	}
	public Pessoa[] getDeclarantes() {
		return declarantes;
	}
	public void setDeclarantes(Pessoa[] declarantes) {
		this.declarantes = declarantes;
	}
	
	public int getContador() {
		return contador;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	
		
}
