/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cursojavaexmembrosestaticos;

import com.mycompany.cursojavaexmembrosestaticos.util.converter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex01CursoJava {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Qual o preço do dolar?");
        double dollarPrice = entrada.nextDouble(); 
        System.out.println("Quantos dólares serão comprados ");
        double amout = entrada.nextDouble(); 
        double result = converter.dolarToReal(amout, dollarPrice); 
        System.out.printf("Valor em Reais: %.2f%n", result);
    }
}
