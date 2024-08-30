/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

import javax.swing.JOptionPane;

/**
 *
 * @author gabio
 */
public class Aluno {

    private String RA;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    private void setRA(String ra) {
         this.RA = ra;
    }

    public String getRA() {
        return RA;
    }

    public void setNome(String nome) {
         this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setAC1(float ac1) {
         this.AC1 = ac1;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC2(float ac2) {
         this.AC2 = ac2;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAG(float ag) {
         this.AG = ag;
    }

    public float getAG() {
        return AG;
    }

    public void setAF(float af) {
         this.AF = af;
    }

    public float getAF() {
        return AF;
    }

    public float calcularMedia() {
        return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (AF * 0.45f);
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String imprimir() {
        return "RA: " + RA
                + "\nnome: " + Nome
                + "\nAC1: " + AC1
                + "\nAC2: " + AC2
                + "\nAG: " + AG
                + "\nAF: " + AF
                + "\nMédia: " + calcularMedia()
                + "\nSituação: " + verificarAprovacao();
    }

    public static void main(String[] args) {
        Aluno aluno = null;
        int opcao = 0;
        while (opcao != 3) {
            String escolha = JOptionPane.showInputDialog(
                    "Menu:\n"
                    + "1- Criar Aluno\n"
                    + "2- Mostrar Aluno\n"
                    + "3- Sair");
            opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1:
                    aluno = new Aluno();
                    aluno.setRA(JOptionPane.showInputDialog("Informe o RA do Aluno: "));
                    aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno: "));
                    aluno.setAC1(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC1:")));
                    aluno.setAC2(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC2:")));
                    aluno.setAG(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AG:")));
                    aluno.setAF(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AF:")));
                    break;
                case 2:
                    if (aluno != null) {
                        JOptionPane.showInputDialog(null, aluno.imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Aluno não criado ainda.");
                        break;
                    }
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
            }
        }

    }
}
