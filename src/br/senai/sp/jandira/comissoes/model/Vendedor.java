package br.senai.sp.jandira.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;
    int reinicioDePrograma;

    public void obterdados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("**CALCULADORA DE COMISSÕES**");
        System.out.println("----------------------------");

        //obtendo o nome do vendedor
        System.out.println("Qual o nome do vendedor? ");
        nomeVendedor = leitor.nextLine();


        //obtendo total de vendas
        System.out.println("Qual o total de vendas do "+nomeVendedor+" ?");
        totalDeVendas = leitor.nextDouble();

        calcularComissao();
    }

    public void calcularComissao(){
        if (totalDeVendas<20000){
            percentualDaComissao = 5;
        }
        else {
            percentualDaComissao = 10;
        }
        valorDaComissaoEmReais = totalDeVendas * percentualDaComissao/100;

        exibirResultados();

    }
    public void exibirResultados(){
        System.out.println("*************************************************************");
        System.out.println("**                  R E S U L T A D O S                    **");
        System.out.println("*************************************************************");
        System.out.println("Vendedor: "+nomeVendedor);
        System.out.println("Total de vendas: R$"+totalDeVendas);
        System.out.println("Percentual da comissão: "+percentualDaComissao+"%");
        System.out.println("Valor da comissão paga: R$"+valorDaComissaoEmReais);
        System.out.println("'*************************************************************");

        reiniciarPrograma();
    }
    public void reiniciarPrograma(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Deseja calcular a comissão de outro vendedor?");
        System.out.println("Digite '1' para sim, e '0' para finalizar o programa.");
        reinicioDePrograma = leitura.nextInt();
        if (reinicioDePrograma == 1) {
            obterdados();
        } else {
            System.out.println("Obrigado por usar o programa!");
            System.out.println("Finalizando o programa...");
        }
    }
}