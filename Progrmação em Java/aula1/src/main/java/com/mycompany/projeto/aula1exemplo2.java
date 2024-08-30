/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class aula1exemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float Fihrenheit, Celcius;

        System.out.printf("Digite a temperatura em Fihrenheit\n");
        Fihrenheit = entrada.nextFloat();
        Celcius = ((Fihrenheit - 32) * 5) / 9;

        System.out.printf("A temperatura em graus Celcius è: %f\n", Celcius);
    }
}
