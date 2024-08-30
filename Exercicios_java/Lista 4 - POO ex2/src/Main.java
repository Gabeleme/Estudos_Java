
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author gabio
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int tipoDoFunc;
        int opcao;
        do {
            System.out.print("MENU\n"
                    + "1- Criar Funcionario\n"
                    + "2- Exibir Funcionario\n"
                    + "3- Sair\n");

            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("1 - Funcionario");
                    System.out.println("2 - Consultor");
                    System.out.print("Escolha uma opcao: ");
                    tipoDoFunc = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Matricula: ");
                    String matricula = entrada.nextLine();
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Salario R$: ");
                    double salario = entrada.nextDouble();

                    if (tipoDoFunc == 1) {
                        funcionarios.add(new Funcionario(matricula, nome, salario));
                    } else if (tipoDoFunc == 2) {
                        funcionarios.add(new Consultor(matricula, nome, salario));
                    } else {
                        System.out.println("Opcao invalida!");
                    }
                    break;
                case 2:
                    if (!funcionarios.isEmpty()) {
                        for (Funcionario funcionario : funcionarios) {
                            System.out.println(funcionario);
                            if (funcionario instanceof Consultor) {
                                Consultor consultor = (Consultor) funcionario;
                                 System.out.print(" - Salario com 10% de aumento: R$" + String.format("%.2f", consultor.getSalario()));
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Nenhum funcionário cadastrado");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Programa...");
                    break;
                default:
                    System.out.println("Opcao inválida!");
            }

        } while (opcao != 3);

    }
}
