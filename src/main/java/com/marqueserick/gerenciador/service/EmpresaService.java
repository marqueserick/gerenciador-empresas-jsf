package com.marqueserick.gerenciador.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.marqueserick.gerenciador.model.Empresa;
import com.marqueserick.gerenciador.repository.EmpresaRepository;
import com.marqueserick.gerenciador.util.Transacional;

public class EmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmpresaRepository repository;
	
	@Transacional
	public void salvar(Empresa empresa) {
		repository.salvar(empresa);
	}
	
	@Transacional
	public void remover(Empresa empresa) {
		repository.remover(empresa);
	}

}
