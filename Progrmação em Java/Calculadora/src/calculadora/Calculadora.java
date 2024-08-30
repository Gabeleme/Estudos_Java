/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author gabio
 */
public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public int sdivisao(int num1, int num2) {
        return num1 / num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int opcao;
        
        do {
            String input = JOptionPane.showInputDialog(null,
                    "Menu:\n"
                    + "1 - Somar\n"
                    + "2 - Subtrair\n"
                    + "3 - Multiplicar\n"
                    + "4 - Dividir\n"
                    + "5 - Sair\n"
                    + "Escolha a opção desejada:");

            opcao = Integer.parseInt(input);

            if (opcao >= 1 && opcao <= 4) {
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Resultado: " + calc.soma(num1, num2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Resultado: " + calc.subtracao(num1, num2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Resultado: " + calc.multiplicacao(num1, num2));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Resultado: " + calc.divisao(num1, num2));
                        break;
                }
            } else if (opcao != 5) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        JOptionPane.showMessageDialog(null, "Encerrando o programa.");

    }
}
