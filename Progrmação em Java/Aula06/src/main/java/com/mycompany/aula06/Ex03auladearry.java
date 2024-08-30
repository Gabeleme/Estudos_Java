/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author gabio
 */
public class Ex03auladearry {
    public static void main(String[] args) {
        String mes [] = {"Janeiro", "Fevereiro", "março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        int diaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < 12; i++){
            System.out.printf("%s, tem %d dias. \n", mes[i], diaMes[i]);
        }
        
    }
}
