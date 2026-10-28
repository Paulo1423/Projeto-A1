package com.backaofront;

public class ColaboradorPadrao extends Colaborador{

	// construtor
		ColaboradorPadrao(String nome, int registro){
		super(nome, registro);
	}

	// Sobrescreve a exibição de dados do colaborador
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("\nNovo Colaborador(a) Padrão registrado." +
						"\n------------------------------");
	}

}
// Número de registro = Matrícula - variável: registro
// Nome = Nome completo - variável: nome