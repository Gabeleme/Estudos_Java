/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author gabio
 */
public class ex003 {

    public static void main(String[] args) {

        double fahrenheit = 0;

        for (int celcius = 0; celcius <= 40; celcius++) {
            fahrenheit = Math.round(celcius * 1.8 + 32);
            System.out.println(celcius + " <=> " + fahrenheit);

        }
    }
}
