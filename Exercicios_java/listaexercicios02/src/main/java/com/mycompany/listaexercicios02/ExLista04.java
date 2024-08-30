/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios02;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class ExLista04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
          System.out.println("Informe um valor inteiro: ");
        int V = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(V + " X " + i + " = " + V * i);
        }
    }
}
