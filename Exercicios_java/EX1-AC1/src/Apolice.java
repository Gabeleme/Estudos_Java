/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public Apolice() {
        numero = 0;
        nome = "";
        idade = 0;
        sexo = ' ';
        valorAutomovel = 0.0;
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == 'M' & idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if (sexo == 'M' & idade > 25) {
            return valorAutomovel * 5 / 100;

        } else if (sexo == 'F') {
            return valorAutomovel * 2 / 100;
        } else {
            return 0;
        }
    }

    public String Imprimir() {
        double valorApolice = calcularValor();
        String resposta
                = String.format("Numero = %d", numero) + "\n"
                + String.format("Nome = %s", nome) + "\n"
                + String.format("Idade = %d", idade) + "\n"
                + String.format("Sexo = %c", sexo) + "\n"
                + String.format("valor Automovel = %.2f", valorAutomovel) + "\n"
                + String.format("Valor apolice = %.2f", calcularValor());
        return resposta;

    }

}
