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
public class ExLista02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        int V = entrada.nextInt();

        int soma = 0;
        int res;

        for (int i = 1; i <= V; i++) {
            System.out.println("Insira um valor: ");
            int X = entrada.nextInt();
            soma = soma + X;

        }
        res = soma / V;
        System.out.println("A soma das médias foram: " + res);
    }
}
