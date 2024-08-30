/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class listaEX2 { //VERIFIQUE SE UM LIVRO ESTÁ DISPONIVEL PARA EMPRESTIMO, RETORNNANDO TRUE OU FALSE 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int livrosDisponiveis = 300;

        System.out.printf("Informe quantos livros deseja emprestar: \n");
        int emprestimo = entrada.nextInt();

        boolean resultado = (emprestimo <= livrosDisponiveis);

        System.out.printf("Existe livros disponieveis para alugar? " + resultado);

    }
}
