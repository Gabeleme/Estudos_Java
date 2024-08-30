
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
        Apolice apolice = new Apolice();

        int opcao;

        do {
            System.out.println("MENU:\n"
                    + "1-Criar Apolice \n"
                    + "2-Ver dados Apolice\n"
                    + "3-Sair\n"
                    + "Escolha uma das opcao: "); 
            
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o Numero: ");
                    int numero = entrada.nextInt();
                    entrada.nextLine(); 
                    System.out.print("Informe seu Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Informe sua Idade: ");
                    int idade = entrada.nextInt();
                    System.out.print("Informe seu Sexo (F/M): ");
                    char sexo = entrada.next().charAt(0);
                    System.out.print("Valor do Automovel: ");
                    double valorAutomovel = entrada.nextDouble();
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    break;
                case 2:
                    if (apolice != null) {
                        System.out.println("\nDados da Apolice:");
                        System.out.println(apolice.Imprimir());
                    } else {
                        System.out.println("Não existe nenhuma Apolice!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }
    
}
