package com.backaofront;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int registro;
		 String nome;

		System.out.println("-Registrar Colaborador Padrão-");
		System.out.println("Registre o nome: ");
		nome = input.nextLine();
		System.out.println("Registre o número de registro: ");
		registro = input.nextInt();
		input.nextLine();
		System.out.println("------------------------------");

		// Metodo para adicionar os valores do usuario usando o construtor e objeto
		ColaboradorPadrao colaborador = new ColaboradorPadrao(registro, nome);

		// Mostro para o usuario as informações que ele inserir
		System.out.println("Colaborador: " + colaborador.nome +
						"\nRegistro: " + colaborador.registro);

		// Proximo passo é criar um array ou arrayList para armazenar em lista
	}
}

// Onde nosso codigo vai apresentar todas as opções...