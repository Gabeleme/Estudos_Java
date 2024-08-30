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
public class complementarAC2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SEJA VEM VINDO!!");

        String cpf = "123.456.789-00";
        String senha = "01020304";
        double saldo = 1000.0;

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
                        System.out.println("ESCOLHA O QUE DESEJA REALIZAR: \n [1]Saldo \n [2]Depósito\n [3]Saque\n [0]Sair");
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
                                break;
                            case 3:
                                System.out.println("Informe o valor do saque: ");
                                double saque = entrada.nextDouble();
                                if (saque <= saldo) {
                                    saldo = saldo - saque;
                                    System.out.printf("Você sacou: %.2f%n ", saque);
                                    System.out.printf("Saldo atual da conta é de: %.2f%n ", saldo);
                                } else {
                                    System.out.println("Saldo insuficiente para o saque");
                                }
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
