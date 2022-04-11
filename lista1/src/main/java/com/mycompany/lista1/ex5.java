/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**Escreva um programa recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!). 
 * Se não for possível calcular o fatorial a função deve imprimir uma mensagem e retornar o valor -1.
 *
 *             for(int i=(int) N; i>1; i--){
                N = i*(i-1);
                * 
                * while(N>1){
                fatorial = fatorial*(N-1);
                N--;
            }
        }
 * @author isinhazinha
 */
public class ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double N; 
        
        
        System.out.println("Digite um inteiro");
        N = input.nextDouble();
  
        if (N>0){
             for(int i=(int) N; i>1; i--){
                N = N*(i-1);
            }
        System.out.println(N);
        }else{
            System.out.println("-1");
        }
    }
}
    
