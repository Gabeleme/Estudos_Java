/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura.de.dados;

/**
 *
 * @author gabio
 */
public class Vetor {

    public static void main(String[] args) {
        int V[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < 8; i++) {
            System.out.println(V[i]);
        }
        System.out.println("=============");
        inverteVetor(V);

    }

    public static void inverteVetor(int V[]) {
        int aux[] = new int[8];
        for (int i = 0; i < 8; i++) {
            aux[i] = V[7 - i];
            System.out.println(aux[i]);
        }
    }
}
