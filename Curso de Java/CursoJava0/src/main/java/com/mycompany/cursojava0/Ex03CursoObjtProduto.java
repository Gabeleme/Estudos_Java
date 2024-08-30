/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava0;

import entities.Product;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex03CursoObjtProduto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        product.nome = entrada.nextLine();
        System.out.print("Preço: ");
        product.preço = entrada.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantidade = entrada.nextInt();

        System.out.println();
        System.out.println("Informações do produto: " + product);

        System.out.println();

        System.out.println("Entre com o número de produtos para ser adicionado ao estoque: ");
        int quantidade = entrada.nextInt();
        product.adcionarproduto(quantidade);

        System.out.println();
        System.out.println("Atualização do produto: " + product);

        System.out.println();

        System.out.println("Entre com o número de produtos para serem removidos do estoque: ");
        quantidade = entrada.nextInt();
        product.removeprodutos(quantidade);

        System.out.println();
        System.out.println("Atualização do produto: " + product);
    }
}
