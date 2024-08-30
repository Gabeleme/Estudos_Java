/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o tempo gasto (h): ");
        double tempo = entrada.nextDouble();
        System.out.print("Digite a velocidade (Km/h: ");
        double velocidade = entrada.nextDouble();
        double autonomia = 12.0;
        double distancia = tempo * velocidade;
        double consumo = distancia / autonomia;
        System.out.printf("Tempo de viagem: %.2f horas\n", tempo);
        System.out.printf("Distancia: %.2f km\n", distancia);
        System.out.printf("Velocidade Media: %.2f km/h\n", velocidade);
        System.out.printf("Consumo: %.2f litros\n", consumo);
    }
}
