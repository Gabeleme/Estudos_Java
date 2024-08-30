
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
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        int opcao;

        do {
            System.out.print("----------\n"
                    + "MENU\n"
                    + "1- Criar Curso\n"
                    + "2- Criar Aluno\n"
                    + "3- Remover Aluno\n"
                    + "4- Mostrar todos os Cursos\n"
                    + "5- Mostrar alunos do Curso\n"
                    + "6- Sair\n"
                    + "---------\n");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    criarCurso(entrada, cursos);
                    break;
                case 2:
                    criarAluno(entrada, cursos);
                    break;
                case 3:
                    removerAluno(entrada, cursos);
                    break;
                case 4:
                    mostrarTodosCursos(cursos);
                    break;
                case 5:
                    mostrarAlunosDoCurso(entrada, cursos);
                    break;
                case 6:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opcaoo digitada é invalida");
            }
        } while (opcao != 6);
    }

    private static void criarCurso(Scanner entrada, ArrayList<Curso> cursos) {
        System.out.print("---------\nDigite o codigo do curso: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o nome do curso: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a carga horaria do curso: ");
        int cargaHoraria = entrada.nextInt();
        entrada.nextLine();

        Curso curso = new Curso(codigo, nome, cargaHoraria);
        cursos.add(curso);
        System.out.println("Curso criado com sucesso.");
    }

    private static void criarAluno(Scanner entrada, ArrayList<Curso> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("Não há cursos cadastrados.");
            return;
        }

        System.out.println("Escolha o curso para o aluno:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + " - " + cursos.get(i).getNome());
        }
        System.out.print("Escolha o curso (numero): ");
        int cursoIndex = entrada.nextInt() - 1;

        if (cursoIndex < 0 || cursoIndex >= cursos.size()) {
            System.out.println("Curso inválido.");
            return;
        }

        System.out.print("Digite o RA do aluno: ");
        String ra = entrada.next();
        entrada.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        Aluno aluno = new Aluno(ra, nome);
        cursos.get(cursoIndex).inserirAluno(aluno);
        System.out.println("Aluno cadastrado no curso com sucesso.");
    }

    public static void removerAluno(Scanner entrada, ArrayList<Curso> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("Não há cursos cadastrados.");
            return;
        }

        System.out.println("Escolha o curso:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + " - " + cursos.get(i).imprimir());
        }
        int escolhaCursoRemover = entrada.nextInt();

        if (escolhaCursoRemover < 1 || escolhaCursoRemover > cursos.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Curso cursoSelecionado = cursos.get(escolhaCursoRemover - 1);
        System.out.println(cursoSelecionado.imprimirCompleto());

        if (cursoSelecionado.getAlunos().isEmpty()) {
            System.out.println("Não há alunos cadastrados neste curso.");
            return;
        }

        System.out.print("Digite o índice do aluno a ser removido: ");
        int indiceAluno = entrada.nextInt();

        if (indiceAluno < 1 || indiceAluno > cursoSelecionado.getAlunos().size()) {
            System.out.println("Índice do aluno inválido.");
            return;
        }

        cursoSelecionado.removerAluno(indiceAluno - 1);
        System.out.println("Aluno removido do curso com sucesso.");
    }

    public static void mostrarTodosCursos(ArrayList<Curso> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("Não há cursos cadastrados.");
            return;
        }

        System.out.println("----------\nCursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.imprimir());
            System.out.println();
        }
    }

    private static void mostrarAlunosDoCurso(Scanner entrada, ArrayList<Curso> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("Não há cursos cadastrados.");
            return;
        }

        System.out.println("----------\nAlunos e Cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.imprimirCompleto());
            System.out.println();
        }
    }
}
