
package com.mycompany.listaum;

import java.util.Scanner;

public class ExercicioTres {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Quantos minutos você passou se aquecendo?");
            Integer leitorAquecimento = leitor.nextInt();
            
            System.out.println("Quantos minutos você gastou em exercícios aeróbicos?");
            Integer leitorAerobico = leitor.nextInt();
            
            System.out.println("Quantos minutos você gastos na musculação?");
            Integer leitorMusculacao = leitor.nextInt();
            
            Integer somaAquecimento = leitorAquecimento * 12;
            Integer somaAerobico = leitorAerobico * 20;
            Integer somaMusculacao = leitorMusculacao * 25;
            Integer somaTotal = somaAquecimento + somaAerobico + somaMusculacao;
            Integer somaMinutos = leitorAquecimento + leitorAerobico + leitorMusculacao;
            
            System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de "
                    + "exercícios e perdeu cerca de %d calorias.", 
                    somaMinutos, somaTotal));
    }
}
