
package com.mycompany.listaum;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário do produto.");
        Integer leitorUnitario = leitor.nextInt();
        
        System.out.println("Insira a quantidade vendida.");
        Integer leitorQuatidade = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente.");
        Integer leitorCliente = leitor.nextInt();
        
        Integer valorCompra = leitorUnitario * leitorQuatidade;
        Integer valorTroco = leitorCliente - valorCompra;
//        Integer valorTroco2 = valorCompra - leitorCliente;
        
        System.out.println(String.format("Seu troco será de R$%d",
                  valorTroco));
        
//        if (valorTroco > valorCompra) {
//        System.out.println(String.format("Seu troco será de R$%d",
//                valorTroco));
//            
//        }else if (valorTroco == valorCompra){
//            System.out.println("O valor pago está correto");
//        }else{
//            System.out.println(String.format("Você ainda deve R$%d",
//                valorTroco2));
//        }
    }
    
}
