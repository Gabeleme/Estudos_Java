/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores inteiros deseja informar: ");
        int n = sc.nextInt();

        int[] V = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número: ");
            V[i] = sc.nextInt();
        }
        for (int i =0; i<n; i++){
            if (V[i] < 0) {
                System.out.println("O número negativo é: " + V[i]);
            }
        }
    }
}
