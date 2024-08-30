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
public class ExLista03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double primeiro = entrada.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double segundo = entrada.nextDouble();
        System.out.println("Informe qual operação matematica deseja\n [1] adição\n [2] subtração\n [3] multiplicação\n [4] divisão");
        int N = entrada.nextInt();

        double resultado;
        switch (N) {
            case 1:
                resultado = primeiro + segundo;
                break;
            case 2:
                resultado = primeiro - segundo;
                break;
            case 3:
                resultado = primeiro * segundo;
                break;
            case 4:
                resultado = primeiro / segundo;
                break;
            default:
                System.out.println("Opção invalida");
                return;
               
        }
        System.out.println("O resultado é: " + resultado);
    }
}
