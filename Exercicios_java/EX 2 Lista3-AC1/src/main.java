
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
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;
        do {
            System.out.print("----------\n"
                    + "MENU\n"
                    + "1- Criar Pessoa\n"
                    + "2- Criar Automovel\n"
                    + "3- Transferir Automovel\n"
                    + "4- Mostrar todas as Pessoas\n"
                    + "5- Mostrar automovel da Pessoa\n"
                    + "6- Sair\n"
                    + "---------\n");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    criarPessoa(entrada, pessoas);
                    break;
                case 2:
                    criarAutomovel(entrada, pessoas);
                    break;
                case 3:
                    transferirAutomovel(entrada, pessoas);
                    break;
                case 4:
                    mostrarTodasAsPessoas(pessoas);
                    break;
                case 5:
                    mostrarAutomovelDaPessoa(entrada, pessoas);
                    break;
                case 6:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opcaoo digitada é invalida");
            }
        } while (opcao != 6);
    }

    private static void criarPessoa(Scanner entrada, ArrayList<Pessoa> pessoas) {
        System.out.print("Digite o codigo: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        Pessoa pessoa = new Pessoa(codigo, nome);
        pessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso.");
    }

    private static void criarAutomovel(Scanner entrada, ArrayList<Pessoa> pessoas) {
        System.out.print("Informe a marca: ");
        String marca = entrada.nextLine();
        System.out.print("Informe o modelo: ");
        String modelo = entrada.nextLine();
        Automovel automovel = new Automovel(marca, modelo);

        System.out.print("Escolha o codigo da pessoa para adicionar o automovel: ");
        int codigoAssocPessoa = entrada.nextInt();
        entrada.nextLine();

        Pessoa codPessoa = encontrarPessoa(pessoas, codigoAssocPessoa);
        if (codPessoa != null) {
            codPessoa.inserirAutomovel(automovel);
        } else {
            System.out.println("Pessoa não encontrada.");
        }

    }

    private static void transferirAutomovel(Scanner entrada, ArrayList<Pessoa> pessoas) {
        //Não soube fazer 
    }

    private static void mostrarTodasAsPessoas(ArrayList<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i).imprimir());
        }
    }

    private static void mostrarAutomovelDaPessoa(Scanner entrada, ArrayList<Pessoa> pessoas) {
        System.out.println("Selecione a pessoa:");
        mostrarTodasAsPessoas(pessoas);
        System.out.print("Escolha o número da pessoa: ");
        int pessoaIndex = entrada.nextInt();
        entrada.nextLine();

        if (pessoaIndex >= 0 && pessoaIndex < pessoas.size()) {
            Pessoa pessoa = pessoas.get(pessoaIndex);
            System.out.println("Automóveis da pessoa " + pessoa.getNome() + ":");

            ArrayList<Automovel> automoveis = pessoa.getAutomoveis();

            if (!automoveis.isEmpty()) {
                for (int i = 0; i < automoveis.size(); i++) {
                    System.out.println((i + 1) + " - " + automoveis.get(i).imprimir());
                }
            } else {
                System.out.println("Esta pessoa não possui automóveis.");
            }
        } else {
            System.out.println("Índice da pessoa inválido.");
        }
    }

    private static Pessoa encontrarPessoa(ArrayList<Pessoa> pessoas, int codigo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        return null;
    }
}
