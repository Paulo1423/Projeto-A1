package com.backaofront;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int registro, escolha, comissao, quantidadePecas;
		 double valorVendas, valorPecas;
		 String nome;

		 System.out.println("1 - Cadastrar Colaborador(a) Padrão" +
						 "\n2 - Cadastrar Colaborador(a) Comissionado" +
						 "\n3 - Cadastrar Colaborador(a) Produçao" +
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
			 colaborador.exibirDados();
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

				 colaboradorC.exibirDados();
				break;

			 case 3:
				 System.out.println("-Registrar Colaborador(a) De Produçao" +
						 "\n");
				 System.out.println("Registre o nome completo: ");
				 nome = input.nextLine();
				 System.out.println("Registre o número de registro: ");
				 registro = input.nextInt();
				 input.nextLine();
				 System.out.println("Registre o valor da peça: ");
				 valorPecas = input.nextDouble();
				 System.out.println("Registre a quantidade de peças: ");
				 quantidadePecas = input.nextInt();
				 input.nextLine();
				 System.out.println("------------------------------");

				 // colaboradorP = colaboradorProducao
				 ColaboradorProducao colaboradorP = new ColaboradorProducao(nome, registro, valorPecas, quantidadePecas);

				colaboradorP.exibirDados();
			 break;
		 }
		// Proximo passo é criar um array ou arrayList para armazenar em lista
	}
}
// Onde nosso codigo vai apresentar todas as opções...