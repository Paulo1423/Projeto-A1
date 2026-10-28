package com.backaofront;

public class ColaboradorComissionado {
	int registro, comissao;
	double valorVendas;
	String nome;

	ColaboradorComissionado(String nome, int registro, double valorVendas, int comissao){
		this.nome = nome;
		this.registro = registro;
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
}
// Número de registro = Matrícula - variável: registro
// Nome = Nome completo - variável: nome
// valor de vendas = valor total de vendas - variável: valorVendas
// percentual da comissão - variável: comissao
