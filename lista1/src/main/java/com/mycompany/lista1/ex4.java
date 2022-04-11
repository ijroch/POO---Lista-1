/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

/**
 *Imprima todos os múltiplos de 3, entre 1 e 100
 * @author isinhazinha
 */
public class ex4 {
    
    public static void main(String[] args) {
        int mult = 0 ;
        
        for(int i=1 ; i<100;i++){
            int resto = i%3;
            if (resto == 0){
                mult = i;
                System.out.println(mult);
            }
        
        }
    }
}
