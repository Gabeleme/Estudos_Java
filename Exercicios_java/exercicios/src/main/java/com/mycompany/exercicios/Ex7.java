/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex7 {
     public static void main(String[] args) {
        
         boolean temPermissaoLeitura = false;
        boolean tempermissaoEscrita = false;
        
        boolean acessoLerEscrever = temPermissaoLeitura || tempermissaoEscrita;
        
        System.out.print("Usuário tem acesso de leitura ou escrita: " + acessoLerEscrever);
        
        
        
    }
}
