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
public class Ex05CursoIF {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigoItem, quantidade;
        double total;
        System.out.print("[1]Cachorro quente\n[2]X-salada\n[3]X-bacon\n[4]Torrada simples\n[5]Refrigerante\n");

        System.out.println("Insira o Código do item: ");
        codigoItem = entrada.nextInt();

        System.out.println("Insira a quantidade de item: ");
        quantidade = entrada.nextInt();
        
        if (codigoItem == 1) {
            total = quantidade * 4.0;
        } else if (codigoItem == 2) {
            total = quantidade * 4.50;
        } else if (codigoItem == 3) {
            total = quantidade * 5.00;
        } else if (codigoItem == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
