/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class listaEX6 { //CALCULE A MÉDIA DE 3 NUMEROS INTEIROS E DETERMINE SE A MEDIA É MAIOR QUE 10 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, media;

        System.out.printf("Digite o primeiro valor inteiro: \n");
        numero1 = entrada.nextInt();

        System.out.printf("Digite o segundo valor inteiro: \n");
        numero2 = entrada.nextInt();

        System.out.printf("Digite o terceiro valor inteiro: \n");
        numero3 = entrada.nextInt();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A media é %d \n", media);

        boolean resultado = (media > 10);
        System.out.printf("A média é maior que 10? " + resultado);

    }
}
