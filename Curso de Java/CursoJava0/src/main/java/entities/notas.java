/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author gabio
 */
public class notas {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notafinal() {
        return nota1 + nota2 + nota3;
    }

    public double faltanota() {
        if (notafinal() < 60) {
            return 60 - notafinal();
        } else {
            return 0; 
        }
    }
}
