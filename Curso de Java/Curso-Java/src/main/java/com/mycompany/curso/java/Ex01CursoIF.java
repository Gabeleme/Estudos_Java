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
public class Ex01CursoIF { //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        int num = entrada.nextInt();

        if (num > 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");

        }

    }

}
