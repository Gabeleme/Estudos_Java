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
public class Ex04CursoIF {

    public static void main(String[] args) {
         /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
         */
        Scanner entrada = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Informe a hora de inicio: ");
        horaInicial = entrada.nextInt();

        System.out.println("Informe a hora final: ");
        horaFinal = entrada.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }

}
