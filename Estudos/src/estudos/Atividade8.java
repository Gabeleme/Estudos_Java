/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int quant_num = sc.nextInt();

        double [] V = new double [quant_num];

        
        for (int i = 0; i < quant_num; i++) {
            System.out.print("Digite um Numero: ");
            V[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < quant_num; i++) {
            soma += V[i];
        }
        double media = soma / quant_num;

        System.out.printf("Média do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < quant_num; i++) {
            if (V[i] < media) {
                System.out.printf("%.1f%n", V[i]);
            }

        }
    }
}
