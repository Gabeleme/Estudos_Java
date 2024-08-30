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
public class listaEX9 { //FAÇA UM PROGRAMA QUE CALCULE O IMC

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.printf("Informe seu peso em (kg): \n");
        peso = entrada.nextDouble();

        System.out.printf("Informe sua altura em (M): \n");
        altura = entrada.nextDouble();

        imc = (peso / (altura * altura));

        System.out.printf("o seu IMC é %.2f\n", imc);

    }

}
