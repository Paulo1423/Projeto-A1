package com.backaofront;

// Super Classe
public class Colaborador {
	private String nome;
	private int registro;
	private static final double SalarioBase = 2000.00;

	// Construtor
	protected Colaborador(String nome, int registro){
		this.nome = nome;
		this.registro = registro;
	}

	// Retorna o salário base de R$2000,00
	public double calcularSalarioFinal(){
		return SalarioBase;
	}

	// Pega e retorna o valor da variável - nome
	public String getNome() {
		return nome;
	}

	// Recebe um valor novo e altera a variável - nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Pega e retorna o valor da variável - registro
	public int getRegistro(){
		return registro;
	}

	// Recebe um valor novo e altera a variável - registro
	public void setRegistro(int registro){
		this.registro = registro;
	}

	// Estrutura para exibir os dados do colaborador
	public void exibirDados(){
		System.out.println("Colaborador: " + getNome() +
						"\nNúmero de registro: " + getRegistro());
		System.out.printf("Salário final: R$%.2f", calcularSalarioFinal());
	}

}