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
public class Ex02cursoWhile { // informe a senha e veja se ela é valida ou não

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a senha:");
        int senha = entrada.nextInt();
        while (senha != 2002) {
            System.out.println("senha INVALIDA");
            System.out.println("Informe novamente a senha:");
            senha = entrada.nextInt();
        }

        System.out.println("Acesso Permitido");

    }
}
