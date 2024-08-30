/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaexercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class listaEX1 { //CRIE UMA EXPRESSÃO QUE VERIFIQUE PELO MENOS 5 ASSENTOS DISPONIVEIS EM UM VOO, ESCREVA A EXPRESSÃO QUE RETORNE TRUE OU FALSE 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int assentosDisponiveis = 5;

        System.out.printf("Informe a lotação máxima do voo: \n");
        int lotmaxima = entrada.nextInt();

        System.out.printf("Informe a quantidade de assentos ocupados: \n ");
        int quantassentos = entrada.nextInt();

        boolean resultado = (lotmaxima - quantassentos) >= assentosDisponiveis;

        System.out.printf("Existe 5 assentos disponieveis? " + resultado);

    }
}
