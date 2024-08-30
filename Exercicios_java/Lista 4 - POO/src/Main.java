
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
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        int tipoDoAluno;
        int opcao;
        do {
            System.out.print( "MENU\n"
                    + "1- Inserir Aluno\n"
                    + "2- Exibir Aluno\n"
                    + "3- Sair\n");
            
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            if (opcao < 1 || opcao > 3) {
                continue;
            }
            if (opcao == 3) {
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Inserir Aluno");
                    System.out.println("1 - Graduacao");
                    System.out.println("2 - P0s-Graduacao");
                    System.out.print("Escolha uma opcao: ");
                    tipoDoAluno = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("RA: ");
                    String ra = entrada.nextLine();
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Curso: ");
                    String curso = entrada.nextLine();

                    if (tipoDoAluno == 1) {
                        System.out.print("Informe o ano de conclusao do Ensino Medio: ");
                        String anoConclusaoEnsinoMedio = entrada.nextLine();
                        AlunoGraduacao alunoGrad = new AlunoGraduacao(ra, nome, curso, anoConclusaoEnsinoMedio);
                        listaAluno.add(alunoGrad);
                    } else if (tipoDoAluno == 2) {
                        System.out.print("Ano de conclusao da graduacao: ");
                        String anoConclusaoGraduacao = entrada.nextLine();
                        AlunoPosGraduacao alunoPosGrad = new AlunoPosGraduacao(ra, nome, curso, anoConclusaoGraduacao);
                        listaAluno.add(alunoPosGrad);
                    } else {
                        System.out.println("Opcao invalida!");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Alunos:");
                    for (Aluno aluno : listaAluno) {
                        System.out.println(aluno);
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
