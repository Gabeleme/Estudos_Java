/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladia05;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;

        System.out.println("Informe o primeiro nome: ");
        nome = entrada.next();

        while (!nome.equals("Fim")) {
            System.out.println("Olá" + nome + ", como vai?");

            System.out.println("Informe o proximo nome: ");
            nome = entrada.next();
        }
        System.out.println("Não há mais ninguém? Então tchau");
    }
}
