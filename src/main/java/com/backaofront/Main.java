package com.backaofront;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int registro, escolha, comissao, quantidadePecas;
		 double valorVendas, valorPecas;
		 String nome;
		 boolean escolhaDigitada = false;
		 // Usando o arrayList para construir uma lista de colaboradores
		 ArrayList<Colaborador> listaColaboradores = new ArrayList<>();

		 // Para deixar o menu rodando ate o usuário digitar uma opção válida
		 while(escolhaDigitada == false) {
			 System.out.println("   -Cadastro de Colaborador(a)" +
							 "\n" +
							 "\n1 - Cadastrar Colaborador(a) Padrão" +
							 "\n2 - Cadastrar Colaborador(a) Comissionado" +
							 "\n3 - Cadastrar Colaborador(a) Produçao" +
							 "\n4 - Folha de pagamentos" +
							 "\n5 - Resumo Da Folha De Pagamento" +
							 "\n0 - Sair do programa" +
							 "\nEscolha uma opção: ");
			 escolha = input.nextInt();
			 input.nextLine();
			 System.out.println("");

			 // Verificação se o usuário digitou um valor dentro do esperado
			 if (escolha >= 0 && escolha <= 5) {
				 escolhaDigitada = true;

				 switch (escolha) {
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

						 // Adicionando o colaborador na lista
						 listaColaboradores.add(colaborador);

						 // Mostro para o usuario as informações que ele inserir
						 colaborador.exibirDados();
						 System.out.println("Novo Colaborador(a) Padrão registrado." +
						 "\n------------------------------");

						 // Metodo para caso o usuário quiser voltar ao menu principal
						 escolhaDigitada = voltarMenu(input);

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

						 listaColaboradores.add(colaboradorC);

						 colaboradorC.exibirDados();
						 System.out.println("Novo Colaborador(a) comissionado registrado." +
										 "\n------------------------------");

						 escolhaDigitada = voltarMenu(input);

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
						 System.out.println("Novo Colaborador(a) produtor registrado." +
										 "\n------------------------------");

						 escolhaDigitada = voltarMenu(input);

						 break;
					 case 4:
						 // Mostra todas as informações de todos os colaboradores
						 System.out.println("-Folha De Pagamento-\n");
						 for(int i = 0; i < listaColaboradores.size(); i++) {
							 // Colaborador colaboradorAtual = listaColaboradores.get(i);
							 listaColaboradores.get(i).exibirDados();
							 System.out.println("------------------------------");
						 }

						 break;
					 case 5:
						 System.out.println("-Resumo Da Folha-");

						 // Mostra a quantidade de colaboradores que foram registrados na lista
						 System.out.println("Quantidade Total De Colaboradores: " + listaColaboradores.size());

						 double somaSalarios = 0;
						 for(int i = 0; i < listaColaboradores.size(); i++){
								 somaSalarios += listaColaboradores.get(i).calcularSalarioFinal();
						 }
						 System.out.printf("Soma total da folha de pagamento: %.2f", somaSalarios);

						 System.out.printf("\nMedia Salarial Dos Colaboradores: %.2f", somaSalarios / listaColaboradores.size());
						 System.out.println("\n------------------------------");

						 escolhaDigitada = voltarMenu(input);

						 break;
					 case 0:
						 System.out.println("Fechando programa...");
						 System.exit(0);
						 break;
				 }

			 } else { // Else para caso o valor não esteja no range esperado
				 System.out.println("Opção não existe!!!" +
								 "\nPor favor insira uma opção valida." +
								 "\n");
			 }

		 }
		input.close();
	}
	// Onde foi criado o metodo para voltar a seleção
	public static boolean voltarMenu(Scanner input) {
		System.out.println("\nDeseja voltar ao menu principal?" +
						"\n1(Sim) 2(Não)");
		int voltar = input.nextInt();
		if(voltar == 1){
			System.out.println("------------------------------");
			return false;
		} else {
			System.out.println("Fechando programa...");
			System.exit(0);
			return true;
		}
	}

}
// Onde nosso codigo vai apresentar todas as opções...