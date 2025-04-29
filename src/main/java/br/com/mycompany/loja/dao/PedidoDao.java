package br.com.mycompany.loja.dao;

import javax.persistence.EntityManager;

import br.com.mycompany.loja.model.Pedido;

public class PedidoDao {
	
	private EntityManager em;

	public PedidoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}
	
	public Pedido consultarPorId(Long id) {
		return em.find(Pedido.class, id);
	}
	
}
