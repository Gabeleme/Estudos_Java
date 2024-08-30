
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabio
 */
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        int opcao;
        Vendedor vendedor;
        do {
            System.out.print("----------\n"
                    + "MENU\n"
                    + "1- Adicionar Vendedor\n"
                    + "2- Listar Vendedor\n"
                    + "3- Consultar vendedor pelo Codigo\n"
                    + "4- Sair\n"
                    + "---------\n");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            if (opcao < 1 || opcao > 4) {
                continue;
            }
            if (opcao == 4) {
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo: ");
                    int codigo = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a funcao: ");
                    String funcao = entrada.nextLine();
                    System.out.print("Digite o salario: ");
                    double salario = entrada.nextDouble();
                    entrada.nextLine();
                    vendedor = new Vendedor(codigo, nome, funcao, salario);
                    vendedores.add(vendedor);
                    System.out.println("\nVendedor cadastrado com sucesso.\n");
                    break;
                case 2:
                    if (vendedores.isEmpty()) {
                        System.out.println("\nNenhum vendedor cadastrado.\n");
                    } else {
                        for (int i = 0; i < vendedores.size(); i++) {
                            vendedor = vendedores.get(i);
                            System.out.println("\n" + vendedor.imprimir() + "\n");
                        }
                    }
                    break;
                case 3:
                    if (vendedores.isEmpty()) {
                        System.out.println("\nNenhum vendedor cadastrado.\n");
                    } else {
                        System.out.print("Digite o codigo para pesquisar: ");
                        codigo = entrada.nextInt();
                        entrada.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < vendedores.size(); i++) {
                            vendedor = vendedores.get(i);
                            if (vendedor.getCodigo() == codigo) {
                                encontrado = true;
                                System.out.println("\n" + vendedor.imprimir() + "\n");
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.printf("\nNao existe vendedor com o codigo %d.\n", codigo);
                        }
                    }
                    break;
            }
        } while (opcao != 4);
    }
}
