
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabio
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vendedor vendedor = null;
        double percentualComissao = 0; 
        int opcao;

        do {
            System.out.print("\n---------------------------\n"
                    + "MENU:\n"
                    + "1-Cadastrar Vendedor \n"
                    + "2-Calcular Comissao\n"
                    + "3-Calcular Comissao com percentual\n"
                    + "4-Sair\n"
                    + "---------------------------\n"
                    + "Escolha uma das opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo do vendedor: ");
                    int codigo = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite o nome do vendedor: ");
                    String nome = entrada.nextLine();
                    System.out.print("Digite o percentual de comissao: ");
                    percentualComissao = entrada.nextDouble();
                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    break;
                case 2:
                    if (vendedor == null) {
                        System.out.println("Nenhum vendedor cadastrado, escolha a outra opcao e cadastre!");
                    } else {
                        System.out.print("Digite o valor da venda: ");
                        double valorVenda = entrada.nextDouble();
                        System.out.print("Digite o valor do desconto: ");
                        double desconto = entrada.nextDouble();
                        System.out.println(vendedor.imprimir(valorVenda, desconto));
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor da venda:");
                    double valorVenda = entrada.nextDouble();
                    System.out.print("Digite o valor do desconto: ");
                    double desconto = entrada.nextDouble();
                    double comissao = vendedor.calcularPagamentoComissao(valorVenda, desconto, percentualComissao); 
                    System.out.print("Comissao com percentual: " + comissao); 
                    break;
                case 4:
                    System.out.println("Saindo do Programa");
                    break;
                default:
                    System.out.println("Opçao inválida. ");
            }

        } while (opcao != 4);
    }
}
