/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Vendedor() {
        codigo = 0;
        nome = "";
        percentualComissao = 0.0;
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir(double valorVenda, double desconto) {
        double valorComissao = calcularPagamentoComissao(valorVenda, desconto);
        return String.format("-------------\nCodigo: %d\nNome: %s\nValor Venda: %.2f\nComissao: %.2f\nDesconto: %.2f\nValor a Pagar: %.2f",
                codigo, nome, valorVenda, percentualComissao, desconto, valorComissao);
    }

}
