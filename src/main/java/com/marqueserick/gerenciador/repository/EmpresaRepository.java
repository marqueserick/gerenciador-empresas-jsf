package com.marqueserick.gerenciador.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.marqueserick.gerenciador.model.Empresa;

public class EmpresaRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public EmpresaRepository() {

	}

	public EmpresaRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Empresa porId(Long id) {
		return manager.find(Empresa.class, id);
	}

	public List<Empresa> pesquisar(String nome) {
		String jpql = "from Empresa where nomeFantasia like :nomeFantasia";
		
		TypedQuery<Empresa> query = manager
				.createQuery(jpql, Empresa.class);
		
		query.setParameter("nomeFantasia", nome + "%");
		
		return query.getResultList();
	}
	
	public List<Empresa> listar() {
         return manager.createQuery("from Empresa", Empresa.class).getResultList();
    }

	public Empresa salvar(Empresa empresa) {
		return manager.merge(empresa);
	}

	public void remover(Empresa empresa) {
		empresa = porId(empresa.getId());
		manager.remove(empresa);
	}

}
