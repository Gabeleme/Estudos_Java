/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class ExTXTif {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um número de 1 a 7:");
        int x = entrada.nextInt();
        String dia;
        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terca";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor invalido";
        }
        System.out.println("Dia da semana: " + dia);
    }
}
