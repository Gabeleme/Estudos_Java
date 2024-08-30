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
public class Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, somaIdade, qtdIdade;
        float mediaIdade;

        somaIdade = 0;
        qtdIdade = 0;

        System.out.println("Informe sua idade: [Para encerrar, digite um número negativo] ");
        idade = entrada.nextInt();

        while (idade >= 0) {
            if ((idade >= 20) && (idade <= 50)) {

                somaIdade = somaIdade + idade;
                qtdIdade = qtdIdade + 1;

            }
            System.out.println("Informe a próxima idade: [Para encerrar, digite um número negativo] ");
            idade = entrada.nextInt();
        }

        if (qtdIdade > 0) {
            mediaIdade = somaIdade / qtdIdade;
            System.out.println("A media é: " + mediaIdade);
        } else {
            System.out.println("Não há nenhuma idade na faixa de 20 a 50 anos!");
        }

    }
}
