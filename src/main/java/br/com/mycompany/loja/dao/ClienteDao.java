package br.com.mycompany.loja.dao;

import javax.persistence.EntityManager;

import br.com.mycompany.loja.model.Cliente;

public class ClienteDao {
	private EntityManager em;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente consultarPorId(Long id) {
		return em.find(Cliente.class, id);
	}
}
