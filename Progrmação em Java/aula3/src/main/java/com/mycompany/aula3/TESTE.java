/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class TESTE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe um numero ");
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println( "" + nome);
        }

    }
}
