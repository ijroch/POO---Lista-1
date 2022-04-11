/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 * Escreva um programa que efetue a leitura de três valores reais R, S e T, 
 * imprimindo qual deles é o maior
 * @author isinhazinha
 */
public class ex2 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int R, S, T, maior=0; 
       
       System.out.println("Digite 3 valores reais");
       R = input.nextInt(); 
       S = input.nextInt(); 
       T = input.nextInt(); 
       
       if(R>=S && R>=T){
           maior = R;
       }else if (R<=S && S>=T){
           maior = S;
       }else
           maior = T;
       
      System.out.println("O maior é " + maior);
   }
}
