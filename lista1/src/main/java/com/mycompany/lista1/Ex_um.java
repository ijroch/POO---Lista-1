/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author isinhazinha
 */
public class Ex_um {
    
     public static void main(String[] args) {
         int n = 0,contador = 0 ; 
         Scanner input = new Scanner(System.in);
         
         System.out.println("Quantos valores deseja enviar? ");
         n = input.nextInt();
         
         int[] valores = new int[n];
         
         for(int i=0; i<n; i++){
             valores[i] = input.nextInt();  
        }
        for(int i = 0; i < n; i++){ 
            if(valores[i]<0){
              contador++;
            }
        }
        
        System.out.println("tem " + contador +" número(s) negativo(s)");
    }
}
