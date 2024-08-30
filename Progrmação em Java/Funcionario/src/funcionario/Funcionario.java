/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author gabio
 */
public class Funcionario {

    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    public void setcracha(int cracha) {
         this.Cracha = cracha;
    }

    public int getcracha() {
        return Cracha;
    }

    public void setnome(String nome) {
         this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setTipoVinculo(char tipoVinculo) {
         this.TipoVinculo = tipoVinculo;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setValorHora(float valorhora) {
         this.ValorHora = valorhora;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setQtdeHora(float qtdehora) {
         this.QtdeHora = qtdehora;
    }

    public float getQtdehoras() {
        return QtdeHora;
    }

    public void setSalario(float salario) {
         this.Salario = salario;
    }

    public float getSalario() {
        return Salario;
    }

    public void setValordesconto(float valordesconto) {
        this.ValorDesconto = valordesconto;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public float calcularValorSalario() {
        if (TipoVinculo == 'H') {
            return ValorHora * QtdeHora - ValorDesconto;
        } else {
            return Salario - ValorDesconto;
        }
    }

    public String imprimir() {
        float salarioFinal = calcularValorSalario();
        return "Crachá: " + Cracha
                + "\nNome: " + Nome
                + "\nTipo Vínculo: " + TipoVinculo
                + "\nSalário: " + (TipoVinculo == 'H' ? (ValorHora * QtdeHora) : Salario)
                + "\nDesconto: " + ValorDesconto
                + "\nValor a receber: " + salarioFinal;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu\n"
                    + "1- Criar Funcionário\n"
                    + "2- Mostrar Folha de Pagamento\n"
                    + "3- Alterar Rrmuneração\n"
                    + "4- Sair"));
            switch (opcao) {
                case 1:
                    funcionario.setcracha(Integer.parseInt(JOptionPane.showInputDialog("Crachá: ")));
                    funcionario.setnome(JOptionPane.showInputDialog("Nome "));
                    funcionario.setTipoVinculo(JOptionPane.showInputDialog("Tipo de Vínculo (H para Horista, S para Salário Fixo): ").charAt(0));
                    funcionario.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor Hora/Salário: ")));
                    if (funcionario.getTipoVinculo() == 'H') {
                        funcionario.setQtdeHora(Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Horas: ")));
                    } else {
                        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salário: ")));
                    }
                    funcionario.setValordesconto(Float.parseFloat(JOptionPane.showInputDialog("Desconto: ")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    break;
                case 3:
                    if (funcionario.getTipoVinculo() == 'H') {
                        funcionario.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Informe o novo valor do salário por hora: ")));
                        funcionario.setQtdeHora(Float.parseFloat(JOptionPane.showInputDialog("Informe a nova quantidade de horas: ")));
                    } else {
                        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Informe o novo salário: ")));
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 4);

    }
}
