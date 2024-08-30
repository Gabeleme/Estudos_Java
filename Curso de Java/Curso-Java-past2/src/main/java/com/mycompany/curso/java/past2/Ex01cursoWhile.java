/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.curso.java.past2;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex01cursoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro {para parar o programa digite 0} ");
        int valor = entrada.nextInt();

        int soma = 0;
        while (valor != 0) {
            soma += valor;
            System.out.println("Digite um valor inteiro ");
            valor = entrada.nextInt();
        }
        System.out.println(soma); 
    }
}
