/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int quant_num = sc.nextInt();

        int[] vetorA = new int[quant_num];
        int[] vetorB = new int[quant_num];
        int[] vetorC = new int[quant_num];

        System.out.println("informe os valores do Vetor A: ");
        for (int i = 0; i < quant_num; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("informe os valores do Vetor A: ");
        for (int i = 0; i < quant_num; i++) {
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < quant_num; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("A soma dos vetores: ");
        for (int i = 0; i < quant_num; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }

    }
}
