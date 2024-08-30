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
public class listaEX4 { //VERIFIQUE SE UM NUMERO É POSSITIVO E PAR, USANDO APERADORES LÓGICOS E RELACIONAIS 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.printf("Digite o valor: \n");
        numero = entrada.nextInt();

        boolean positivo = numero > 0;
        boolean par = numero % 2 == 0;

        System.out.println("O valor é positivo? " + positivo);
        System.out.printf("O valor é par? " + par);

    }
}
