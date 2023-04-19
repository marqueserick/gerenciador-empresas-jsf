package com.marqueserick.gerenciador.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.marqueserick.gerenciador.model.Empresa;
import com.marqueserick.gerenciador.model.TipoEmpresa;

@Named("empresaController")
@RequestScoped
public class EmpresaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();
	
	public void salvar() {
		System.out.println("Razao Social: " + this.empresa.getRazaoSocial() +
				"\nNome Fantasia: "+ this.empresa.getNomeFantasia() +
				"\nTipo Empresa: "+ this.empresa.getTipo().getDescricao());
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
	
	public String navegarAjuda() {
		return "AjudaGerenciador?faces-redirect=true";
	}
	
	
}
