/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas pessoas serão digitadas: ");
        int p = sc.nextInt();

        String[] nome = new String[p];
        int[] idade = new int[p];
        double[] altura = new double[p];

        for (int i = 0; i < p; i++) {
            System.out.print("Dados das pessoas: ");
            System.out.print("Nome; ");
            nome[p] = sc.next();
            System.out.print("Idade: ");
            idade[p] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        
        int menores = 0;
        double alturatotal = 0; 
        for (int i=0; i<p; i++) {
	        if (idade[i] < 16) {
	            menores++;
	        }
	        alturatotal = alturatotal + altura[i];
	    }
        double alturamedia = alturatotal / p;
	    double percentualMenores = ((double)menores / p) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturamedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

	    for(int i=0; i<p; i++) {
	        if (idade[i] < 16) {
	        	System.out.printf("%s\n", nome[i]);
	        }
	    }


    }
}
