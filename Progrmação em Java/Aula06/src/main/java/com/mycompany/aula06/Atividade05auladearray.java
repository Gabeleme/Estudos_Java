/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Atividade05auladearray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero[] = new int[10];
        int numpar[] = new int[10];
        int numimpar[] = new int[10];

        int valorpar = 0;
        int valorimpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro:");
            numero[i] = entrada.nextInt();
            if (numero[i] % 2 == 0) {
                numpar[valorpar] = numero[i];
                valorpar++;
            } else {
                numimpar[valorimpar] = numero[i];
                valorimpar++;
            }
        }
        System.out.println("Numeros Digitados: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(numero[i] + " ");
        }
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < valorpar; i++) {
            System.out.println(numpar[i] + " ");
        }
        System.out.println("Numeros impares: ");
        for (int i = 0; i < valorimpar; i++) {
            System.out.println(numimpar[i] + " ");
        }

    }
}
//EXPLICAÇÃO 
/* DECLARAMOS OS 3 VETORES E LOFO APOS DECLARAMOS DUAS VARIASVEIS, DEPOIS PEDIMOS PRO UZUARIO O NUMERO
E FAZEMOS O IF PARA QUE SE O NUMERO SEJA PAR IRA PRA VARIAVEL PAR E CASO ELE SEJA IMPAR IR PRA DO IMPAR
AO COLOCAR O NOME DO VETOR E DENTRO DO [ ] O NOME DA VARIÁVEL ESTAMOS INDICANDO QUAL POSIÇÃO O NUMERO
VAI ESTAR DENTRO DO VETOR, POR EXEMPLO O VETOR INICIA EM ZERO ENTÃO O PRIMEIRO VALOR VAI ESTAR EM ZERO, E O SEGUNDO EM UM
ENTÃO DECLARAMOS A VARIAVEL COMEÇANDO EM 0 E COLOCAMOS O ++ NA LINHA DE BAIXO PARA QUE ELE ACRESECENTE NA VARIAVEL
QUANDO O CÓDIGO RODAR TERMINAR DE RODAR E FOR RODAR NOVAMENTE, ASSIM VAI SEMPRE ACRESCENTANDO UM NA VARIAVEL E DETERMINANDO
EM QUAL POSIÇÃO ESTÁ O NUMERO DENTRO DO VETOR */
