/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;


import javax.swing.JOptionPane;

/**
 *
 * @author gabio
 */
public class Pessoa {

    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
         this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int idade) {
         this.Idade = idade;
    }

    public int getIdade() {
        return Idade;
    }

    public void setSexo(char sexo) {
         this.Sexo = sexo;
    }

    public char getSexo() {
        return Sexo;
    }

    public String imprimir() {
        return "Nome: " + Nome + "\nCPF: " + CPF + "\nSexo: " + Sexo + "\nIdade: " + Idade;
    }

    public static void main(String[] args) {
       
        Pessoa pessoa = null;

        int opcao;

        do {
            String menu = "Menu:\n"
                    + "1 - Criar pessoa\n"
                    + "2 - Mostrar Pessoa\n"
                    + "3 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    pessoa = criarPessoa();
                    break;
                case 2:
                    if (pessoa != null) {
                        JOptionPane.showMessageDialog(null, "Dados da pessoa:\n" + pessoa.imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 3);
    }

    public static Pessoa criarPessoa() {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setCPF(JOptionPane.showInputDialog("Digite o CPF da pessoa:"));
        novaPessoa.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa:"));
        novaPessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:")));
        novaPessoa.setSexo(JOptionPane.showInputDialog("Digite o sexo da pessoa (M/F):").charAt(0));
        return novaPessoa;
    }
}
