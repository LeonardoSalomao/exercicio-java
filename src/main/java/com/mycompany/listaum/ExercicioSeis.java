
package com.mycompany.listaum;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira seu salário bruto.");
        Double leitorSalario = leitor.nextDouble();
        
        Double inss = leitorSalario * 0.1;
        Double ir = leitorSalario * 0.2;
        
        System.out.println("Quanto custa a condução da casa ao trabalho?");
        Double leitorConducao = leitor.nextDouble();
        
        Double valorPassagem = leitorConducao * 2 * 22;
        
        Double valorDescontos = inss + ir + valorPassagem;
        
        Double salarioLiquido = leitorSalario - valorDescontos;
        
        System.out.println(String.format("Seu salário bruto é R$%.2f, "
                + "tem um total de RS%.2f em descontos e receberá "
                + "um líquido de R$%.2f", leitorSalario,
                valorDescontos.floatValue(), salarioLiquido.floatValue()));
    }
}
