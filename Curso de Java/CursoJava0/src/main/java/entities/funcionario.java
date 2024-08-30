/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gabio
 */
public class funcionario {

    public String nome;
    public double salariobruto;
    public double imposto;

    public double salarioliquido() {
        return salariobruto - imposto;
    }

    public void incrementarsalario(double porcentagem) {
        salariobruto += salariobruto * porcentagem / 100;
    }
    
    public String toString(){
    return nome + ", R$: " + String.format("%.2f", salarioliquido()); 
    }
}
