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
public class ex002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a tabuada que deseja: ");
        int tabuada = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }

    }
}
