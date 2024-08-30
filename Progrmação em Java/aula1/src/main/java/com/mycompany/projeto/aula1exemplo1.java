/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class aula1exemplo1 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, soma;
        
        System.out.printf("Informe o primeiro inteiro\n");
        numero1 = entrada.nextInt(); //lê o primeiro numero
        
        System.out.printf("Informe o segundo inteiro\n");
        numero2 = entrada.nextInt(); //lê o segundo numero
        
        soma = numero1 + numero2;
        
        System.out.printf("A soma é %d\n", soma);
    }
}
