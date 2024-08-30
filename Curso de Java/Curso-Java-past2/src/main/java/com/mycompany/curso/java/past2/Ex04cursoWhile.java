/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java.past2;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex04cursoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.err.print("Escolha o produto de sua preferencia para nossa pesquisa\n[1]Álcool\n[2]Gasolina\n[3]Diesel\n[4]PARA FINALIZAR\n");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        while (num != 4) {
            if (num == 1) {
                alcool = alcool + 1;
            } else if (num == 2) {
                gasolina = gasolina + 1;
            } else if (num == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Informe um número: ");
            num = entrada.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
