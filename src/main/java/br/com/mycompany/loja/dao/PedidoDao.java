package br.com.mycompany.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.mycompany.loja.model.Pedido;
import br.com.mycompany.loja.vo.RelatorioDeVendasVO;

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
	
	public BigDecimal consultaPorAgregaçao() {
		String jpql = "agregação";
		return em.createNamedQuery(jpql, BigDecimal.class).getSingleResult();
	}
	
	public List<RelatorioDeVendasVO> relatorioDePedidos(){
		String jpql = "SELECT new br.com.mycompany.loja.vo.RelatorioDeVendasVO("
					  +"produto.nome, "
					  + "SUM(item.quantidade) as quantidadeTotal, "
					  + "MAX(pedido.data)) "
					  + "FROM Pedido pedido "
					  + "JOIN pedido.itens item "
					  + "JOIN item.produto produto "
					  + "GROUP BY produto.nome "
					  + "ORDER BY quantidadeTotal DESC";
		
		return em.createQuery(jpql, RelatorioDeVendasVO.class).getResultList();
	}
	
}
