/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios02;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class complementarAC2desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SEJA VEM VINDO!!");

        String cpf = "123.456.789-00";
        String senha = "01020304";
        double saldo = 1000.0;
        String conta = "10203040";
        String agencia = "030";
        String banco = "Caixa";
        String extrato = " ";
        
        System.out.println("Informe seu CPF: ");
        String cpfentrada = entrada.nextLine();

        if (!cpfentrada.equals(cpf)) {
            System.out.println("não permitido");
        } else {

            for (int i = 0; i < 3; i++) {

                System.out.println("Informe a senha");
                String senhaentrada = entrada.nextLine();

                if (senhaentrada.equals(senha)) {
                    int X;
                    do {
                        System.out.println("ESCOLHA O QUE DESEJA REALIZAR: \n [1]Saldo \n [2]Depósito\n [3]Saque\n [4]Transferência\n [5]Extrato\n [0]Sair");
                        System.out.println("Informe aqui:");
                        X = entrada.nextInt();

                        switch (X) {
                            case 1:
                                System.out.printf("Saldo R$: %.2f%n ", saldo);
                                break;
                            case 2:
                                System.out.println("Informe o valor do deposito: ");
                                double dep = entrada.nextDouble();
                                saldo = saldo + dep;
                                System.out.printf("Deposito realizado, salto atual da conta R$: %.2f%n ", saldo);
                                extrato += "Depósito: +" + dep + "\n";
                                break;
                            case 3:
                                System.out.println("Informe o valor do saque: ");
                                double saque = entrada.nextDouble();
                                if (saque <= saldo) {
                                    saldo = saldo - saque;
                                    System.out.printf("Você sacou: %.2f%n ", saque);
                                    System.out.printf("Saldo atual da conta é de: %.2f%n ", saldo);
                                    extrato += "Saque: -" + saque + "\n";
                                } else {
                                    System.out.println("Saldo insuficiente para o saque");
                                }
                                break;
                            case 4:
                                System.out.println("Para realizar a transferencia Informe o número da conta: ");
                                String numconta = entrada.next();
                                if (!numconta.equals(conta)) {
                                    System.out.println("Invalido, inicie novamente");
                                } else {
                                    System.out.println("Informe o número da agencia: ");
                                    String numagen = entrada.next(); // Usar next() ao invés de nextLine()

                                    if (!numagen.equals(agencia)) {
                                        System.out.println("Numero da agencia invalido");
                                    } else {
                                        System.out.println("Informe o banco: ");
                                        String ban = entrada.next(); // Usar next() ao invés de nextLine()

                                        if (!ban.equals(banco)) {
                                            System.out.println("Invalido, inicie novamente");
                                        } else {
                                            System.out.println("O saldo atual é de: " + saldo);
                                            System.out.println("Informe o valor da Transferência: ");
                                            double transf = entrada.nextDouble();
                                            if (transf <= saldo) {
                                                saldo = saldo - transf;
                                                System.out.printf("transferencia de %.2f realizada com sucesso\n", transf);
                                                extrato += "Transferência: -" + transf + "\n";
                                            } else {
                                                System.out.println("Valor escolhido invalido, Inicie novamente!");
                                            }
                                        }
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Extrato: ");
                                System.out.println(extrato);
                                break;
                            case 0:
                                System.out.println("Finalizado");
                                return;
                            default:
                                System.out.println("Opção invalida");
                        }
                    } while (X != 0);
                } else {
                    System.out.println("Senha incorreta");
                }
            }
        }
    }
}
