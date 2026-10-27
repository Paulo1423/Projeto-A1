package com.backaofront;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int registro, escolha, comissao;
		 double valorVendas;
		 String nome;

		 System.out.println("1 - Cadastrar Colaborador(a) Padrão" +
						 "\n2 - Cadastrar Colaborador(a) Comissionado" +
						 "\n" +
						 "\nEscolha uma opção: ");
		 escolha = input.nextInt();
		 input.nextLine();
		 System.out.println("");

		 switch(escolha) {
			 case 1:
			 System.out.println("-Registrar Colaborador(a) Padrão-" +
							 "\n");
			 System.out.println("Registre o nome completo: ");
			 nome = input.nextLine();
			 System.out.println("Registre o número de registro: ");
			 registro = input.nextInt();
			 input.nextLine();
			 System.out.println("------------------------------");

			 // Metodo para adicionar os valores do usuario usando o construtor e objeto
			 ColaboradorPadrao colaborador = new ColaboradorPadrao(nome, registro);

			 // Mostro para o usuario as informações que ele inserir
			 System.out.println("Colaborador: " + colaborador.nome +
							 "\nRegistro: " + colaborador.registro +
							 "\n" +
							 "\nNovo Colaborador(a) padrão registrado." +
							 "\n------------------------------");
			 					break;
			 case 2:
				 System.out.println("-Registrar Colaborador(a) Comissionado" +
								 "\n");
				 System.out.println("Registre o nome completo: ");
				 nome = input.nextLine();
				 System.out.println("Registre o número de registro: ");
				 registro = input.nextInt();
				 input.nextLine();
				 System.out.println("Registre o valor de vendas total: ");
				 valorVendas = input.nextDouble();
				 System.out.println("Registre o percentual de comissão: ");
				 comissao = input.nextInt();
				 input.nextLine();
				 System.out.println("------------------------------");

				 // colaboradorC = colaboradorComissionado
				 ColaboradorComissionado colaboradorC = new ColaboradorComissionado(nome, registro, valorVendas, comissao);

				 System.out.println("Colaborador: " + colaboradorC.nome +
								 "\nRegistro: " + colaboradorC.registro +
								 "\nValor total de vendas: R$" + colaboradorC.valorVendas +
								 "\nPercentual de comissão: " + colaboradorC.comissao + "%" +
								 "\nNovo Colaborador(a) comissionado registrado." +
								 "\n------------------------------");
				 // Resolver situação do símbolo de porcentagem da comissão e as casas decimais do valor de vendas
				 break;
		 }
		// Proximo passo é criar um array ou arrayList para armazenar em lista
	}
}
// Onde nosso codigo vai apresentar todas as opções...