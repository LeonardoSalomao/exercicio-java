
package com.mycompany.listaum;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String leitorNome = leitor.nextLine();
        
        System.out.println("Insira a primeira nota:");
        Float leitorNota1 = leitor.nextFloat();
        
        System.out.println("Insira a segunda nota:");
        Float leitorNota2 = leitor.nextFloat();
        
        Float media = (leitorNota1 + leitorNota2) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", 
                leitorNome, media));
        
    }
}
