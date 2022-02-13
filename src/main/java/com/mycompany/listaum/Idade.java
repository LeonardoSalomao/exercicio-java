
package com.mycompany.listaum;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String leitorNome = leitor.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", 
                leitorNome));
        Integer leitorAno = leitor.nextInt();
        
        Integer ano = 2030 - leitorAno;
        
        System.out.println(String.format("Em 2030 você terá %d anos.", 
                ano));
    }
}
