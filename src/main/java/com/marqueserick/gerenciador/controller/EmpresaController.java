package com.marqueserick.gerenciador.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.marqueserick.gerenciador.model.Empresa;
import com.marqueserick.gerenciador.repository.EmpresaRepository;

@Named("empresaController")
@ViewScoped
public class EmpresaController implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmpresaRepository repository;
	
	private List<Empresa> empresas;
	
	public void listar() {
		empresas = repository.listar();
	}
	
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	
}
