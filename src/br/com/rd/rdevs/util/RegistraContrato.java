package br.com.rd.rdevs.util;

import java.util.List;

import br.com.rd.rdevs.interfaces.Registro;
import br.com.rd.rdevs.model.Contrato;

public class RegistraContrato implements Registro{

	@Override
	public void registrar(List<Contrato> contratos, String dataRegistro) {
		// TODO Auto-generated method stub
		for(Contrato contrato : contratos) {
			contrato.setDataRegistro(dataRegistro);
		}
	}

}
