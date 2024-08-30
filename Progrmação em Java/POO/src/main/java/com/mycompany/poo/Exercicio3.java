/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salario base: ");
        double SalBase = entrada.nextDouble();

        System.out.print("Informe a Gratificação:  ");
        double Gratif = entrada.nextDouble();

        double SalBruto = SalBase + Gratif;
        double ir;
        if (SalBruto < 1000) {
            ir = SalBruto * (15.0 / 100.0);

        } else {
            ir = SalBruto * (20.0 / 100.0);

        }
        double salaLiq = SalBruto - ir;
        System.out.printf("O valor do salario liquido: R$ %.2f\n", salaLiq);
    }
}
