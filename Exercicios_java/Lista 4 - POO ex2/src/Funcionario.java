/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Funcionario {
    
    private String matricula; 
    private String nome; 
    private double salario; 
    
    public Funcionario(){
        
    }
    public Funcionario (String matricula, String nome, double salario){
        this.matricula = matricula; 
        this.nome = nome; 
        this.salario = salario; 
    }
    public double getSalario() {
        return salario;
    }
    public String toString() {
        return "Matricula: " + matricula + ", Nome: " + nome + ", Salario: R$" + String.format("%.2f", salario);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
