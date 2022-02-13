
package com.mycompany.listaum;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        
        Scanner leitorZero = new Scanner (System.in);
        Scanner leitorQuatro = new Scanner (System.in);
        Scanner leitorDezessete = new Scanner (System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer quantidadeFilhosZero = leitorZero.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Integer quantidadeFilhosQuatro = leitorQuatro.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Integer quantidadeFilhosDezessete = leitorDezessete.nextInt();
            
            Double somaValorZero = 25.12 * quantidadeFilhosZero;
            Double somaValorQuatro = 15.88 * quantidadeFilhosQuatro;
            Double somaValorDezessete = 12.44 * quantidadeFilhosDezessete;
            Double somaTotalValor = somaValorZero + somaValorQuatro + somaValorDezessete;
            Integer somaTotalFilhos = quantidadeFilhosZero + quantidadeFilhosQuatro + quantidadeFilhosDezessete;
            
            System.out.println(String.format("Você tem %d filhos e vai receber"
                    + " R$ %.2f de bolsa",
                    somaTotalFilhos, somaTotalValor));
    }
}
