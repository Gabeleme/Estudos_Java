/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabio
 */
public class exercicio2 {
    public static void main(String[] args) {
        System.out.println(potencia(2, 2));
    }
    public static int potencia(int base, int pot){
        if(pot == 0){
            return 1; 
        }else{
            return base * potencia(base, pot -1); 
            
        }
    }
}
