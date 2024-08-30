/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java.past2;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex05cursoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario, senha;

        System.out.println("Insira seu nome de Usuario:");
        usuario = entrada.nextLine();

        System.out.println("Insira a Senha: ");
        senha = entrada.nextLine();

        while (usuario.equals(senha)) {
            System.out.println("A senha não pode ser igual ao nome de usuario");
            
            System.out.println("Insira a Senha novamente: ");
            senha = entrada.nextLine();
        }
        System.out.println("Nome de usuário e senha aceitos. Bem-vindo, " + usuario + "!");
    }

}
