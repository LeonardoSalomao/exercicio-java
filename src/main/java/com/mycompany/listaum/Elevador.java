
package com.mycompany.listaum;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o limite de peso do elevador.");
        Float leitorLimite = leitor.nextFloat();
        
        System.out.println("Insira o limite de pessoas no elevador.");
        Integer leitorPessoas = leitor.nextInt();
        
        System.out.println("Peso da primeira pessoa:");
        Float leitorPessoa1 = leitor.nextFloat();
        
        System.out.println("Peso da segunda pessoa:");
        Float leitorPessoa2 = leitor.nextFloat();
        
        System.out.println("Peso da terceira pessoa:");
        Float leitorPessoa3 = leitor.nextFloat();
        
        Float pesoTotal = leitorPessoa1 + leitorPessoa2 + leitorPessoa3;
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas."
                + "\nO peso total no elevador é de %.2f, sendo que ele suporta %.0f.", 
                leitorPessoas, pesoTotal, leitorLimite));
    }
}
