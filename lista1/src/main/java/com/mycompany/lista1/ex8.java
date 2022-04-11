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
public class ex8 {
    public static void main(String[] arg){
         int[][] matriz = new int[1000][1000];
         int n,soma1=0, soma2=0, soma3=0;
         
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz quadrada: ");
        n = input.nextInt();
                
         for (int i = 0 ;i < n; i++){ 
            for (int j = 0; j < n; j++){ 
                System.out.println("Informe o valor: ");
                matriz[i][j] = input.nextInt();
                } 
        }
        System.out.println(""); 
        
        for( int i=0; i< n; i++) {
            for( int j=0; j < matriz[i].length; j++) {
                if(i==j){
                    soma1 += matriz[i][j];    
                }
            }
        }
        for( int i=0; i< n; i++) {
            for( int j=0; j < matriz[i].length; j++) {
                if(i==1){
                    soma2 += matriz[i][j];    
                }
            }
        }
        for( int i=0; i< n; i++) {
            for( int j=0; j < matriz[i].length; j++) {
                if(j==1){
                    soma3 += matriz[i][j];    
                }
            }
        }
        if(soma1==soma2 && soma2==soma3){
        System.out.println("É quadrado mágico.");
        } else
            System.out.println("Não é quadrado mágico.");
   /**System.out.println(soma1); System.out.println(soma2);System.out.println(soma3);*/
    }
}

/** for (int i = 0 ;i < n; i++){ 
            for (int j = 0; j < n; j++){ 
                System.out.println(matriz[i][j]);
            } 
        }    */
        

