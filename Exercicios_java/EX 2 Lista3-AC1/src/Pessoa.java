
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author gabio
 */
public class Pessoa {

    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.automoveis = new ArrayList<>();
    }

    public void inserirAutomovel(Automovel automovel) {
       this.automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        if (index >= 0 && index < automoveis.size()) {
            automoveis.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome + "\nautomovel" + automoveis;
    }

    public String imprimirCompleto() {
        String info = imprimir() + "\nAutomóveis:\n";
        for (Automovel automovel : automoveis) {
            info += automovel.imprimir() + "\n"; 
        }
        return info;
    }

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
    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

}
