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
public class listaEX3 { //CALCULE A MÉDIA DE TRES NÚMEROS INTEIROS E DETERMINE SE A MEDIA É UM NÚMERO IMPAR 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, mediaf;

        System.out.printf("Digite o primeiro valor inteiro: \n");
        numero1 = entrada.nextInt();

        System.out.printf("Digite o segundo valor inteiro: \n");
        numero2 = entrada.nextInt();

        System.out.printf("Digite o terceiro valor inteiro: \n");
        numero3 = entrada.nextInt();

        mediaf = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A media final é %d \n", mediaf);

        boolean resultado = (mediaf % 2 != 0);
        System.out.printf("A média final é um número Impar? " + resultado);

    }
}
