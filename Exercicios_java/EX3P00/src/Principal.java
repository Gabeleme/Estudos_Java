

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

   private static Scanner scanner;
    private static Funcionarios lista;
    

    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        lista = new Funcionarios();
        
        int opcao;
        
        do {
            System.out.println();
            System.out.println("***** Menu: ******");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Listar Funcionarios");
            System.out.println("3. Detalhar Funcionario");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = leInteiro();
            
            if (opcao == 4) {
                System.out.println("Bye!");
                break;
            }
            
            if (opcao < 1 || opcao > 4) continue;
            
            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    detalharFuncionario();
                    break;
            }
        } while (opcao != 4);
    }
    
    private static int leInteiro() {
        int resultado = scanner.nextInt();
        scanner.nextLine();
        return resultado;
    }

    private static double leDouble() {
        double resultado = scanner.nextDouble();
        scanner.nextLine();
        return resultado;
    }

    private static String leString() {
        String resultado = scanner.nextLine();
        return resultado;
    }
    
    private static void cadastrarFuncionario() {
        Funcionario f = new Funcionario();
        System.out.print("Digite o codigo: ");
        f.setCodigo(leInteiro());
        System.out.print("Digite o nome: ");
        f.setNome(leString());
        System.out.print("Digite o setor: ");
        f.setSetor(leString());
        System.out.print("Digite a funcao: ");
        f.setFuncao(leString());
        System.out.print("Digite o salario: ");
        f.setSalario(leDouble());
        lista.adicionar(f);
        System.out.println("Novo funcionario adicionado.");
    }

    private static void listarFuncionarios() {
        System.out.println(lista.listar());
    }

    private static void detalharFuncionario() {
        System.out.print("Digite o codigo: ");
        int codigo = leInteiro();
        Funcionario f = lista.buscar(codigo);
        if (f.getCodigo() == codigo) {
            System.out.println(f.imprimir());
        } else {
            System.out.printf("Funcionario com codigo %d nao encontrado.\n", codigo);
        }        
    }
}



