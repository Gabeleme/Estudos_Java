/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class AlunoGraduacao extends Aluno {

    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
        super();
    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String toString() {
        return super.toString() + ", Ano de conclusao do ensino medio: " + anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

}
