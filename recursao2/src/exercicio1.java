/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class exercicio1 {
    public static void main(String[] args) {
        System.out.print("Valor: ");
        decimaltobinario(10); 
        System.out.println("");
    }
    
    public static void decimaltobinario(int n){
        if(n <= 2){
            System.out.print(n / 2);
            System.out.print(n % 2);
            
        }else{
            decimaltobinario(n / 2);
            System.out.print(n % 2);
        }
    }
}
