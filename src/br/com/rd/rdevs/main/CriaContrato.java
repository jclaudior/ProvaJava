package br.com.rd.rdevs.main;


import br.com.rd.rdevs.model.ContratoTrabalho;
import br.com.rd.rdevs.model.Pessoa;

public class CriaContrato {

	public static void main(String[] args) {
		Pessoa [] testemunhas = new Pessoa[1];	
		Pessoa testemunha1 = new Pessoa("joao","16/07/1997");
		
		testemunhas[0] = testemunha1;
		
		ContratoTrabalho trabalho = new ContratoTrabalho();
		trabalho.setTestemunhas(testemunhas);
	}

}
