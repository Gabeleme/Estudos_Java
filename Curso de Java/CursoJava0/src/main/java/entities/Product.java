/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gabio
 */
public class Product {

    public String nome;
    public double preço;
    public int quantidade;

    public double totalvalornoestoque() {
        return preço * quantidade;
    }

    public void adcionarproduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeprodutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", R$: " + String.format("%.2f", preço) + ", " + quantidade + " unidade, Total: R$: "
                + String.format("%.2f", totalvalornoestoque());
    }
}
