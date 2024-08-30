/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursao2;

/**
 *
 * @author gabio
 */
public class Recursao2 {

    
    public static void main(String[] args) {
        System.out.println(fatorial(4)); 
    }
    public static int fatorial(int n){
        if (n == 0){
            return 1; 
        }else{
            return n * fatorial(n - 1); 
        }
    }
}
