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
public class ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pessima=0, ruim=0, boa=0, otima=0, total; 
        int N=0, p1,p2,p3,p4;
        
        while(N!=999){
            System.out.println("Digite sua avaliação de 0 a 100: ");
            N = input.nextInt();
  
            if (N>0 && N<26){
                pessima++;
            }else if(N>25 && N<51){
               ruim++;
            }else if(N>50 && N<76){
                boa++; 
            }else if(N>75 && N<=100){
                otima++; 
            }else{  
                 break;
            }
        }
        total = pessima + ruim + boa + otima; 
        p1 = (pessima*100)/total;
        p2 = (ruim*100)/total;
        p3 = (boa*100)/total;
        p4 = (otima*100)/total;
        
        System.out.println("Notas péssimas: " +p1+ "%, ruins: "+p2+ "%, boas: " +p3+ "%, e ótimas: "+p4+"%");
      
    }
}
