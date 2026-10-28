package com.backaofront;

public class ColaboradorProducao extends Colaborador{
    int quantidadePecas;
    double valorPecas;

    ColaboradorProducao(String nome, int registro, double valorPecas, int quantidadePecas){
        super(nome, registro);
        this.valorPecas = valorPecas;
        this.quantidadePecas = quantidadePecas;
    }

    // Sobrescreve o salario final para ser coerente com o de produção
    @Override
    public double calcularSalarioFinal() {
        return super.calcularSalarioFinal() + valorPecas * quantidadePecas;
    }

    // // Sobrescreve a exibição de dados do colaborador para ser coerente com o de produção
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("\nValor total por peça: R$%.2f", valorPecas);
        System.out.println("\nQuantidade de peças vendidas: " + quantidadePecas +
                "\nNovo Colaborador(a) produtor registrado." +
                "\n------------------------------");
    }
}
// Número de registro = Matrícula - variável: registro
// Nome = Nome completo - variável: nome
// valor de vendas por peça = valor total de vendas - variável: valorPecas
// percentual da comissão - variável: comissao