/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class ExLista05 {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(100) + 1;
        boolean acerto = false;
        Scanner entrada = new Scanner(System.in);
       //System.out.println("O número teste é " + numAleatorio); // código apenas para teste ativar quando precisar 

        System.out.println("JOGO DA ADIVINHA, TENTE ADIVINHAR UM NÚMERO DE 0 A 100 (caso queira sair digite 101) ");
        while (!acerto) {
            System.out.println("Digite seu palpite: ");
            int palpite = entrada.nextInt();

            if (palpite == 101) {
                System.out.println("Você saiu do jogo, obrigada por participar!");
                break;
            } else if (palpite < numAleatorio) {
                System.out.println("Tente um número maior");
            } else if (palpite > numAleatorio) {
                System.out.println("Tente um número menor");
            } else {
                acerto = true;
                System.out.println("Você acertou o número era: " + numAleatorio);
            }

        }
    }
}
