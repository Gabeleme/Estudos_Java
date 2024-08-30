/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios02;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class ExLista01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Informe um valor inteiro:");
        int V = entrada.nextInt(); 
        
        if (V % 2 == 0 ){
        System.out.println("O valor é Par");
        }else {
        System.out.println("O valor é Impar"); 
        }
    }
}
