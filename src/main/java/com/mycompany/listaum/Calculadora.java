
package com.mycompany.listaum;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        Float leitorUm = leitorNumero.nextFloat();
        
        System.out.println("Insira outro número:");
        Float leitorDois = leitorNumero.nextFloat();
        
        Float soma = leitorUm + leitorDois;
        Float subtracao = leitorUm - leitorDois;
        Float multiplicacao = leitorUm * leitorDois;
        Float divisao = leitorUm / leitorDois;
        
        System.out.println("Resultado da soma: \n" + soma);
        System.out.println("Resultado da subtração: \n" + subtracao);
        System.out.println("Resultado da multiplicação: \n" + multiplicacao);
        System.out.println("Resultado da divisão: \n" + divisao);
    }
}
