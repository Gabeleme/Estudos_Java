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
public class listaEX5 { //CALCULE O VALOR MÉDIO DE 3 NUMEROS DECIMAIS E EXIBA O RESULTADO COM DUAS CASAS DECIMAIS 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, numero3, media;

        System.out.printf("Informe o Primeiro valor Decimal \n");
        numero1 = entrada.nextDouble();

        System.out.printf("Informe o Segundo valor Decimal \n");
        numero2 = entrada.nextDouble();

        System.out.printf("Informe o Terceiro valor Decimal \n");
        numero3 = entrada.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A média é %.2f \n", media);
    }

}
