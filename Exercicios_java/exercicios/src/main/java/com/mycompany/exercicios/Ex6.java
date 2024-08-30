/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex6 {
     public static void main(String[] args) {
        int idadeCliente = 17;
        double valorCompra = 49.0;
        
        boolean elegivelDesconto = idadeCliente >= 18 && valorCompra >= 50;
        
        System.out.print("O cliente é elegivel para desconto: " + elegivelDesconto);
    }
}
