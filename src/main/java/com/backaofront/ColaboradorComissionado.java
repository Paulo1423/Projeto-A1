package com.backaofront;

public class ColaboradorComissionado extends Colaborador{
	private int comissao;
	private double valorVendas;

	ColaboradorComissionado(String nome, int registro, double valorVendas, int comissao){
	super(nome, registro);
	this.valorVendas = valorVendas;
	this.comissao = comissao;
	}

	// Sobrescreve o salario final para ser coerente com o comissionado
	@Override
	public double calcularSalarioFinal() {
		return super.calcularSalarioFinal() + valorVendas * comissao / 100;
	}

	// Sobrescreve a exibição de dados do colaborador para ser coerente com o comissionado
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.printf("\nValor de vendas: R$%.2f", valorVendas);
		System.out.println("\nPercentual de comissão: " + comissao + "%" +
						"\nNovo Colaborador(a) comissionado registrado." +
						"\n------------------------------");
	}

}
// Número de registro = Matrícula - variável: registro
// Nome = Nome completo - variável: nome
// valor de vendas = valor total de vendas - variável: valorVendas
// percentual da comissão - variável: comissao
