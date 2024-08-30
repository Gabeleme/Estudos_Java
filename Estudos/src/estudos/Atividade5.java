/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números vai digitar: ");
        int n = sc.nextInt();

        int[] V = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            V[i] = sc.nextInt();
        }
        
        int quantidade_pares = 0; 
        for (int i = 0; i < 0; i++) {
            if (V[i] % 2 == 0) {
                System.out.println("Números Pares: " + V[i]);
                quantidade_pares++; 

            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantidade_pares);

    }
}
