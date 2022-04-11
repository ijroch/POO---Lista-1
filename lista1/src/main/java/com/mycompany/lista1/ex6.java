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
public class ex6 {
    public static void main(String[] arg){
         int[] fibo = new int[1000];
         fibo [0] = 0;
         fibo[1]= 1; 
         int i=1; 
         
         System.out.println(fibo[0]);
         System.out.println(fibo[1]);
         
         while (fibo[i]<100){
             i++;
            fibo[i] = fibo[i-1] + fibo[i-2];
            
           if (fibo[i]<100){
             System.out.println(fibo[i]);
           }
         }
        
    }
}
