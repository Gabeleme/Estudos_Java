/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Atividade9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int quant_num = sc.nextInt();

        int[] V = new int[quant_num];

        for (int i = 0; i < quant_num; i++) {
            System.out.print("Digite um número: ");
            V[i] = sc.nextInt();
        }

        double soma = 0.0;
        int contPares = 0;

        for (int i = 0; i < quant_num; i++) {
            if (V[i] % 2 == 0) { // Verifica se o número é par
                soma += V[i];
                contPares++;
            }
        }

        if (contPares > 0) {
            double media = soma / contPares;
            System.out.printf("Média dos números pares = %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
