/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojavaexmembrosestaticos.util;

/**
 *
 * @author gabio
 */
public class converter {

    public static double IOF = 0.06;

    public static double dolarToReal(double amont, double dollarPrice) {
        return  amont * dollarPrice * (1.0 + IOF); 
    }
}
