package br.com.rd.rdevs.interfaces;

import java.util.List;

import br.com.rd.rdevs.model.Contrato;

public interface Registro {
	public void registrar(List<Contrato> contratos, String dataRegistro);
}
