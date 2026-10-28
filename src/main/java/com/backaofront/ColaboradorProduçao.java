package com.backaofront;

public class ColaboradorProduçao {
    int registro, quantidadePeças;
    double valorPeças;
    String nome;

    ColaboradorProduçao(String nome, int registro, double valorPeças, int quantidadePeças){
        this.nome = nome;
        this.registro = registro;
        this.valorPeças = valorPeças;
        this.quantidadePeças = quantidadePeças;
    }
}
// Número de registro = Matrícula - variável: registro
// Nome = Nome completo - variável: nome
// valor de vendas = valor total de vendas - variável: valorVendas
// percentual da comissão - variável: comissao