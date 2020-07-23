package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.List;

import br.com.rd.rdevs.model.Contrato;
import br.com.rd.rdevs.model.ContratoCompraVenda;
import br.com.rd.rdevs.model.ContratoTrabalho;
import br.com.rd.rdevs.util.RegistraContrato;

public class TesteRegistroContrato {
	public static void main(String[]args) {
		List<Contrato> contratos = new ArrayList<>();
		
		ContratoTrabalho trabalho = new ContratoTrabalho(1234,"22/07/2020","22","sao mateus");
		
		ContratoCompraVenda compraVenda = new ContratoCompraVenda(1235,"22/07/2020","22","sao mateus");
		
		
		contratos.add(trabalho);
		contratos.add(compraVenda);
		
		RegistraContrato registro = new RegistraContrato();
		registro.registrar(contratos,"23/07/2020");
		
		System.out.println(trabalho.getDataRegistro());
		System.out.println(trabalho.getContador());
	}
	
	
}
