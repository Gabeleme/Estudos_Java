/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores inteiros deseja informar: ");
        int n = sc.nextInt();

        int[] V = new int[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número: ");
            V[i] = sc.nextInt();
            soma += V[i];
        }
        double media = soma / n;
        for (int i = 0; i < n; i++) {
            System.out.println("Valores: " + V[i]);
        }

        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Média: %.2f%n", media);

    }

}
