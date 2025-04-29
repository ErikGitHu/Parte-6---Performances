package br.com.mycompany.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendasVO {
	
	private String nomeDoProduto;
	private Long quantidadeDeVendas;
	private LocalDate dataUltimaVenda = LocalDate.now();
	
	
	@Override
	public String toString() {
		return "RelatorioDeVendasVO [nomeDoProduto=" + nomeDoProduto + ", quantidadeDeVendas=" + quantidadeDeVendas
				+ ", dataUltimaVenda=" + dataUltimaVenda + "]";
	}

	public RelatorioDeVendasVO(String nomeDoProduto, Long quantidadeDeVendas, LocalDate dataUltimaVenda) {
		this.nomeDoProduto = nomeDoProduto;
		this.quantidadeDeVendas = quantidadeDeVendas;
		this.dataUltimaVenda = dataUltimaVenda;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public Long getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}

	public LocalDate getDataUltimaVenda() {
		return dataUltimaVenda;
	}
	
}
