/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class Consultor extends Funcionario {

    public Consultor(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double getSalario() {
        return super.getSalario() * 1.10;
    }

    public double getSalario(double percentual) {
        return super.getSalario() * (1 + percentual / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "(Consultor)";
    }
}
