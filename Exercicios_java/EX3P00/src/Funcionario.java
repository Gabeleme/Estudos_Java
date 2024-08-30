/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Funcionario {

    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;
    
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int codigo, String nome, String setor, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String imprimir() {
        String resultado =
            String.format("codigo = %d", codigo) + "\n" +
            String.format("nome = %s", nome) + "\n" +
            String.format("setor = %s", setor) + "\n" +
            String.format("função = %s", funcao) + "\n" +
            String.format("salario = %.2f", salario); 
          return resultado; 
    }

}
