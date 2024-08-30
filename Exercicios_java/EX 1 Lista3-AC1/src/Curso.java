
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author gabio
 */
public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();

    }

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int index) {
        alunos.remove(index);
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome + "\nCarga Horária: " + cargaHoraria;
    }

    public String imprimirCompleto() {
        String info = imprimir() + "\nAlunos:\n";
        for (Aluno aluno : alunos) {
            info += aluno.imprimir() + "\n";
        }
        return info;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
