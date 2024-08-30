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
public class Ex002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome, nomeMaior, tipo, tipoMaior;
        float preco, precoMaior;

        precoMaior = -1;
        nomeMaior = "";
        tipoMaior = "";

        do {
            System.out.println("Digite o nome do vinho");
            nome = entrada.next();

            System.out.println("Digite o preço do vinho");
            preco = entrada.nextFloat();

            System.out.println("Digite o tipo do vinho");
            tipo = entrada.next();

            if ((preco > precoMaior) && (!nome.equals("fim"))) {
                nomeMaior = nome;
                precoMaior = preco;
                tipoMaior = tipo;
            }
        } while (!nome.equals("fim"));
        if (precoMaior == -1) {
            System.out.println("Nenhum vinho foi apresentado");
        } else {
            System.out.println("Vinho mais caro: " + nomeMaior + ", R$ " + precoMaior + ", tipo " + tipoMaior);
        }
    }
}
